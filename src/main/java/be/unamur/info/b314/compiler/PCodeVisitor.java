package be.unamur.info.b314.compiler;

import java.util.List;
import java.util.Map;

import be.unamur.info.b314.compiler.PCodePrinter.PCodeTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Print PCode for a given tree using provided symbol table and printer. This 
 * class uses ANTLR visitor mechanism.
 * @author Xavier Devroey - xavier.devroey@unamur.be
 */
public class PCodeVisitor extends B314BaseVisitor<Object> {

    private static final Logger LOG = LoggerFactory.getLogger(B314VisitorImpl.class);

    private final SymbolsTable symTable;

    private final PCodePrinter printer;
    private final int nEnvVars = 99;
    private int totnbVar;
    private int whenCounter = 0;
    private int ifcounter =0;
    private int whilecounter =0;
    private int printFlagAddress;

    public PCodeVisitor(SymbolsTable symTable, PCodePrinter printer) {
        this.symTable = symTable;
        this.printer = printer;
    }

    @Override 
    public Void visitProgramme(B314Parser.ProgrammeContext ctx) {
        symTable.setCurrentScopeName(SymbolsTable.GLOBAL);
        printer.printComments("Start program: "+ctx.getText());
        totnbVar = nEnvVars + 1 + symTable.getGlobalScope().getScopeMaxId()-1;
        printer.printSetStackPointer(totnbVar+1);
        initEnvironmentVariables();
        initGlobalVar();
        printer.printUnconditionalJump("begin");
        for(int i=0;i<ctx.fctDecl().size();i++){
            visitFctDecl(ctx.fctDecl(i));
        }
        printer.printDefineLabel("begin");
        for(int i=0;i<ctx.instruction().size();i++){
            visitInstruction(ctx.instruction(i));
        }
        for(int i=0;i<ctx.clauseWhen().size();i++){
            visitClauseWhen(ctx.clauseWhen(i));
        }
        visitClauseDefault(ctx.clauseDefault());
        printer.printComments("End program");
        printer.printComments("check if output done");
        printer.printLoad(PCodeTypes.Bool,0,printFlagAddress);
        printer.printFalseJump("endProg");

        printer.printLoadConstant(PCodeTypes.Int,0);
        printer.printPrin();

        printer.printDefineLabel("endProg");
        printer.printStop();
        return null;
    }

    /**
     * Define and initialize the values of the environment variables 
     *      using the user provided values 
     * ref. specification: 
     *      - section 10.1
     *      - section 5.1.2 (La signification des differentes variables)
     *      - section 5.2.2 (ennemi is...)
     *      - section 5.3.2 (nearby...)
     */
    private void initEnvironmentVariables() {
        printer.printComments("Initialize Environment Variables");

        for (int i = 0; i < nEnvVars; i++) {
            if(i >= 9 && i <= 16){
                printer.printLoadAdress(PCodeTypes.Bool, 0, i);
                printer.printRead();
                printer.printStore(PCodeTypes.Bool);
            }else {
                printer.printLoadAdress(PCodeTypes.Int, 0, i);
                printer.printRead();
                printer.printStore(PCodeTypes.Int);
            }
        }

    }

    private void initGlobalVar(){
        printer.printComments("Initialize Global Variables");
        int i;
        for (i = nEnvVars; i < totnbVar; i++) {
            String typeString = symTable.getGlobalScope().getTypeByAddressPCode(i-nEnvVars);
            PCodeTypes type = PCodeTypes.Bool;
            if(typeString.equals("boolean")){
                type = PCodeTypes.Bool;
            }else if(typeString.equals("integer")){
                type = PCodeTypes.Int;
            }else if(typeString.equals("square")){
                type = PCodeTypes.Int;
            }
            printer.printLoadAdress(type, 0, i);
            printer.printRead();
            printer.printStore(type);
        }
        printer.printLoadAdress(PCodeTypes.Bool, 0, i);
        printer.printLoadConstant(PCodeTypes.Bool,1);
        printer.printStore(PCodeTypes.Bool);
        printFlagAddress = i;
    }

