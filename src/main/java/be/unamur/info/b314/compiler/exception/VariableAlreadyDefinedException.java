package be.unamur.info.b314.compiler.exception;


public class VariableAlreadyDefinedException extends RuntimeException {

    public VariableAlreadyDefinedException(String message, Exception e) {
        super(message, e);
    }
    
    public VariableAlreadyDefinedException(String message){
        super(message);
    }

}
