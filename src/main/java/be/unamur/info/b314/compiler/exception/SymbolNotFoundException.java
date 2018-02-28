package be.unamur.info.demo.compiler.exception;




/**
 *
 * @author Xavier Devroey - xavier.devroey@unamur.be
 */
public class SymbolNotFoundException extends Exception{

    public SymbolNotFoundException(String message) {
        super(message);
    }

    public SymbolNotFoundException(String message, Exception cause) {
        super(message, cause);
    }
    
}