    @Override
    public Void visitInstruction(B314Parser.InstructionContext ctx){
        printer.printComments("instruction "+ctx.getText());
        if(ctx.action() != null){
            visitAction(ctx.action());
        }else if(ctx.ELSE() != null){
            printer.printComments("if then else");
            visitExprBool(ctx.exprBool());
            printer.printFalseJump("if"+ifcounter);

            for(int i=0;i<ctx.getChildCount();i++) {
                if(ctx.getChild(i) instanceof B314Parser.InstructionContext) {
                    visitInstruction((B314Parser.InstructionContext)ctx.getChild(i));
                }else if(ctx.getChild(i).getText().equals("else")){
                    printer.printUnconditionalJump("endif"+ifcounter);
                    printer.printDefineLabel("if"+ifcounter);
                }
            }
            printer.printDefineLabel("endif"+ifcounter);

            ifcounter++;
        }else if(ctx.THEN() != null){
            printer.printComments("if then");
            visitExprBool(ctx.exprBool());
            printer.printFalseJump("endif"+ifcounter);

            for(int i=0;i<ctx.instruction().size();i++) {
                visitInstruction(ctx.instruction(i));
            }

            printer.printDefineLabel("endif"+ifcounter);
            ifcounter++;
        }else if(ctx.WHILE() != null){
            printer.printComments("while");
            printer.printDefineLabel("while"+whilecounter);
            visitExprBool(ctx.exprBool());
            printer.printFalseJump("endwhile"+whilecounter);
            for(int i=0;i<ctx.instruction().size();i++) {
                visitInstruction(ctx.instruction(i));
            }
            printer.printUnconditionalJump("while"+whilecounter);
            printer.printDefineLabel("endwhile"+whilecounter);

        }else if(ctx.SET() != null){

            addressExprG(ctx.exprG());
            visitExprD(ctx.exprD());

            String typeString = symTable.getIdInfo(ctx.exprG().ID().getText()).getDataType();
            PCodeTypes type= PCodeTypes.Adr;
            if(typeString.equals("boolean")){
                type = PCodeTypes.Bool;
            }else if(typeString.equals("integer")){
                type = PCodeTypes.Int;
            }else if(typeString.equals("square")){
                type = PCodeTypes.Adr;
            }

            printer.printStore(type);

        }else if (ctx.COMPUTE() != null){
            visitExprD(ctx.exprD());
            if(ctx.exprD().ID() != null ){
                if(! symTable.getGlobalScope().getVar(ctx.exprD().ID().getText()).getDataType().equals("void")) {
                    printer.printPop();
                }
            }
        }else if (ctx.SKIPINS() != null){
            printer.printLoadConstant(PCodeTypes.Int, 0);
            printPrinAndModify();
        }else {
            printer.printComments("strange");
        }

        return null;
    }

    @Override
    public Void visitAction(B314Parser.ActionContext ctx){
        printer.printComments("action "+ctx.getText());
        if(ctx.DO() != null){
            printer.printLoadConstant(PCodeTypes.Int, 0);
        }else if(ctx.MOVE() != null){
            if(ctx.NORTH() != null){
                printer.printLoadConstant(PCodeTypes.Int, 1);
            }else if(ctx.EAST() != null){
                printer.printLoadConstant(PCodeTypes.Int, 2);
            }else if(ctx.SOUTH() != null){
                printer.printLoadConstant(PCodeTypes.Int, 3);
            }else if(ctx.WEST() != null){
                printer.printLoadConstant(PCodeTypes.Int, 4);
            }
        }else if(ctx.SHOOT() != null){
            if(ctx.NORTH() != null){
                printer.printLoadConstant(PCodeTypes.Int, 5);
            }else if(ctx.EAST() != null){
                printer.printLoadConstant(PCodeTypes.Int, 6);
            }else if(ctx.SOUTH() != null){
                printer.printLoadConstant(PCodeTypes.Int, 7);
            }else if(ctx.WEST() != null){
                printer.printLoadConstant(PCodeTypes.Int, 8);
            }
        }else if(ctx.USE() != null){
            if(ctx.MAP() != null){
                printer.printLoadConstant(PCodeTypes.Int, 9);
            }else if(ctx.RADIO() != null){
                printer.printLoadConstant(PCodeTypes.Int, 10);
            }else if(ctx.FRUITS() != null){
                printer.printLoadConstant(PCodeTypes.Int, 11);
            }else if(ctx.SODA() != null){
                printer.printLoadConstant(PCodeTypes.Int, 12);
            }
        }else {
            printer.printComments("strange");
        }
        printPrinAndModify();
        return null;
    }

