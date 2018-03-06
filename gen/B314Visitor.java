// Generated from /home/users/100/tndao/Documents/M0/Q2/Compilers/Projet/1718_INFOB314_COMPILATEUR_GROUPE12/src/main/antlr4/be/unamur/info/b314/compiler/B314.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link B314Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface B314Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(B314Parser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(B314Parser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseDefault(B314Parser.ClauseDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctDecl(B314Parser.FctDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(B314Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(B314Parser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(B314Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(B314Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprD(B314Parser.ExprDContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(B314Parser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnt(B314Parser.ExprEntContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCase(B314Parser.ExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprG(B314Parser.ExprGContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(B314Parser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#impDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpDecl(B314Parser.ImpDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseWhen(B314Parser.ClauseWhenContext ctx);
}