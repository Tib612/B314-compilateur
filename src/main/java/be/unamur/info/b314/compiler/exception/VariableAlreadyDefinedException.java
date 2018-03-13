package be.unamur.info.b314.compiler.exception;



/**
 * Exception class representing parsing errors.
 * @author Xavier Devroey - xavier.devroey@unamur.be
 */
public class VariableAlreadyDefinedException extends RuntimeException {

    public VariableAlreadyDefinedException(String message, RuntimeException e) {
        super(message, e);
    }
    
    public VariableAlreadyDefinedException(String message){
        super(message);
    }

}
