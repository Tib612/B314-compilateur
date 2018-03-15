package be.unamur.info.b314.compiler;

import java.util.HashMap;
import java.util.Map;

public class SymbolsTable {

    private HashMap<String, Scope > symTable;

    public SymbolsTable(){
        symTable = new HashMap<String,Scope>();
        symTable.put("global",new Scope("global"));
    }


    public Scope getScope(String scope){
        return symTable.get(scope);
    }

    public void createNewScope(String name){
        symTable.put(name, new Scope(name));
    }

    public void printSymbolsTable(){
        System.out.println("\n\n la table des symboles:");
        for (Map.Entry<String, Scope> entry : symTable.entrySet())
        {
            System.out.println(entry.getKey());
            entry.getValue().printScope();
        }
    }
}
