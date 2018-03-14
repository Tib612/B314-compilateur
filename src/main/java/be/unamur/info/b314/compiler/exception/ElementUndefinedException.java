package be.unamur.info.b314.compiler.exception;


public class ElementUndefinedException extends RuntimeException {

    public ElementUndefinedException(String message, Exception e) {
        super(message, e);
    }
    
    public ElementUndefinedException(String message){
        super(message);
    }

}