    private void printPrinAndModify(){
        if(symTable.getCurrentScope().getName().equals(symTable.GLOBAL)){
            printer.printLoadAdress(PCodeTypes.Bool,0,printFlagAddress);
        }else{
            printer.printLoadAdress(PCodeTypes.Bool,1,printFlagAddress);
        }
        printer.printLoadConstant(PCodeTypes.Bool,0);
        printer.printStore(PCodeTypes.Bool);
        printer.printPrin();
    }

    @Override
    public Void visitClauseDefault(B314Parser.ClauseDefaultContext ctx){
        symTable.setCurrentScopeName("_default");
        printer.printComments("default "+ctx.getText());
        printer.printMarkStack(0);
        printer.printCallUserProcedure(0,"_default"+"start");
        printer.printUnconditionalJump("_default");
        printer.printDefineLabel("_default"+"start");
        printer.printSetStackPointer(5+symTable.getScope("_default").getScopeMaxId());

        for(int i=0;i<ctx.instruction().size();i++) {
            visitInstruction(ctx.instruction(i));
        }

        printer.printReturnFromProcedure();
        printer.printDefineLabel("_default");
        symTable.setCurrentScopeName(SymbolsTable.GLOBAL);
        return null;
    }

    @Override
    public Void visitClauseWhen(B314Parser.ClauseWhenContext ctx){
        printer.printComments("when "+ctx.getText());
        visitExprBool(ctx.exprBool());
        symTable.setCurrentScopeName("_when"+whenCounter);
        printer.printFalseJump("_when"+whenCounter);
        printer.printMarkStack(0);
        printer.printCallUserProcedure(0,"_when"+whenCounter+"start");
        printer.printUnconditionalJump("_when"+whenCounter);
        printer.printDefineLabel("_when"+whenCounter+"start");
        printer.printSetStackPointer(5+symTable.getScope("_when"+whenCounter).getScopeMaxId());

        for(int i=0;i<ctx.instruction().size();i++) {
            visitInstruction(ctx.instruction(i));
        }

        printer.printReturnFromProcedure();
        printer.printDefineLabel("_when"+whenCounter);
        whenCounter++;
        symTable.setCurrentScopeName(SymbolsTable.GLOBAL);
        return null;
    }

    @Override
    public Void visitFctDecl(B314Parser.FctDeclContext ctx){
        symTable.setCurrentScopeName(ctx.ID().getText());
        printer.printComments("fct"+ctx.getText());
        printer.printDefineLabel(ctx.ID().getText());
        printer.printSetStackPointer(5+symTable.getScope(ctx.ID().getText()).getScopeMaxId());

        for(int i=0;i<ctx.instruction().size();i++) {
            visitInstruction(ctx.instruction(i));
        }

        if(ctx.exprD() != null){
            String typeString = ctx.scalar().getText();
            PCodeTypes type= PCodeTypes.Adr;
            if(typeString.equals("boolean")){
                type = PCodeTypes.Bool;
            }else if(typeString.equals("integer")){
                type = PCodeTypes.Int;
            }else if(typeString.equals("square")){
                type = PCodeTypes.Adr;
            }

            printer.printLoadAdress(type,0,0);
            visitExprD(ctx.exprD());
            printer.printStore(type);
            printer.printReturnFromFunction();
        }else{
            printer.printReturnFromProcedure();
        }
        symTable.setCurrentScopeName(symTable.GLOBAL);
        return null;
    }

