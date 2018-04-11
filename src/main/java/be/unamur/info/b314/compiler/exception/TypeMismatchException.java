package be.unamur.info.b314.compiler.exception;


import be.unamur.info.b314.compiler.SymbolsTable;

public class TypeMismatchException extends RuntimeException {

    public TypeMismatchException(String message, Exception e) {
        super(message, e);
    }
    
    public TypeMismatchException(SymbolsTable symTable,String message){
        super(message);
        symTable.printSymbolsTable();
    }

    public TypeMismatchException(SymbolsTable symTable,String location, String lhsType, String rhsType) {

		super(location + 
			" There is a type mismatch between the two sides of the expression:" +
			" rhs expression is of type " + lhsType +
			" but lhs expression is of type " + rhsType);
        symTable.printSymbolsTable();
    }
}
