package be.unamur.info.b314.compiler;

import be.unamur.info.b314.compiler.exception.VariableAlreadyDefinedException;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    private String name;
    private HashMap<String, String[]> scope;

    public Scope(String fctName){
        name = fctName;
        scope = new HashMap<String, String[]>();
    }

    public boolean containsKey(String id){
        return scope.containsKey(id);
    }

    public void put(String name,String[] list) throws VariableAlreadyDefinedException{
        scope.put(name, list);
    }

    public String[] getVar(String id) {
        return scope.get(id);
    }

    public  Void printScope(){

        for(Map.Entry<String, String[]> subEntry : scope.entrySet()){
            System.out.println("    "+subEntry.getKey() + "/ [" + subEntry.getValue()[0] + " , "+ subEntry.getValue()[1]+" ]");
        }
        return null;
    }
}