    @Override
    public Void visitExprBool(B314Parser.ExprBoolContext ctx){
        printer.printComments("bool"+ctx.getText());
        if(ctx.TRUE() != null) {
            printer.printLoadConstant(PCodeTypes.Bool, 1);
        }else if(ctx.FALSE() != null) {
            printer.printLoadConstant(PCodeTypes.Bool, 0);
        }else if(ctx.IS() != null){
            int diff;
            if(symTable.getCurrentScope().getName().equals(symTable.GLOBAL)){
                diff = 0;
            }else{
                diff = 1;
            }
            if(ctx.ENNEMI() != null){
                if(ctx.NORTH() != null){
                    printer.printLoad(PCodeTypes.Bool,diff,9);
                }else if(ctx.EAST() != null){
                    printer.printLoad(PCodeTypes.Bool,diff,10);
                }else if(ctx.SOUTH() != null){
                    printer.printLoad(PCodeTypes.Bool,diff,11);
                }else if(ctx.WEST() != null){
                    printer.printLoad(PCodeTypes.Bool,diff,12);
                }
            }else if(ctx.GRAAL() != null){
                if(ctx.NORTH() != null){
                    printer.printLoad(PCodeTypes.Bool,diff,13);
                }else if(ctx.EAST() != null){
                    printer.printLoad(PCodeTypes.Bool,diff,14);
                }else if(ctx.SOUTH() != null){
                    printer.printLoad(PCodeTypes.Bool,diff,15);
                }else if(ctx.WEST() != null){
                    printer.printLoad(PCodeTypes.Bool,diff,16);
                }
            }
        }else if(ctx.NOT() != null){
            visitExprBool(ctx.exprBool(0));
            printer.printNot();
        }else if(ctx.ID() != null){
            visitFctCall(ctx.ID().getText(),ctx.exprD());
        }else if(ctx.LPAR() != null){
            visitExprBool(ctx.exprBool(0));
        }else if(ctx.exprG().size() != 0 && ctx.EQUAL() != null){
            visitExprG(ctx.exprG(0));
            visitExprG(ctx.exprG(1));
            printer.printEqualsValues(PCodeTypes.Bool);
        }else if(ctx.exprCase().size() != 0 && ctx.EQUAL() != null){
            visitExprCase(ctx.exprCase(0));
            visitExprCase(ctx.exprCase(1));
            printer.printEqualsValues(PCodeTypes.Int);
        }else if(ctx.exprEnt() != null && ctx.exprEnt().size() != 0 ){
            if(ctx.EQUAL() != null){
                visitExprEnt(ctx.exprEnt(0));
                visitExprEnt(ctx.exprEnt(1));
                printer.printEqualsValues(PCodeTypes.Int);
            }else if(ctx.SMALLER() != null){
                visitExprEnt(ctx.exprEnt(0));
                visitExprEnt(ctx.exprEnt(1));
                printer.printLess(PCodeTypes.Int);
            }else if(ctx.BIGGER() != null){
                visitExprEnt(ctx.exprEnt(0));
                visitExprEnt(ctx.exprEnt(1));
                printer.printGreather(PCodeTypes.Int);
            }
        }else if(ctx.exprBool() != null && ctx.exprBool().size() != 0){
            if(ctx.AND() != null){
                visitExprBool(ctx.exprBool(0));
                visitExprBool(ctx.exprBool(1));
                printer.printAnd();
            }else if(ctx.OR() != null){
                visitExprBool(ctx.exprBool(0));
                visitExprBool(ctx.exprBool(1));
                printer.printOr();
            }else if(ctx.BIGGER() != null){
                visitExprBool(ctx.exprBool(0));
                visitExprBool(ctx.exprBool(1));
                printer.printEqualsValues(PCodeTypes.Bool);
            }
        }else if(ctx.exprG() != null){
            visitExprG(ctx.exprG(0));
        }else {
            printer.printComments("strange");
        }
        return null;
    }

    public void visitFctCall(String id, List<B314Parser.ExprDContext> ls){
        printer.printComments("function call: "+id);
        if(symTable.getCurrentScope().getName().equals(symTable.GLOBAL)) {
            printer.printMarkStack(0);
        }else{
            printer.printMarkStack(1);
        }
        //load all arguments in top of stack
        for(int i=0;i<ls.size();i++){
            visitExprD(ls.get(i));
        }
        printer.printCallUserProcedure(ls.size(),id);
    }

