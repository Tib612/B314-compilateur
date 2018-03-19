package be.unamur.info.b314.compiler;

import java.util.HashMap;
import java.util.Map;

/**
 * this contains the function to work on the symbols Table
 *
 * @specfield symTable represent the
 */
public class SymbolsTable {

    private HashMap<String, Scope > symTable;
    private String currentScope = "_global";

    public SymbolsTable(){
        symTable = new HashMap<String,Scope>();
        symTable.put("_global",new Scope("_global"));
    }

    public String getCurrentScope() {
        return currentScope;
    }

    public Scope getScope(String scope){
        return symTable.get(scope);
    }

    public void createNewScope(String name){
        symTable.put(name, new Scope(name));
        currentScope = name;
    }

    public Void deleteScope(String name){
        symTable.remove(name);
        return null;
    }

    public void printSymbolsTable(){
        System.out.println("\n\n la table des symboles:");
        for (Map.Entry<String, Scope> entry : symTable.entrySet())
        {
            System.out.println(entry.getKey());
            entry.getValue().printScope();
        }
    }

    public void setCurrentScope(String currentScope) {
        this.currentScope = currentScope;
    }
}
