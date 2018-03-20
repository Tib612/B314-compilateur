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

	private SymbolsTable symTable;

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
	 */
	@Override
	public Void visitVarDecl(B314Parser.VarDeclContext ctx) {

        LOG.debug("Visit 1: VarDecl (0)");

		String id = ctx.ID().getSymbol().getText();
		ParseTree type = ctx.type().getChild(0);
        CheckAndAdd(type,id,ctx.getText());

		return null;
	}

    /**
     *  La vérification des contraintes pour les variables (scalar, array et arena) étant le même dans plusieurs fonction, une fonction a été créée
     *
     * @param type ParseTree containing information about the type of the variable
     * @param id String containing variable name
     * @param ctxText used in error message 
	 * @throws VariableAlreadyDefinedException if the id of the variable is occuped by another variable.
	 * @throws NegativeArraySizeException if the variable is of type array and its size is negative.
	 * @throws ArenaDeclarationException if the variable is named "arena" but does not respect the criteria of arena.
	 * @effects otherwise, the name and type of the variable is inserted into the table of symbols symTable.
     */
	private void CheckAndAdd(ParseTree type,String id,String ctxText) {

		String scope = symTable.getCurrentScope();
		// check if id existed
		if (symTable.getScope(scope).containsKey(id)) {
			throw new VariableAlreadyDefinedException(
					"Error at " + ctxText+ ": Variable " + id + " is already defined!");
		}

		if(id.equals(scope)){
            throw new VariableAlreadyDefinedException(
                    "Error at " + ctxText + ": this name is the same than the function the variable is declared in!");
        }
        String typeStr ="";
        int dimension = 0;
        if (type instanceof B314Parser.ScalarContext) {
            typeStr = type.getText();
            if (id.equals("arena")){
                throw new ArenaDeclarationException(
                        "Error at " + ctxText + ": Arena is not an array!");
            }
            LOG.debug("A scalar variable declared: " + typeStr + " " + id + " in scope: "+scope);

        } else {
            B314Parser.ArrayContext arrType = (B314Parser.ArrayContext) type;

            typeStr = arrType.scalar().getText();
            dimension = arrType.INT().size();

			// check negative array size
			if (Integer.parseInt(arrType.INT(0).getText()) < 0 
				|| (dimension == 2 && Integer.parseInt(arrType.INT(1).getText()) < 0)) {

                throw new NegativeArraySizeException(
                        ctxText + " Array size must be positive!");
            }

            if (id.equals("arena")
               &&
               ( dimension != 2
            	    || Integer.parseInt(arrType.INT(0).getText()) != Integer.parseInt(arrType.INT(1).getText())
            	    || !typeStr.equals("square")
                    || !scope.equals("_global")
               ) ){
                
                throw new ArenaDeclarationException(
                        "Error at " + ctxText + ": Arena error!");
            }

            LOG.debug("A " + dimension + "D array of type " + typeStr + " was declared and named " + id);
        }
        symTable.getScope(scope).put(id, new IdInfo("var",typeStr, dimension));
    }

    /**
     * Visit a parse tree produced by {@link B314Parser#fctDecl}.
	 * Fill the Symbol table with Functions declared in FctDecl
     *
     * @modifies symTable est modifiée
     */
    @Override
    public Void visitFctDecl(B314Parser.FctDeclContext ctx) {

    	// TODO (apres echeance1) visit childrens
    	// TODO (apres echeance1) visit childrens
        String id = ctx.ID().get(0).toString();
        LOG.debug("Visit 2: FctDecl");
        LOG.debug("function name = '" +id  +"' output = "+ ctx.ID().get(1));

        // check if id existed
        if (symTable.getScope("_global").containsKey(id)) {
            throw new VariableAlreadyDefinedException(
                    "Error at " + ctx.getText()+ ": Function " + id + " is already defined!");
        }

        String nomFct = ctx.ID().get(0).toString();

        int nbArg=0;
        for (int i = 0; i < ctx.getChildCount() && !ctx.getChild(i).getText().equals(")"); i++) {
            if(ctx.getChild(i) instanceof B314Parser.VarDeclContext){
                nbArg++;
            }
        }
        LOG.debug("nb arg: "+nbArg);

        if(ctx.VOID() == null){
            String typeFct = ctx.scalar().getText();
            symTable.getScope("_global").put(nomFct, new IdInfo("fct",typeFct, 0,nbArg));
        }else{
            symTable.getScope("_global").put(nomFct, new IdInfo("fct","void", 0,nbArg));
        }



        symTable.createNewScope(nomFct);

        visitChildren(ctx);
/*
        for(int i=0;i< ctx.varDecl().size();i++){
	        String nomVar = ctx.varDecl().get(i).ID().getSymbol().getText();
            ParseTree type = ctx.varDecl().get(i).type().getChild(0);
            CheckAndAdd(type,nomVar,ctx.getText());

        }
        */
        symTable.setCurrentScope("_global");
        return null;
    }

    /**
     * Visit a parse tree produced by {@link B314Parser#clauseWhen}.
     * This implementation version assumes that all the variables are global
     *
     * Fill the Symbol table with Variables declared in ClauseWhen
     *
     * @modifies symTable est modifiée
     * @throws NegativeArraySizeException
     */
    @Override
    public Void visitClauseWhen(B314Parser.ClauseWhenContext ctx) {

        LOG.debug("Visit 3: when");

        symTable.createNewScope("when");
        visitChildren(ctx);
/*
        for(int i=0;i< ctx.varDecl().size();i++){
            String nomVar = ctx.varDecl().get(i).ID().getSymbol().getText();
            ParseTree type = ctx.varDecl().get(i).type().getChild(0);
            CheckAndAdd(type,nomVar,ctx.getText());

        }
*/
        //once everything in the scope is checked and correct, we can delete it in the scope
        symTable.deleteScope("when");
        return null;
    }

    /**
     * Visit a parse tree produced by {@link B314Parser#clauseDefault}.
     * This implementation version assumes that all the variables are global
     *
     * Fill the Symbol table with Variables declared in ClauseDefault
     *
     * @modifies symTable est modifiée
     */
    @Override
    public Void visitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
        LOG.debug("Visit 4: default");
        symTable.createNewScope("default");

        // important: we should call this at the beginning of every visit method
        // to make sure that all subtrees are checked.
        visitChildren(ctx);

