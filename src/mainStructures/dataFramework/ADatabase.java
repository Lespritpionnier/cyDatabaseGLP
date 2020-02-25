package mainStructures.dataFramework;

import java.util.ArrayList;

public class ADatabase {
    private String name;
    private ArrayList<Table_database> listTables = new ArrayList<Table_database>();

    public ADatabase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
