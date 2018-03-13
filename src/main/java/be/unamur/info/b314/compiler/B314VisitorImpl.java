package be.unamur.info.b314.compiler;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.antlr.v4.runtime.tree.ParseTree;

import be.unamur.info.b314.compiler.exception.VariableAlreadyDefinedException;
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

}