/*
        for(int i=0;i< ctx.varDecl().size();i++){
            String nomVar = ctx.varDecl().get(i).ID().getSymbol().getText();
            ParseTree type = ctx.varDecl().get(i).type().getChild(0);
            CheckAndAdd(type,nomVar,ctx.getText());

        }
*/
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
		visitChildren(ctx);

		String lhsId = ctx.ID().getSymbol().getText();

		// TODO in echeance2: Determine the scope in which the expression stands.
		if (!symTable.getScope("_global").containsKey(lhsId)) {
			throw new ElementUndefinedException(
				ctx.getText() + " The variable " + lhsId + " might not be defined!");
		}

		// what if exprG is declared as a 1d array but referred as a 2d array?
		// note that it's possible if we declared i as boolean[2][2] but call i[2] (get a row of i..)
		int lhsDimension = ctx.exprEnt().size();
		IdInfo lhsInfo = symTable.getScope("_global").getVar(lhsId);
		int lhsRequiredDimension = lhsInfo.getDimension();
		if (lhsDimension > lhsRequiredDimension) {
			throw new TypeMismatchException(ctx.getText() + 
				"Incompatible types: " + lhsId + " was declared as a " +
				lhsRequiredDimension + "D variable but used as a " + 
				lhsDimension + "D variable.");
		}

		return null;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#instruction}.
	 * 
	 * @param ctx the parse tree representing the instruction syntax.
	 */
	@Override
	public Void visitInstruction(B314Parser.InstructionContext ctx) {

		visitChildren(ctx);

		if (ctx.getStart().getType() == B314Parser.SET) {
			LOG.debug("An affect instruction found!: " + ctx.getText());
			checkAffectInstruction(ctx);
		}

		return null;
	}

	/**
	 * Check if the affect instruction ctx respects the constraints
	 *
	 * @throws TypeMismatchException if the types of the lhs expression (expression gauche)
	 *					and rhs expression (expression droite) are different.
	 * @throws IllegalAffectationException if the lhs or rhs expression is an entire array.
	 */
	private void checkAffectInstruction(B314Parser.InstructionContext ctx) {

		B314Parser.ExprGContext lhsExpr = ctx.exprG();
		String lhsId = lhsExpr.ID().getSymbol().getText();
		IdInfo lhsInfo = symTable.getScope("_global").getVar(lhsId);
		if (lhsInfo.getDimension() != lhsExpr.exprEnt().size()) {
			throw new IllegalAffectationException(ctx.getText() + 
				" The lhs expression cannot be of array type!");
		}

		String lhsType = lhsInfo.getDataType();
		String rhsType = getRhsExprType(ctx.exprD());
		if (!lhsType.equals(rhsType)) {
			throw new TypeMismatchException(ctx.getText(), lhsType, rhsType);
		}
	}

	/**
	 * Get data type of an expression
	 *
	 * @param rhsExpr a right-hand-side expression (expression droite) 
	 * @throws IllegalAffectationException if the lhs or rhs expression is an entire array.
	 * @return the data type of rhsExpr
	 */
	private String getRhsExprType (B314Parser.ExprDContext rhsExpr) {
		String type  = "";
		ParseTree subExpr = rhsExpr.getChild(0);
		if (subExpr instanceof B314Parser.ExprGContext) {
			B314Parser.ExprGContext subExprG = (B314Parser.ExprGContext) subExpr;
		 	String rhsId = subExprG.ID().getSymbol().getText();
			IdInfo rhsInfo = symTable.getScope("_global").getVar(rhsId);

			// TODO: Refactor. In affect instruction, a rhs expression can't be of array type but
			// 		in other scenarios, it's possible...
			if (rhsInfo.getDimension() != subExprG.exprEnt().size()) {
				throw new IllegalAffectationException(
					rhsExpr.getText() + " The rhs expression cannot be of array type!");
			}

			type = rhsInfo.getDataType();

		} else if (subExpr instanceof B314Parser.ExprCaseContext) {
			type = "square";

		} else if (subExpr instanceof B314Parser.ExprBoolContext) {
			type = "boolean";

		} else if (subExpr instanceof B314Parser.ExprEntContext) {
			type = "integer";

		} else if (subExpr instanceof TerminalNode) {
			int symbolType = ((TerminalNode) subExpr).getSymbol().getType();

			if (symbolType == B314Parser.ID) {
				String rhsId = subExpr.getText();
				type = symTable.getScope("_global").getVar(rhsId).getDataType();
			} else { // symbolType == B314Parser.LPAR, c'est une expression parenthese
				type = getRhsExprType(rhsExpr.exprD(0));
			}
		}

		return type;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#exprEnt}.
	 *
	 * @param ctx the parse tree representing the expression.
	 */
	@Override
	public Void visitExprEnt(B314Parser.ExprEntContext ctx) {
		visitChildren(ctx);
		checkExprGType(ctx, "integer");
		return null;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#exprBool}.
	 *
	 * @param ctx the parse tree representing the expression.
	 */
	@Override
	public Void visitExprBool(B314Parser.ExprBoolContext ctx) {
		visitChildren(ctx);
		checkExprGType(ctx, "boolean");
		return null;
	}

	/**
	 * Visit a parse tree produced by {@link B314Parser#exprCase}.
	 *
	 * @param ctx the parse tree representing the Case expression.
	 */
	@Override
	public Void visitExprCase(B314Parser.ExprCaseContext ctx) {
		visitChildren(ctx);
		checkExprGType(ctx, "square");
		return null;
	}

	/**
	 * Check if the variable respects the type constraint of the rhs expression (exprD)
	 *
	 * @param ctx the parse tree representing the expression.
	 * @param typeName expected type.
	 * @throws TypeMismatchException if the expression is not of type typeName.
	 */
	private void checkExprGType(ParseTree ctx, String typeName) {
		ParseTree ctxChild = ctx.getChild(0);

		if (ctxChild instanceof B314Parser.ExprGContext) {
			B314Parser.ExprGContext lhsExpr = (B314Parser.ExprGContext) ctxChild;
			String lhsId = lhsExpr.ID().getText();
			IdInfo lhsInfo = symTable.getScope("_global").getVar(lhsId);
			String lhsType = lhsInfo.getDataType();

			if (!lhsType.equals(typeName)) {
				throw new TypeMismatchException(lhsId + 
					" Type " + typeName + " expected but " + lhsId + " is of type " + lhsType + ".");
			}

			if (lhsExpr.exprEnt().size() != lhsInfo.getDimension()) {
				throw new TypeMismatchException(
					lhsId + " Type " + typeName + " expected but array type was found!");
			}
		}
		
	}
}
