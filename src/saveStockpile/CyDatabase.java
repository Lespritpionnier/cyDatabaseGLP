package saveStockpile;

import mainStructures.dataFramework.Table_array;
import mainStructures.dataFramework.Table_list;

import java.io.Serializable;
import java.util.ArrayList;

public class CyDatabase implements Serializable {
    private String name;
    private ArrayList<Table_list> listTables = new ArrayList<Table_list>();
    private ArrayList<Table_array> arrayTables = new ArrayList<>();

    public CyDatabase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
