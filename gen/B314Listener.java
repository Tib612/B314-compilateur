// Generated from /home/users/100/tndao/Documents/M0/Q2/Compilers/Projet/1718_INFOB314_COMPILATEUR_GROUPE12/src/main/antlr4/be/unamur/info/b314/compiler/B314.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link B314Parser}.
 */
public interface B314Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(B314Parser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(B314Parser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(B314Parser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(B314Parser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void enterClauseDefault(B314Parser.ClauseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void exitClauseDefault(B314Parser.ClauseDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void enterFctDecl(B314Parser.FctDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void exitFctDecl(B314Parser.FctDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(B314Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(B314Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalar(B314Parser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalar(B314Parser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(B314Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(B314Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(B314Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(B314Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprD(B314Parser.ExprDContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprD(B314Parser.ExprDContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(B314Parser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(B314Parser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEnt(B314Parser.ExprEntContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEnt(B314Parser.ExprEntContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCase(B314Parser.ExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCase(B314Parser.ExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterExprG(B314Parser.ExprGContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitExprG(B314Parser.ExprGContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(B314Parser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(B314Parser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#impDecl}.
	 * @param ctx the parse tree
	 */
	void enterImpDecl(B314Parser.ImpDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#impDecl}.
	 * @param ctx the parse tree
	 */
	void exitImpDecl(B314Parser.ImpDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void enterClauseWhen(B314Parser.ClauseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void exitClauseWhen(B314Parser.ClauseWhenContext ctx);
}