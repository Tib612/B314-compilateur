package be.unamur.info.b314.compiler;

import java.util.HashMap;
import java.util.Map;

/**
 * this contains the function to work on the symbols Table
 *
 * @specfield symTable dictionary of tables of identifiants grouped by scope. 
 * @specfield currentScopeName name of the scope that is being visited.
 */
public class SymbolsTable {

    private HashMap<String, Scope > symTable;
    private String currentScopeName;
    public static final String GLOBAL = "_global";
    private int whenCounter = 0;

    public SymbolsTable(){
        symTable = new HashMap<String,Scope>();
        symTable.put(GLOBAL,new Scope(GLOBAL));
        currentScopeName = GLOBAL;
    }

    /**
     * @return the dictionary containing the identifiants in the scope being visited.
     */
    public Scope getCurrentScope() {
        return getScope(currentScopeName);
    }

    /**
     * @return the dictionary containing the global variables and function names.
     */
    public Scope getGlobalScope(){
        return symTable.get(GLOBAL);
    }

    /**
     * @param scope the scope name
     * @return the dictionary of identifiants referred by scope name.
     */
    public Scope getScope(String scope){
        return symTable.get(scope);
    }

    /**
     * Create new dictionary to store identifiants in a particular scope
     * 
     * @param name String containing the name of the new scope
     * @effects the current scope is the newly created scope
     */ 
    public void createNewScope(String name){

        if(name.equals("_when")){
            name = name.concat( String.valueOf(whenCounter++));
        }

        symTable.put(name, new Scope(name));
        currentScopeName = name;
    }

    public void setCurrentScopeName(String name){
        currentScopeName = name;
    }


    /**
     * Find information related to the given variable. If there are two variables (one global
     * and one local) with the same id, the variable in current scope is returned.
     *
     * @param varName the name of the variable
     * @return IdInfo object containing informations related to the variable
     */
    public IdInfo getIdInfo(String varName) {
        Scope scope = getCurrentScope();
        if (!scope.containsKey(varName)) {
            scope = getGlobalScope();
        }
        return scope.getVar(varName);
    }

    public int[] getRelativeAddress(String varName){
        int[] result = new int[2];

        Scope scope = getCurrentScope();
        if (!scope.containsKey(varName)) {
            result[0] = 1;
            scope = getGlobalScope();
        }else{
            result[0] = 0;
        }

        result[1] = scope.getVar(varName).getAddressPCode();
        return result;
    }

    public void printSymbolsTable(){
        System.out.println("\n\n la table des symboles:");
        for (Map.Entry<String, Scope> entry : symTable.entrySet())
        {
            System.out.println(entry.getKey());
            entry.getValue().printScope();
        }
    }

    public boolean currentScopeIsGlobal(){
        return currentScopeName.equals(GLOBAL);
    }
}
