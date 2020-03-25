package saveStockpile;

import mainStructures.dataFramework.Table_database;

import java.io.Serializable;
import java.util.HashMap;

public class CyDatabase implements Serializable {
    private HashMap<String, Table_database> myTables = new HashMap<String, Table_database>();

    public void addTable (Table_database newTable) {
        myTables.put(newTable.getName(),newTable);
    }
    public Table_database getTable(String tableName){
        return myTables.get(tableName);
    }

}