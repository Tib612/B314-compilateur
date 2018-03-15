package be.unamur.info.b314.compiler;

import java.util.HashMap;
import java.util.Map;

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

	SymbolsTable symTable;
	HashMap<String,String> variables;

	/**
	 * @effects initialize an empty symTable.
	 */
	public B314VisitorImpl() {
	    symTable = new SymbolsTable();
	    variables = new HashMap<String,String>();
    }

    public  Void printSymbolsTable(){
        symTable.printSymbolsTable();
        return null;
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

        LOG.debug("Visit 1: VarDecl (global)");

		String id = ctx.ID().getSymbol().getText();
		// check if id existed
		if (symTable.getScope("global").containsKey(id)) {
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

        symTable.getScope("global").put(id, new String[] {"var",typeStr});

		return null;
	}

    /**
     *  Visit a parse tree produced by {@link B314Parser#exprG}.
     *  This implementation version assumes that all the variables are global
     *
     *  Fill the Symbol table with Functions declared in FctDecl
     *
     * @modifies symTable est modifiée
     * @throws VariableAlreadyDefinedException
     * @throws NegativeArraySizeException
     */
    @Override
    public Void visitFctDecl(B314Parser.FctDeclContext ctx)
            throws VariableAlreadyDefinedException, NegativeArraySizeException {

        LOG.debug("Visit 2: FctDecl");
        LOG.debug("function name = '" + ctx.ID().get(0) +"' output = "+ ctx.ID().get(1));
        String nomFct = ctx.ID().get(0).toString();
        if(ctx.VOID() == null){
            String typeFct = ctx.scalar().getText();
            symTable.getScope("global").put(nomFct, new String[] {"fct",typeFct});
        }else{
            symTable.getScope("global").put(nomFct, new String[] {"fct","void"});
        }

        symTable.createNewScope(nomFct);

	    for(int i=0;i< ctx.varDecl().size();i++){
	        String nomVar = ctx.varDecl().get(i).ID().getSymbol().getText();
	        String typeVar = ctx.varDecl().get(i).type().getText();
            LOG.debug("var in fctDecl ID = " + nomVar);
            LOG.debug("var in fctDecl type = " + typeVar);
            symTable.getScope(nomFct).put(nomVar, new String[] {"var",typeVar});
        }
        return null;
    }

    /**
     *  Visit a parse tree produced by {@link B314Parser#exprG}.
     *  This implementation version assumes that all the variables are global
     *
     *  Fill the Symbol table with Variables declared in ClauseWhen
     *
     * @modifies symTable est modifiée
     * @throws NegativeArraySizeException
     */
    @Override
    public Void visitClauseWhen(B314Parser.ClauseWhenContext ctx)
            throws NegativeArraySizeException {

        LOG.debug("Visit 3: when");

        symTable.createNewScope("when");

        for(int i=0;i< ctx.varDecl().size();i++){
            String nomVar = ctx.varDecl().get(i).ID().getSymbol().getText();
            String typeVar = ctx.varDecl().get(i).type().getText();
            LOG.debug("var in when ID = " + nomVar);
            LOG.debug("var in when type = " + typeVar);
            symTable.getScope("when").put(nomVar, new String[] {"var",typeVar});
        }
        return null;
    }

    /**
     *  Visit a parse tree produced by {@link B314Parser#exprG}.
     *  This implementation version assumes that all the variables are global
     *
     *  Fill the Symbol table with Variables declared in ClauseDefault
     *
     * @modifies symTable est modifiée
     * @throws NegativeArraySizeException
     */
    @Override
    public Void visitClauseDefault(B314Parser.ClauseDefaultContext ctx)
            throws NegativeArraySizeException {
        LOG.debug("Visit 4: default");

        symTable.createNewScope("default");

        for(int i=0;i< ctx.varDecl().size();i++){
            String nomVar = ctx.varDecl().get(i).ID().getSymbol().getText();
            String typeVar = ctx.varDecl().get(i).type().getText();
            LOG.debug("var in default ID = " + nomVar);
            LOG.debug("var in default type = " + typeVar);
            symTable.getScope("default").put(nomVar, new String[] {"var",typeVar});
        }
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
/*
		if (!variables.containsKey(gidStr)) {
			throw new ElementUndefinedException(
				gid + " The variable " + gidStr + " might not be defined!");
		}
*/
		return null;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#instruction}.
	 *
	 * @throws TypeMismatchException if the types of the lhs expression (expression gauche)
	 *			and rhs expression (expression droite) are different.
	 */
	/*
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
	*/

}
