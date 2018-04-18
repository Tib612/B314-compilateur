package be.unamur.info.b314.compiler.exception;

public class WrongNumberOfArguments extends RuntimeException {

    public WrongNumberOfArguments(String message, Exception e) {
        super(message, e);
    }

    public WrongNumberOfArguments(String message){
        super(message);
    }
}
