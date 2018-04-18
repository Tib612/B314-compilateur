package be.unamur.info.b314.compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * define a object to store variables with the same scope
 *
 * @specfield name is the name of the function (including _global, when, default) in witch the variables are declared
 * @specfield scope is an hashmap in which the key is the name of the variable and the value contains the info about the variable stored in an IdInfo
 */
public class Scope {

    private String name;
    private HashMap<String, IdInfo> scope;

    public Scope(String fctName) {
        name = fctName;
        scope = new HashMap<>();
    }

    public boolean containsKey(String id) {
        return scope.containsKey(id);
    }

    public void put(String name, IdInfo info) {
        scope.put(name, info);
    }

    public String getName() {
        return name;
    }

    public IdInfo getVar(String id) {
        return scope.get(id);
    }

    public void printScope() {

        for (Map.Entry<String, IdInfo> subEntry : scope.entrySet()) {
            IdInfo info = subEntry.getValue();
            System.out.println("\t" + subEntry.getKey() + "/ [" + info.getIdType()
                    + " , " + info.getDataType() + " , " + info.getDimension() + " , " + info.getNbArg() + " ]");
        }
    }
}

/**
 * Utility class which stores information about the type of identifiant.
 *
 * @specfield idType type of identifiant, could be var (variable) or fct (function)
 * @specfield dataType data type of the identifiant. If the identifiant is a
 * function name, dataType represents return type of the function
 * @specfield dimension for an array-type variable, this field represents its number of dimensions.
 * for scalar-type variable and function, dimension = 0.
 */
class IdInfo {

    private String idType;
    private String dataType;
    private int dimension;
    private ArrayList<String> argsTypes;

    public IdInfo(String idType, String dataType, int dimension, ArrayList<String> argsTypes) {
        this.idType = idType;
        this.dataType = dataType;
        this.dimension = dimension;
        this.argsTypes = argsTypes;
    }

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

    public int getNbArg() {return argsTypes.size();}

    public ArrayList<String> getArgsTypes() {
        return argsTypes;
    }
}