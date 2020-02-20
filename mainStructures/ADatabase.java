package mainStructures;

import mainStructures.dataFramework.Table_database;

import java.util.ArrayList;

public class ADatabase {
    private String name;
    private ArrayList<Table_database> tables = new ArrayList<Table_database>();

    public ADatabase(String name) {
        this.name = name;
    }

}
