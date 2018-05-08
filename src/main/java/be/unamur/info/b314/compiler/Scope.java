package be.unamur.info.b314.compiler;

import java.util.*;

/**
 * define a object to store variables with the same scope
 *
 * @specfield name is the name of the function (including _global, when, default) in witch the variables are declared
 * @specfield scope is an hashmap in which the key is the name of the variable and the value contains the info about the variable stored in an IdInfo
 */
public class Scope {

    private String name;
    private HashMap<String, IdInfo> scope;
    private int scopeMaxId = 0;

    public Scope(String fctName) {
        name = fctName;
        scope = new HashMap<>();
    }

    public int size(){
        return scope.size();
    }

    public boolean containsKey(String id) {
        return scope.containsKey(id);
    }

    public void put(String name, String idType, String dataType, int dimension1, int dimension2, ArrayList<String> argsTypes) {
        scope.put(name, new IdInfo(scopeMaxId,idType,dataType,dimension1,dimension2,argsTypes));
        if(!idType.equals("fct")) {
            if (dimension1 == 0) {
                scopeMaxId++;
            } else {
                if (dimension2 == 0) {
                    scopeMaxId += dimension1;
                } else {
                    scopeMaxId += dimension1 * dimension2;
                }
            }
        }
    }

    public void put(String name, String idType, String dataType, int dimension1, int dimension2) {
        scope.put(name, new IdInfo(scopeMaxId,idType,dataType,dimension1,dimension2));
        if(dimension1 == 0){
            scopeMaxId++;
        }else{
            if(dimension2 == 0){
                scopeMaxId += dimension1;
            }else{
                scopeMaxId += dimension1 * dimension2;
            }
        }
    }

    public List<IdInfo> getIdInfoOrderedByAddressPCode(){
        List<IdInfo> mapValues = new ArrayList<>(scope.values());
        Collections.sort(mapValues, Comparator.comparing(IdInfo::getAddressPCode));
        return mapValues;
    }

    public String getName() {
        return name;
    }

    public IdInfo getVar(String id) {
        return scope.get(id);
    }

    public int getScopeMaxId(){
        return scopeMaxId;
    }

    public String getTypeByAddressPCode(int address){
        for (Map.Entry<String, IdInfo> subEntry : scope.entrySet()) {
            IdInfo info = subEntry.getValue();
            if(info.getAddressPCode() == address){
                return info.getDataType();
            }
        }
        return "";
    }


    public void printScope() {

        for (Map.Entry<String, IdInfo> subEntry : scope.entrySet()) {
            IdInfo info = subEntry.getValue();
            System.out.println("\t" + subEntry.getKey() + "/ [" + info.getIdType()
                    + " , " + info.getDataType() + " , dim: " + info.getDimensionInfo() + " , nbArg: " + info.getNbArg() + " ]");
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
    private int[] dimension;
    private ArrayList<String> argsTypes;
    private int addressPCode;

    public IdInfo(int id, String idType, String dataType, int dimension1, int dimension2, ArrayList<String> argsTypes) {
        addressPCode = id;
        this.idType = idType;
        this.dataType = dataType;
        if(dimension1 == 0){
            this.dimension = new int[0];
        }else{
            if(dimension2 == 0){
                this.dimension = new int[1];
            }else{
                this.dimension = new int[2];
                this.dimension[1] = dimension2;
            }
            this.dimension[0] = dimension1;
        }
        this.argsTypes = argsTypes;
    }


    public IdInfo(int id,String idType, String dataType, int dimension1, int dimension2) {
        addressPCode = id;
        this.idType = idType;
        this.dataType = dataType;
        if(dimension1 == 0){
            this.dimension = new int[0];
        }else{
            if(dimension2 == 0){
                this.dimension = new int[1];
            }else{
                this.dimension = new int[2];
                this.dimension[1] = dimension2;
            }
            this.dimension[0] = dimension1;
        }
        this.argsTypes = new ArrayList<>();
    }

    public String getIdType() {
        return idType;
    }

    public String getDataType() {
        return dataType;
    }

    public int getDimension() {
        return dimension.length;
    }

    public int[] getDimensionArray() {
        return dimension;
    }

    public int getAddressPCode(){
        return addressPCode;
    }

    public int getNextAddress(){
        return addressPCode + getsize();
    }

    public int getsize(){
        if(dimension.length == 0){
            return 1;
        }else if(dimension.length == 1){
            return dimension[0];
        }else{
            return dimension[0]*dimension[1];
        }
    }

    public String getDimensionInfo() {
        if(dimension.length == 0){
            return "/";
        }else if(dimension.length == 1){
            return "[ "+ dimension[0] +" ]";
        }else if(dimension.length == 2){
            return "[ "+ dimension[0] + " , " + dimension[1] +" ]";
        }
        return "";
    }

    public int getNbArg() {return argsTypes.size();}

    public ArrayList<String> getArgsTypes() {
        return argsTypes;
    }
}