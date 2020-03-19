package saveStockpile;

import mainStructures.dataFramework.Table_database;

import java.io.Serializable;
import java.util.ArrayList;

public class CyDatabase implements Serializable {
    private String name;
    private ArrayList<Table_database> listTables = new ArrayList<Table_database>();
    private ArrayList<Table_database> arrayTables = new ArrayList<>();

    public CyDatabase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
