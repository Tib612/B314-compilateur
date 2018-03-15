package be.unamur.info.b314.compiler;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    private String name;
    private HashMap<String, IdInfo> scope;

    public Scope(String fctName){
        name = fctName;
        scope = new HashMap<String, IdInfo>();
    }

    public boolean containsKey(String id){
        return scope.containsKey(id);
    }

    public void put(String name,IdInfo info) {
        scope.put(name, info);
    }

    public IdInfo getVar(String id) {
        return scope.get(id);
    }

    public void printScope(){

        for(Map.Entry<String, IdInfo> subEntry : scope.entrySet()){
            IdInfo info = subEntry.getValue();
            System.out.println("\t" + subEntry.getKey() + "/ [" + info.getIdType() 
                + " , " + info.getDataType() + " , " + info.getDimension() + " ]");
        }
    }
}

/**
 * Utility class which stores information about the type of identifiant.
 *
 * @specfield idType type of identifiant, could be var (variable) or fct (function)
 * @specfield dataType data type of the identifiant. If the identifiant is a 
 *                     function name, dataType represents return type of the function
 * @specfield dimension for an array-type variable, this field represents its number of dimensions.
 *                      for scalar-type variable and function, dimension = 0.
 */
class IdInfo {

    String idType;
    String dataType;
    int dimension;
    
    public IdInfo(String idType, String dataType, int dimension) {
        this.idType = idType;
        this.dataType = dataType;
        this.dimension = dimension;
    }

    public String getIdType() {
        return idType;
    }

    public String getDataType() {
        return dataType;
    }

    public int getDimension() {
        return dimension;
    }
}