    @Override
    public Void visitExprD(B314Parser.ExprDContext ctx) {
        printer.printComments("expr D: "+ctx.getText());

        if(ctx.exprG() != null){
            visitExprG(ctx.exprG());
        }else if(ctx.ID() != null){
            visitFctCall(ctx.ID().getText(),ctx.exprD());
        }else if(ctx.exprCase() != null){
            visitExprCase(ctx.exprCase());
        }else if(ctx.exprEnt() != null){
            visitExprEnt(ctx.exprEnt());
        }else if(ctx.exprD().size() != 0){
            LOG.debug(ctx.exprD().toString());
            visitExprD(ctx.exprD(0));
        }else if(ctx.exprBool() != null){
            visitExprBool(ctx.exprBool());
        }else {
            printer.printComments("strange");
        }
        return null;
    }

    @Override
    public Void visitExprEnt(B314Parser.ExprEntContext ctx) {
        printer.printComments("expr E: "+ctx.getText());
        int diff;
        if(symTable.getCurrentScope().getName().equals(symTable.GLOBAL)){
            diff = 0;
        }else{
            diff = 1;
        }
        if(ctx.INT() != null){
            if(ctx.MINUS() != null){
                printer.printLoadConstant(PCodeTypes.Int,-1*Integer.valueOf(ctx.INT().getSymbol().getText()));
            }else{
                printer.printLoadConstant(PCodeTypes.Int,Integer.valueOf(ctx.INT().getSymbol().getText()));
            }
        }else if(ctx.LATITUDE() != null){
            printer.printLoad(PCodeTypes.Int,diff,0);
        }else if(ctx.LONGITUDE() != null){
            printer.printLoad(PCodeTypes.Int,diff,1);
        }else if(ctx.GRID() != null){
            printer.printLoad(PCodeTypes.Int,diff,2);
        }else if(ctx.COUNT() != null){
            if(ctx.MAP() != null){
                printer.printLoad(PCodeTypes.Int,diff, 3);
            }else if(ctx.RADIO() != null){
                printer.printLoad(PCodeTypes.Int,diff, 4);
            }else if(ctx.AMMO() != null){
                printer.printLoad(PCodeTypes.Int,diff, 5);
            }else if(ctx.FRUITS() != null){
                printer.printLoad(PCodeTypes.Int,diff, 6);
            }else if(ctx.SODA() != null){
                printer.printLoad(PCodeTypes.Int,diff, 7);
            }
        }else if(ctx.LIFE() != null){
            printer.printLoad(PCodeTypes.Int,diff, 8);
        }else if(ctx.exprEnt().size() == 2){
            visitExprEnt(ctx.exprEnt(0));
            visitExprEnt(ctx.exprEnt(1));
            if(ctx.PLUS() != null){
                printer.printAdd(PCodeTypes.Int);
            }else if(ctx.MINUS() != null){
                printer.printSub(PCodeTypes.Int);
            }else if(ctx.MULT() != null){
                printer.printMul(PCodeTypes.Int);
            }else if(ctx.DIV() != null){
                printer.printDiv(PCodeTypes.Int);
            }else if(ctx.MODULO() != null){
                printer.printMod(PCodeTypes.Int);
            }
        }else if(ctx.ID() != null){
            visitFctCall(ctx.ID().getText(),ctx.exprD());
        }else if(ctx.exprEnt().size() == 1){
            visitExprEnt(ctx.exprEnt(0));
        }else if(ctx.exprG() != null){
            visitExprG(ctx.exprG());
        }else {
            printer.printComments("strange");
        }
        return null;
    }

