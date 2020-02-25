package mainStructures.dataFramework;

import java.util.ArrayList;

public class AWarehouse {
    private String name;
    private ArrayList<Table_warehouse> arrayTables = new ArrayList<>();

    public AWarehouse(String name) { this.name = name; }

    public String getName() {
        return name;
    }
}
