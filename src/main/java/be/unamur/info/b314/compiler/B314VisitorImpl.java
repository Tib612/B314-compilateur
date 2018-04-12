package be.unamur.info.b314.compiler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.RuleNode;
import be.unamur.info.b314.compiler.exception.*;


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

    public Void visitProgramme(B314Parser.ProgrammeContext ctx){

        for (int i = 0; i <  ctx.fctDecl().size(); i++) {
            addFunctionToSymbolsTable(ctx.fctDecl(i));
        }

        /*nous devons récuperer toutes les var avant d'init les fonctions => nous
         utilisons une fonction visit children qui visite les déclarations de
         variables avant les déclarations de foncitons
         */
        visitChildrenVarDeclFirst(ctx);
        return null;
    }

    /**
     * Idem visitChildren, mais commence par visiter les varDecl avant tout !!
     *
     * @param node
     */
    public void visitChildrenVarDeclFirst(RuleNode node) {
        int n = node.getChildCount();

        for(int i = 0; i < n ; ++i) {
            if( node.getChild(i) instanceof B314Parser.VarDeclContext ) {
                ParseTree c = node.getChild(i);
                c.accept(this);
            }
        }
        for(int i = 0; i < n ; ++i) {
            if( ! (node.getChild(i) instanceof B314Parser.VarDeclContext)) {
                ParseTree c = node.getChild(i);
                c.accept(this);
            }
        }

    }


    private Void addFunctionToSymbolsTable(B314Parser.FctDeclContext ctx){
        String nomFct = ctx.ID().get(0).toString();
        LOG.debug("Visit 2: FctDecl");
        if(ctx.ID().size() == 2) {
            LOG.debug("function name = '" + nomFct + "' output = " + ctx.ID().get(1));
        }else{
            LOG.debug("function name = '" + nomFct + "' output = void");
        }

        // check if id existed
        if (symTable.getGlobalScope().containsKey(nomFct)) {
            throw new VariableAlreadyDefinedException(
                    "Error at " + ctx.getText()+ ": Function " + nomFct + " is already defined!");
        }


        int nbArg=0;
        for (int i = 0; i < ctx.getChildCount() && !ctx.getChild(i).getText().equals(")"); i++) {
            if(ctx.getChild(i) instanceof B314Parser.VarDeclContext){
                nbArg++;
            }
        }
        LOG.debug("nb arg: "+nbArg);

        if(ctx.VOID().size() == 0){
            String typeFct = ctx.scalar().getText();
            symTable.getScope("_global").put(nomFct, new IdInfo("fct",typeFct, 0,nbArg));
        }else if(ctx.VOID().size() == 2){
            symTable.getScope("_global").put(nomFct, new IdInfo("fct","void", 0,nbArg));
        }else{
            symTable.printSymbolsTable();
            throw new TypeMismatchException("The return type of the function is not void");
        }
        return null;
    }

    /**
	 * Visit a parse tree produced by {@link B314Parser#varDecl}.
	 *
	 * @param ctx the parse tree representing the variable declaration syntax.
	 */
	@Override
	public Void visitVarDecl(B314Parser.VarDeclContext ctx) {

        LOG.debug("Visit 1: VarDecl (0)");

		String id = ctx.ID().getText();
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

		Scope scope = symTable.getCurrentScope();
		String scopeName = scope.getName();
		// check if id existed
		if (scope.containsKey(id)) {
			throw new VariableAlreadyDefinedException(
					"Error at " + ctxText+ ": Variable " + id + " is already defined!");
		}

		if(id.equals(scopeName)){
            throw new VariableAlreadyDefinedException(
                    "Error at " + ctxText + ": this name is the same as the function the variable is declared in!");
        }
        String typeStr ="";
        int dimension = 0;
        if (type instanceof B314Parser.ScalarContext) {
            typeStr = type.getText();
            if (id.equals("arena")){
                throw new ArenaDeclarationException(
                        "Error at " + ctxText + ": Arena is not an array!");
            }

            LOG.debug("A scalar variable declared: " + typeStr + " " + id + " in scope: "+ scopeName);

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
                    || !scopeName.equals(SymbolsTable.GLOBAL)
               ) ){
                
                throw new ArenaDeclarationException(
                        "Error at " + ctxText + ": Arena error!");
            }

            LOG.debug("A " + dimension + "D array of type " + typeStr + " was declared and named " + id);
        }
        symTable.put(scopeName, id, new IdInfo("var",typeStr, dimension));
    }

    /**
     * Visit a parse tree produced by {@link B314Parser#fctDecl}.
	 * Fill the Symbol table with Functions declared in FctDecl
     *
     * @modifies symTable est modifiée
     */
    @Override
    public Void visitFctDecl(B314Parser.FctDeclContext ctx) {

        String nomFct = ctx.ID().get(0).toString();
        LOG.debug("Visit 2: FctDecl");

		visitChildren(ctx, nomFct);

        //verifier que ID est du même type que le type de retour de a fonction et un scalar
        if(ctx.VOID().size() == 0){
            String typeFct = ctx.scalar().getText();
            String returnType = symTable.getIdInfo(ctx.ID(1).getText()).getDataType();
            int returnTypeDim = symTable.getIdInfo(ctx.ID(1).getText()).getDimension();
            if( !typeFct.equals(returnType) || returnTypeDim!=0){
                symTable.printSymbolsTable();
                throw new TypeMismatchException("The variable returned by the function is not of the same type as the return type of the function: function type is "+typeFct+" returntype is "+returnType);
            }
        }

        //verifier que les arguments ne sont pas des listes
        for (int i=0;i<symTable.getIdInfo(nomFct).getNbArg();i++) {
            B314Parser.VarDeclContext x = ctx.varDecl(i);
            if(symTable.getIdInfo(x.ID().getText()).getDimension() != 0) {
                symTable.printSymbolsTable();
                throw new TypeMismatchException("The arguments of the function are arrays: " + x.ID().getText());
            }
        }

        return null;
    }

    /**
     * Visit a parse tree produced by {@link B314Parser#clauseWhen}.
     * Fill the Symbol table with Variables declared in ClauseWhen
     *
     * @modifies symTable est modifiée
     */
    @Override
    public Void visitClauseWhen(B314Parser.ClauseWhenContext ctx) {
        LOG.debug("Visit 3: when");
		visitChildren(ctx, "when");

        return null;
    }

    /**
     * Visit a parse tree produced by {@link B314Parser#clauseDefault}.
     * Fill the Symbol table with Variables declared in ClauseDefault
     *
     * @modifies symTable est modifiée
     */
    @Override
    public Void visitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
        LOG.debug("Visit 4: default");
        visitChildren(ctx, "default");

        return null;
    }


    /**
     * Visit the parse tree in a particular scope
     */
    private void visitChildren(RuleNode ctx, String scope) {
    	symTable.createNewScope(scope);
    	visitChildren(ctx);
    	//don't delete the scope for the functions, it is required to check their return type
    	if(scope.equals("when")||scope.equals("default")) {
            symTable.deleteScope(scope);
        }
    }

	/**
	 * Visit a parse tree produced by {@link B314Parser#exprG}.
	 *
	 * @throws ElementUndefinedException if the id of this expression was not declared.
	 * @throws TypeMismatchException if the array-dimension of the referred
	 *				variable is not compatible with its declaration.
	 */
	@Override
	public Void visitExprG(B314Parser.ExprGContext ctx) { 
		visitChildren(ctx);

		Scope scope = symTable.getCurrentScope();
		String lhsId = ctx.ID().getSymbol().getText();
		IdInfo lhsInfo = symTable.getIdInfo(lhsId);

		if (lhsInfo == null) {
			throw new ElementUndefinedException(
				ctx.getText() + " The variable " + lhsId + " might not be defined!");
		}

		int lhsDimension = ctx.exprEnt().size();
		int lhsExpectedDimension = lhsInfo.getDimension();
		if (lhsDimension > lhsExpectedDimension) {
            symTable.printSymbolsTable();
            throw new TypeMismatchException(ctx.getText() +
				"Incompatible types: " + lhsId + " was declared as a " +
				lhsExpectedDimension + "D variable but used as a " + 
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

		Scope scope = symTable.getCurrentScope();
		if (!scope.containsKey(lhsId)) {
			scope = symTable.getGlobalScope();
		}

		IdInfo lhsInfo = scope.getVar(lhsId);
		if (lhsInfo.getDimension() != lhsExpr.exprEnt().size()) {
			throw new IllegalAffectationException(ctx.getText() + 
				" The lhs expression cannot be of array type!");
		}

		String lhsType = lhsInfo.getDataType();
		String rhsType = getRhsExprType(ctx.exprD());
		if (!lhsType.equals(rhsType)) {
            symTable.printSymbolsTable();
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
			IdInfo rhsInfo = symTable.getIdInfo(rhsId);

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
				type = symTable.getIdInfo(rhsId).getDataType();

			} else { // symbolType == B314Parser.LPAR, c'est une expression parenthese
				type = getRhsExprType(rhsExpr.exprD(0));
			}
		}
        LOG.debug("le type de l'RHS est: "+type);
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
			IdInfo lhsInfo = symTable.getIdInfo(lhsId);
			String lhsType = lhsInfo.getDataType();

			if (!lhsType.equals(typeName)) {
                symTable.printSymbolsTable();
                throw new TypeMismatchException(lhsId +
					" Type " + typeName + " expected but " + lhsId + " is of type " + lhsType + ".");
			}

			if (lhsExpr.exprEnt().size() != lhsInfo.getDimension()) {
			    symTable.printSymbolsTable();
				throw new TypeMismatchException(
					lhsId + " Type " + typeName + " expected but array type was found!");
			}
		}
	}
}
