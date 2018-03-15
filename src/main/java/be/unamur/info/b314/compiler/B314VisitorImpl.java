package be.unamur.info.b314.compiler;

import java.util.HashMap;
import java.util.Map;

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
 * @specfield symTable: Table of symbols which allows to store the name and the type
 *					of the declared variables and functions
 */
public class B314VisitorImpl extends B314BaseVisitor<Void> {


    private static final Logger LOG = LoggerFactory.getLogger(B314VisitorImpl.class);

	SymbolsTable symTable;

	/**
	 * @effects initialize an empty symTable.
	 */
	public B314VisitorImpl() {
	    symTable = new SymbolsTable();
    }

    /**
     * Print the table of identifiants to console for debug purpose
     */
    public void printSymbolsTable() {
        symTable.printSymbolsTable();
    }

	/**
	 * Visit a parse tree produced by {@link B314Parser#varDecl}.
	 *
	 * @param ctx the parse tree representing the variable declaration syntax.
	 * @modifies symTable
	 * @throws VariableAlreadyDefinedException if the id of the variable is occuped by another variable.
	 * @throws NegativeArraySizeException if the variable is of type array and its size is negative.
	 * @effects otherwise, the name and type of the variable is inserted into the table of symbols symTable.
	 */
	@Override
	public Void visitVarDecl(B314Parser.VarDeclContext ctx) 
		throws VariableAlreadyDefinedException, NegativeArraySizeException,ArenaDeclarationException {

        LOG.debug("Visit 1: VarDecl (0)");

		String id = ctx.ID().getSymbol().getText();

		// check if id existed
		if (symTable.getScope("0").containsKey(id)) {
			throw new VariableAlreadyDefinedException(
				"Error at " + ctx.getText() + ": Variable " + id + " is already defined!");
		}


		ParseTree type = ctx.type().getChild(0);
        Check("0",type,id,ctx.getText());


		return null;
	}

    /**
     *  la vérification des contraintes pour les variables (scalar, array et arena) étant le même dans plusieurs fonction, une fonction a été créée
     *
     * @param type
     * @param id
     * @param ctxText
     * @return
     */
	private void Check(String scope,ParseTree type,String id,String ctxText){
        String typeStr ="";
        int dimension = 0;
        if (type instanceof B314Parser.ScalarContext) {
            typeStr = type.getText();
            if (id.equals("arena")){
                throw new ArenaDeclarationException(
                        "Error at " + ctxText + ": Arena is not an array!");
            }
            LOG.debug("A scalar variable declared: " + typeStr + " " + id);

        } else {
            B314Parser.ArrayContext arrType = (B314Parser.ArrayContext) type;

            String arrTypeStr = arrType.scalar().getText();
            int arrDims = arrType.INT().size();
            typeStr = arrTypeStr + "_" + arrDims;

			// check negative array size
			if (Integer.parseInt(arrType.INT(0).getText()) < 0 
				|| (dimension == 2 && Integer.parseInt(arrType.INT(1).getText()) < 0)) {

                throw new NegativeArraySizeException(
                        ctxText + " Array size must be positive!");
            }

            if (id.equals("arena") && ( arrDims != 2 || Integer.parseInt(arrType.INT(0).getText()) != Integer.parseInt(arrType.INT(1).getText()) || !arrTypeStr.equals("square")) ){
                throw new ArenaDeclarationException(
                        "Error at " + ctxText + ": Arena error!");
            }

            LOG.debug("A " + arrDims + "D array of type " + arrTypeStr + " was declared and named " + id);
        }
        symTable.getScope(scope).put(id, new IdInfo("fct",typeStr, dimension));
    }


