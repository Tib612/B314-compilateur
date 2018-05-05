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


    public PCodeVisitor(SymbolsTable symTable, PCodePrinter printer) {
        this.symTable = symTable;
        this.printer = printer;
    }

    @Override 
    public Void visitProgramme(B314Parser.ProgrammeContext ctx) {
        printer.printComments("Start program");
        totnbVar = nEnvVars + 1 + symTable.getGlobalScope().size();
        printer.printSetStackPointer(totnbVar);
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
            printer.printLoadAdress(PCodeTypes.Int, 0, i);
            printer.printRead();
            printer.printStore(PCodeTypes.Int);
        }

    }

    private void initGlobalVar(){
        printer.printComments("Initialize Global Variables");

        for (int i = nEnvVars; i < totnbVar; i++) {
            printer.printLoadAdress(PCodeTypes.Int, 0, i);
            printer.printRead();
            printer.printStore(PCodeTypes.Int);
        }
    }

    @Override
    public Void visitInstruction(B314Parser.InstructionContext ctx){
        printer.printComments("instruction");
        if(ctx.action() != null){
            visitAction(ctx.action());
        }else if(ctx.ELSE() != null){

        }else if(ctx.THEN() != null){

        }else if(ctx.WHILE() != null){

        }else if(ctx.SET() != null){

        }else if (ctx.COMPUTE() != null){

        }
        return null;
    }

    @Override
    public Void visitAction(B314Parser.ActionContext ctx){

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
        }
        printer.printPrin();
        return null;
    }

    @Override
    public Void visitClauseDefault(B314Parser.ClauseDefaultContext ctx){
        printer.printComments("default");
        printer.printMarkStack(0);
        printer.printCallUserProcedure(0,"_default"+"start");
        printer.printUnconditionalJump("_default");
        printer.printDefineLabel("_default"+"start");
        printer.printSetStackPointer(symTable.getScope("_default").size());

        for(int i=0;i<ctx.instruction().size();i++) {
            visitInstruction(ctx.instruction(i));
        }

        printer.printReturnFromProcedure();
        printer.printDefineLabel("_default");
        return null;
    }

    @Override
    public Void visitClauseWhen(B314Parser.ClauseWhenContext ctx){
        printer.printComments("when");
        visitExprBool(ctx.exprBool());
        printer.printFalseJump("_when"+whenCounter);
        printer.printMarkStack(0);
        printer.printCallUserProcedure(0,"_when"+whenCounter+"start");
        printer.printUnconditionalJump("_when"+whenCounter);
        printer.printDefineLabel("_when"+whenCounter+"start");
        printer.printSetStackPointer(symTable.getScope("_when"+whenCounter).size());

        for(int i=0;i<ctx.instruction().size();i++) {
            visitInstruction(ctx.instruction(i));
        }

        printer.printReturnFromProcedure();
        printer.printDefineLabel("_when"+whenCounter);
        whenCounter++;
        return null;
    }

    @Override
    public Void visitFctDecl(B314Parser.FctDeclContext ctx){
        printer.printComments("fct");
        printer.printDefineLabel(ctx.ID().getText());
        printer.printSetStackPointer(symTable.getScope(ctx.ID().getText()).size());

        for(int i=0;i<ctx.instruction().size();i++) {
            visitInstruction(ctx.instruction(i));
        }
        printer.printReturnFromFunction();
        return null;
    }

    @Override
    public Void visitExprBool(B314Parser.ExprBoolContext ctx){
        printer.printComments("bool");
        if(ctx.TRUE() != null) {
            printer.printLoadConstant(PCodeTypes.Bool, 1);
        }else if(ctx.FALSE() != null) {
            printer.printLoadConstant(PCodeTypes.Bool, 0);
        }else if(ctx.IS() != null){
            if(ctx.ENNEMI() != null){
                //check for N S E W
            }else if(ctx.GRAAL() != null){
                //check for N S E W
            }
        }else if(ctx.NOT() != null){
            visitExprBool(ctx.exprBool(0));
            printer.printNot();
        }else if(ctx.ID() != null){
            visitFctCall(ctx.ID().getText(),ctx.exprD());
        }else if(ctx.LPAR() != null){
            visitExprBool(ctx.exprBool(0));
        }else if(ctx.exprG() != null && ctx.EQUAL() != null){
            visitExprG(ctx.exprG(0));
            visitExprG(ctx.exprG(1));
            printer.printEqualsValues(PCodeTypes.Bool);
        }else if(ctx.exprCase() != null && ctx.EQUAL() != null){
            visitExprCase(ctx.exprCase(0));
            visitExprCase(ctx.exprCase(1));
            printer.printEqualsValues(PCodeTypes.Bool);
        }else if(ctx.exprEnt() != null){
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
        }else if(ctx.exprBool() != null){
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
        }
        return null;
    }

    public void visitFctCall(String id, List<B314Parser.ExprDContext> ls){
        printer.printComments("function call");
        printer.printMarkStack(0);
        printer.printCallUserProcedure(0,id);
    }

    @Override
    public Object visitExprD(B314Parser.ExprDContext ctx) {
        return super.visitExprD(ctx);
    }

    @Override
    public Object visitExprEnt(B314Parser.ExprEntContext ctx) {
        return super.visitExprEnt(ctx);
    }

    @Override
    public Object visitExprCase(B314Parser.ExprCaseContext ctx) {
        return super.visitExprCase(ctx);
    }

    @Override
    public Object visitExprG(B314Parser.ExprGContext ctx) {
        return super.visitExprG(ctx);
    }

    // @Override
    // public Object visitDemo(DEMOParser.DemoContext ctx) {
    //     printer.printSetStackPointer(symTable.size()); // Reserve space for variables
    //     printer.printComments("Start instructions");
    //     super.visitDemo(ctx); // Print instructions
    //     printer.printComments("End instructions");
    //     printer.printStop(); // Stop execution
    //     return null;
    // }

    // @Override
    // public Object visitAffectInstr(DEMOParser.AffectInstrContext ctx) {
    //     String var = ctx.ID().getText();
    //     printer.printLoadAdress(PCodeTypes.Int, 0, symTable.get(var)); // Load variable adress
    //     ctx.expression().accept(this); // Compute expression
    //     printer.printStore(PCodeTypes.Int);
    //     return null;
    // }

}
