package be.unamur.info.b314.compiler.exception;


public class IllegalAffectationException extends RuntimeException {

    public IllegalAffectationException(String message, Exception e) {
        super(message, e);
    }
    
    public IllegalAffectationException(String message){
        super(message);
    }

}
