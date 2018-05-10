package be.unamur.info.b314.compiler;

import java.util.ArrayList;

/**
 * Utility class which stores information about the type of identifiant.
 *
 * @specfield idType type of identifiant, could be var (variable) or fct (function)
 * @specfield dataType data type of the identifiant. If the identifiant is a
 * function name, dataType represents return type of the function
 * @specfield dimension for an array-type variable, this field represents its number of dimensions.
 * for scalar-type variable and function, dimension = null.
 */
class IdInfo {

    private String idType;
    private String dataType;
    private int[] dimension;
    private ArrayList<String> argsTypes;
    private int addressPCode;

    public IdInfo(int id, String idType, String dataType, ArrayList<String> argsTypes) {
        addressPCode = id;
        this.idType = idType;
        this.dataType = dataType;
        this.argsTypes = argsTypes;
    }


    public IdInfo(int id,String idType, String dataType, int[] dimension) {
        addressPCode = id;
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
        return dimension == null ? 0 : dimension.length;
    }

    public int[] getDimensionArray() {
        return dimension;
    }

    public int getAddressPCode(){
        return addressPCode;
    }

    public int getSize(){
        if (dimension == null) return 1;
        return dimension.length == 1 ? dimension[0] : dimension[0]*dimension[1];
    }

    public String getDimensionInfo() {
        if(dimension == null){
            return "/";
        }
        if(dimension.length == 1){
            return "[ "+ dimension[0] +" ]";
        }
        if(dimension.length == 2){
            return "[ "+ dimension[0] + " , " + dimension[1] +" ]";
        }
        return "There might be an error!";
    }

    public int getNbArg() {
        return argsTypes == null ? 0 : argsTypes.size();
    }

    public ArrayList<String> getArgsTypes() {
        return argsTypes;
    }
}