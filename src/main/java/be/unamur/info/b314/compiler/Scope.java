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
    private final String FUNC_TYPE = "fct";
    private final String VAR_TYPE = "var";

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

    public void putFunc(String name, String funcDataType, ArrayList<String> argsTypes) {
        scope.put(name, new IdInfo(scopeMaxId, FUNC_TYPE, funcDataType, argsTypes));
    }

    public void putVar(String name, String varDataType, int[] dimension) {
        scope.put(name, new IdInfo(scopeMaxId, VAR_TYPE, varDataType, dimension));
        if (dimension == null || dimension.length == 0) {
            scopeMaxId++;
        } else {
            scopeMaxId += (dimension.length == 1) ? dimension[0] : dimension[0]*dimension[1];
        }
    }

    public List<IdInfo> getAllVar(){
        List<IdInfo> mapValues = new ArrayList<>(scope.values());
        mapValues.removeIf(obj -> obj.getIdType().equals("fct"));
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

    public void printScope() {

        for (Map.Entry<String, IdInfo> subEntry : scope.entrySet()) {
            IdInfo info = subEntry.getValue();
            System.out.println("\t" + subEntry.getKey() + "/ [" + info.getIdType()
                    + " , " + info.getDataType() + " , dim: " + info.getDimensionInfo() + " , nbArg: " + info.getNbArg() + " ]");
        }
    }
}

