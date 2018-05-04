package be.unamur.info.b314.compiler;

import java.util.Map;

import be.unamur.info.b314.compiler.PCodePrinter.PCodeTypes;

/**
 * Print PCode for a given tree using provided symbol table and printer. This 
 * class uses ANTLR visitor mechanism.
 * @author Xavier Devroey - xavier.devroey@unamur.be
 */
public class PCodeVisitor extends B314BaseVisitor<Object> {

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
        visitChildren(ctx);
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
        return null;
    }

    @Override
    public Void visitClauseDefault(B314Parser.ClauseDefaultContext ctx){
        printer.printComments("default");
        return null;
    }

    @Override
    public Void visitClauseWhen(B314Parser.ClauseWhenContext ctx){
        printer.printComments("when");
        visitExprBool(ctx.exprBool());
        printer.printFalseJump("_when");
        return null;
    }

    @Override
    public Void visitFctDecl(B314Parser.FctDeclContext ctx){
        printer.printComments("fct");
        return null;
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

    // @Override
    // public Object visitConstantExpr(DEMOParser.ConstantExprContext ctx) {
    //     int value = Integer.parseInt(ctx.NUMBER().getText()); // Get value
    //     printer.printLoadConstant(PCodeTypes.Int, value); // Load constant value
    //     return null;
    // }

    // @Override
    // public Object visitVariableExpr(DEMOParser.VariableExprContext ctx) {
    //     String var = ctx.ID().getText();
    //     printer.printLoad(PCodeTypes.Int, 0, symTable.get(var)); // Load value in cell at given adress
    //     return null;
    // }

    // @Override
    // public Object visitPlusMinusExpr(DEMOParser.PlusMinusExprContext ctx) {
    //     ctx.expression(0).accept(this); // Print left expression
    //     ctx.expression(1).accept(this); // Print right expression
    //     if(ctx.PLUS()!= null){
    //         printer.printAdd(PCodeTypes.Int);
    //     } else {
    //         printer.printSub(PCodeTypes.Int);
    //     }
    //     return null;
    // }

}