    @Override
    public Void visitExprCase(B314Parser.ExprCaseContext ctx) {
        printer.printComments("expr C: "+ctx.getText());

        if(ctx.exprG() != null){
            visitExprG(ctx.exprG());
        }else if(ctx.ID() != null) {
            visitFctCall(ctx.ID().getText(), ctx.exprD());
        }else if(ctx.NEARBY() != null){
            if(symTable.getCurrentScope().getName().equals(symTable.GLOBAL))
                printer.printLoadAdress(PCodeTypes.Int,0,17);
            else
                printer.printLoadAdress(PCodeTypes.Int,1,17);

            if (ctx.exprEnt().size() == 2) {
                visitExprEnt(ctx.exprEnt(1));
                printer.printIndexedAdressComputation(9);
            }
            visitExprEnt(ctx.exprEnt(0));
            printer.printIndexedAdressComputation(1);
            printer.printIndexedFetch(PCodeTypes.Int);
        }else if(ctx.DIRT() != null){
            printer.printLoadConstant(PCodeTypes.Int,0);
        }else if(ctx.ROCK() != null){
            printer.printLoadConstant(PCodeTypes.Int,1);
        }else if(ctx.VINES() != null){
            printer.printLoadConstant(PCodeTypes.Int,2);
        }else if(ctx.ZOMBIE() != null){
            printer.printLoadConstant(PCodeTypes.Int,3);
        }else if(ctx.ENNEMI() != null){
            printer.printLoadConstant(PCodeTypes.Int,4);
        }else if(ctx.PLAYER() != null){
            printer.printLoadConstant(PCodeTypes.Int,5);
        }else if(ctx.MAP() != null){
            printer.printLoadConstant(PCodeTypes.Int,6);
        }else if(ctx.RADIO() != null){
            printer.printLoadConstant(PCodeTypes.Int,7);
        }else if(ctx.AMMO() != null){
            printer.printLoadConstant(PCodeTypes.Int,8);
        }else if(ctx.FRUITS() != null){
            printer.printLoadConstant(PCodeTypes.Int,9);
        }else if(ctx.SODA() != null){
            printer.printLoadConstant(PCodeTypes.Int,10);
        }else if(ctx.GRAAL() != null){
            printer.printLoadConstant(PCodeTypes.Int,11);
        }else {
            printer.printComments("strange");
        }
        return null;
    }

    @Override
    public Void visitExprG(B314Parser.ExprGContext ctx) {
        printer.printComments("expr G: "+ctx.getText());

        addressExprG(ctx);


        String typeString = symTable.getIdInfo(ctx.ID().getText()).getDataType();
        PCodeTypes type= PCodeTypes.Adr;
        if(typeString.equals("boolean")){
            type = PCodeTypes.Bool;
        }else if(typeString.equals("integer")){
            type = PCodeTypes.Int;
        }else if(typeString.equals("square")){
            type = PCodeTypes.Adr;
        }
        printer.printIndexedFetch(type);
        return null;
    }

    public Void addressExprG(B314Parser.ExprGContext ctx) {
        printer.printComments("expr G address: "+ctx.getText());

        int [] address = symTable.getRelativeAddress(ctx.ID().getText());
        String typeString = symTable.getIdInfo(ctx.ID().getText()).getDataType();
        PCodeTypes type= PCodeTypes.Adr;
        if(typeString.equals("boolean")){
            type = PCodeTypes.Bool;
        }else if(typeString.equals("integer")){
            type = PCodeTypes.Int;
        }else if(typeString.equals("square")){
            type = PCodeTypes.Int;
        }

        if(symTable.getCurrentScope().getName().equals(symTable.GLOBAL)) {
            printer.printLoadAdress(type, address[0], address[1]);
        }else{
            if(address[0] == 1){
                printer.printLoadAdress(type, address[0], address[1]+99);
            }else{
                printer.printLoadAdress(type, address[0], address[1]+5);
            }
        }

        if(ctx.exprEnt().size() != 0) {
            if (ctx.exprEnt().size() == 2) {
                IdInfo info = symTable.getIdInfo(ctx.ID().getText());
                visitExprEnt(ctx.exprEnt(1));
                printer.printIndexedAdressComputation(info.getDimensionArray()[0]);
            }
            visitExprEnt(ctx.exprEnt(0));
            printer.printIndexedAdressComputation(1);
        }
        return null;
    }
}
