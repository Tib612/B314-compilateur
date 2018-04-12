package be.unamur.info.b314.compiler.exception;


import be.unamur.info.b314.compiler.SymbolsTable;

public class TypeMismatchException extends RuntimeException {

    public TypeMismatchException(String message, Exception e) {
        super(message, e);
    }
    
    public TypeMismatchException(String message){
        super(message);
    }

    public TypeMismatchException(String location, String lhsType, String rhsType) {

		super(location + 
			" There is a type mismatch between the two sides of the expression:" +
			" rhs expression is of type " + lhsType +
			" but lhs expression is of type " + rhsType);
    }
}
