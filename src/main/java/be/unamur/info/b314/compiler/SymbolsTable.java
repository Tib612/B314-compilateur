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

    /**
     * Delete the dictionary of a particular scope
     * 
     * @param name String containing the name of the scope to be delete
     * @effects the current scope is set to global
     */ 
    public void deleteScope(String name){
        symTable.remove(name);
        currentScopeName = GLOBAL;
    }

    /**
     * Add variable/function data to the corresponding dictionary of identifiants
     *
     * @param scope the name of the scope
     * @param varName the name of the variable to be added
     * @param info IdInfo object containing informations related to the variable
     */
    public void put(String scope, String varName, IdInfo info) {
        symTable.get(scope).put(varName, info);
    }

    /**
     * Add global variable/function data to the global dictionary
     *
     * @param varName the name of the variable to be added
     * @param info IdInfo object containing informations related to the variable
     */
    public void putGlobal(String varName, IdInfo info) {
        this.put(GLOBAL, varName, info);
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

    public void printSymbolsTable(){
        System.out.println("\n\n la table des symboles:");
        for (Map.Entry<String, Scope> entry : symTable.entrySet())
        {
            System.out.println(entry.getKey());
            entry.getValue().printScope();
        }
    }
}
