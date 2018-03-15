package be.unamur.info.b314.compiler.exception;

public class ArenaDeclarationException extends RuntimeException {

    public ArenaDeclarationException(String message, Exception e) {
        super(message, e);
    }

    public ArenaDeclarationException(String message){
        super(message);
    }
}
