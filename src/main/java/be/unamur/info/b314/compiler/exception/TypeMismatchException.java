package be.unamur.info.b314.compiler.exception;


public class TypeMismatchException extends RuntimeException {

    public TypeMismatchException(String message, Exception e) {
        super(message, e);
    }
    
    public TypeMismatchException(String message){
        super(message);
    }

}
