package be.unamur.info.b314.compiler;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

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

	private HashMap<String, String> variables;

	/**
	 * @effects initialize variables to be an empty map.
	 */
	public B314VisitorImpl() {
		 variables = new HashMap<String, String>();
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

		return null;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#instruction}.
	 * 
	 * @throws TypeMismatchException if the types of the lhs expression (expression gauche)
	 *			and rhs expression (expression droite) are different.
	 */
	@Override 
	public Void visitInstruction(B314Parser.InstructionContext ctx) throws TypeMismatchException {

		visitChildren(ctx);

		if (ctx.getStart().getType() == B314Parser.SET) {
			LOG.debug("An affect instruction found!: " + ctx.getText());
			
			String gid = ctx.exprG().ID().getSymbol().getText();
			String gidType = variables.get(gid).split("_")[0];
			ParseTree did = ctx.exprD().getChild(0);
			if (did instanceof B314Parser.ExprCaseContext) {
				// TODO

			} else if (did instanceof B314Parser.ExprGContext) {
				// get the id string of the exprG which is the child of the exprD
				String subDid = ((B314Parser.ExprGContext)did).ID().getSymbol().getText(); 
				String subDidType = variables.get(subDid).split("_")[0];
				
				if (!gidType.equals(subDidType)) {
					throw new TypeMismatchException(
						ctx + 
						" There is a type mismatch between the two side of the expression"
					);
				}

			}

		}

		return null;
	}

}
