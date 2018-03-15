package be.unamur.info.b314.compiler;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import be.unamur.info.b314.compiler.exception.*;
// import be.unamur.info.b314.compiler.B314BaseVisitor;


/**
 * This visitor is an extension of {@link B314BaseVisitor} which handles some
 * syntax exceptions of the B314 grammar.
 * @specfield variables: HashMap<String, String> // a set of paire (name, type)
 * 		containing informations about the declared variables in the program.
 */
public class B314VisitorImpl extends B314BaseVisitor<Void> {


    private static final Logger LOG = LoggerFactory.getLogger(B314VisitorImpl.class);

    // TODO: clean && update documents
	private HashMap<String, String> variables; 
	private HashMap<String, B314Parser.TypeContext> globalVars;

	/**
	 * @effects initialize variables to be an empty map.
	 */
	public B314VisitorImpl() {
		 variables = new HashMap<String, String>();
		 globalVars = new HashMap<String, B314Parser.TypeContext>();
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#varDecl}.
	 *
	 * @param ctx the parse tree representing the variable declaration syntax.
	 * @throws VariableAlreadyDefinedException if the id of the variable is occuped by another variable.
	 * @throws NegativeArraySizeException if the variable is of type array and its size is negative.
	 * @effects otherwise, the variable information (name, type) is inserted into the hashmap variables.
	 */
	@Override
	public Void visitVarDecl(B314Parser.VarDeclContext ctx) 
		throws VariableAlreadyDefinedException, NegativeArraySizeException {

		String id = ctx.ID().getSymbol().getText();
		
		// check if id existed
		if (variables.containsKey(id)) {
			throw new VariableAlreadyDefinedException(
				"Error at " + ctx.getText() + ": Variable " + id + " is already defined!");
		}

		String typeStr = "";
		ParseTree type = ctx.type().getChild(0);

		if (type instanceof B314Parser.ScalarContext) {
			typeStr = type.getText();
			LOG.debug("A scalar variable declared: " + typeStr + " " + id);

		} else {
			B314Parser.ArrayContext arrType = (B314Parser.ArrayContext) type;
			
			String arrTypeStr = arrType.scalar().getText();
			int arrDims = arrType.INT().size();
			typeStr = arrTypeStr + "_" + arrDims;

			// check negative array size
			if (Integer.parseInt(arrType.INT(0).getText()) < 0 
				|| (arrDims == 2 && Integer.parseInt(arrType.INT(1).getText()) < 0)) {

				throw new NegativeArraySizeException(
					"Error at " + ctx.getText() + ": Array size must be positive!");
			} 

			LOG.debug("A " + arrDims + "D array of type " + arrTypeStr + " was declared and named " + id);
		}

		variables.put(id, typeStr);
		globalVars.put(id, ctx.type());

		return null;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#exprG}.
	 * This implementation version assumes that all the variables are global 
	 * (i.e. there is no function in the program...)
	 *
	 * @throws ElementUndefinedException if the id of this expression was not declared.
	 */
	@Override
	public Void visitExprG(B314Parser.ExprGContext ctx) { 
		Token gid = ctx.ID().getSymbol();
		String gidStr = gid.getText();

		if (!variables.containsKey(gidStr)) {
			throw new ElementUndefinedException(
				gid + " The variable " + gidStr + " might not be defined!");
		}

		// TODO: what if exprG is declared as a 2d array but referred as a 1d array or scalar?
		
		return null;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#instruction}.
	 * 
	 * @throws TypeMismatchException if the types of the lhs expression (expression gauche)
	 *								and rhs expression (expression droite) are different.
	 * @throws IllegalAffectationException if the lhs or rhs expression is an array (but not an array element)
	 */
	@Override 
	public Void visitInstruction(B314Parser.InstructionContext ctx) 
		throws TypeMismatchException, IllegalAffectationException {

		visitChildren(ctx);

		if (ctx.getStart().getType() == B314Parser.SET) {
			LOG.debug("An affect instruction found!: " + ctx.getText());
			
			// TODO: What if exprG is an array but not a scalar or an array element?
			B314Parser.ExprGContext exprG = ctx.exprG();
			String gid = exprG.ID().getSymbol().getText();
			ParseTree gType = globalVars.get(gid).getChild(0);

			if ((gType instanceof B314Parser.ArrayContext) && exprG.getChildCount() == 1) {
				throw new IllegalAffectationException(ctx + " The lhs expression cannot be an array!");
			}

			String gidType = variables.get(gid).split("_")[0];

			ParseTree did = ctx.exprD().getChild(0);
			if (did instanceof B314Parser.ExprGContext) {
				// get the id string of the exprG which is the child of the exprD
			 	String subDid = ((B314Parser.ExprGContext)did).ID().getSymbol().getText(); 
				String subDidType = variables.get(subDid).split("_")[0];
				
				if (!gidType.equals(subDidType)) {
					throw new TypeMismatchException(
						ctx + " There is a type mismatch between the two side of the expression");
				}

			} else if (did instanceof B314Parser.ExprCaseContext) {
				// TODO A Case can be assigned to an integer variable or an element of an integer array
				// if (gidType) 
			} else if (did instanceof B314Parser.ExprBoolContext) {
				// TODO

			} else if (did instanceof B314Parser.ExprEntContext) {
				// TODO

			} else if (did instanceof TerminalNode) {
				int didType = ((TerminalNode) did).getSymbol().getType();

				if (didType == B314Parser.ID) {
					// TODO
				} else { // didType == B314Parser.LPAR
					// TODO
				}
			}

		}

		return null;
	}

}