    /**
     * Visit a parse tree produced by {@link B314Parser#fctDecl}.
	 * Fill the Symbol table with Functions declared in FctDecl
     *
     * @modifies symTable est modifiée
     */
    @Override
    public Void visitFctDecl(B314Parser.FctDeclContext ctx) throws VariableAlreadyDefinedException {

    	// TODO (apres echeance1) visit childrens

        LOG.debug("Visit 2: FctDecl");
        LOG.debug("function name = '" + ctx.ID().get(0) +"' output = "+ ctx.ID().get(1));
        String nomFct = ctx.ID().get(0).toString();

        if(ctx.VOID() == null){
            String typeFct = ctx.scalar().getText();
            symTable.getScope("0").put(nomFct, new IdInfo("fct",typeFct, 0));
        }else{
            symTable.getScope("0").put(nomFct, new IdInfo("fct","void", 0));
        }

        symTable.createNewScope(nomFct);

	    for(int i=0;i< ctx.varDecl().size();i++){
	        String nomVar = ctx.varDecl().get(i).ID().getSymbol().getText();

            // check if id existed
            if (symTable.getScope(nomFct).containsKey(nomVar)) {
                throw new VariableAlreadyDefinedException(
                        "Error at " + ctx.getText() + ": Variable " + nomVar + " is already defined!");
            }

            ParseTree type = ctx.varDecl().get(i).type().getChild(0);
            Check(nomFct,type,nomVar,ctx.getText());

        }
        return null;
    }

    /**
     *  Visit a parse tree produced by {@link B314Parser#clauseWhen}.
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

            // check if id existed
            if (symTable.getScope("when").containsKey(nomVar)) {
                throw new VariableAlreadyDefinedException(
                        "Error at " + ctx.getText() + ": Variable " + nomVar + " is already defined!");
            }

            ParseTree type = ctx.varDecl().get(i).type().getChild(0);
            Check("when",type,nomVar,ctx.getText());

        }

        //once everything in the scope is checked and correct, we can delete it in the scope
        symTable.deleteScope("when");
        return null;
    }

    /**
     *  Visit a parse tree produced by {@link B314Parser#clauseDefault}.
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

        // important: we should call this at the beginning of every visit method
        // to make sure that all subtrees are checked.
        visitChildren(ctx);

        symTable.createNewScope("default");

        for(int i=0;i< ctx.varDecl().size();i++){
            String nomVar = ctx.varDecl().get(i).ID().getSymbol().getText();

            // check if id existed
            if (symTable.getScope("default").containsKey(nomVar)) {
                throw new VariableAlreadyDefinedException(
                        "Error at " + ctx.getText() + ": Variable " + nomVar + " is already defined!");
            }

            ParseTree type = ctx.varDecl().get(i).type().getChild(0);
            Check("default",type,nomVar,ctx.getText());

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
		String gid = ctx.ID().getSymbol().getText();

		// TODO: Determine the scope in which the expression stands.
		if (!symTable.getScope("global").containsKey(gid)) {
			throw new ElementUndefinedException(
				ctx + " The variable " + gid + " might not be defined!");
		}

		// TODO: what if exprG is declared as a 2d array but referred as a 1d array or scalar?

		return null;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#instruction}.
	 *
	 * @throws TypeMismatchException if the types of the lhs expression (expression gauche)
	 *					and rhs expression (expression droite) are different.
	 * @throws IllegalAffectationException if the lhs or rhs expression is an entire array.
	 */
	@Override
	public Void visitInstruction(B314Parser.InstructionContext ctx)
		throws TypeMismatchException, IllegalAffectationException {

		visitChildren(ctx);

		if (ctx.getStart().getType() == B314Parser.SET) {
			LOG.debug("An affect instruction found!: " + ctx.getText());

			// TODO: What if exprG isnot a scalar or an array element but an entire array?
			B314Parser.ExprGContext exprG = ctx.exprG();
			String gid = exprG.ID().getSymbol().getText();
			IdInfo gidInfo = symTable.getScope("global").getVar(gid);
			if (gidInfo.getDimension() > 0 && exprG.getChildCount() == 1) {
				throw new IllegalAffectationException(ctx + " The lhs expression cannot be an array!");
			}

			String gidBaseType = gidInfo.getDataType();

			ParseTree did = ctx.exprD().getChild(0);
			if (did instanceof B314Parser.ExprGContext) {

			 	String subDid = ((B314Parser.ExprGContext)did).ID().getSymbol().getText();
				IdInfo subDidInfo = symTable.getScope("global").getVar(subDid);

				if (subDidInfo.getDimension() > 0 && did.getChildCount() == 1) {
					throw new IllegalAffectationException(
						ctx + " The rhs expression cannot be an array!");
				}

				if (!gidBaseType.equals(subDidInfo.getDataType())) {
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
