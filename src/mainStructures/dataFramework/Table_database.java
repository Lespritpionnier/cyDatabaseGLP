package mainStructures.dataFramework;

import mainStructures.dataFramework.dataDetails.KeyPrimary;
import mainStructures.textExecutable.ExecutionTree;

import java.util.ArrayList;

public class Table_database extends TableArchetype implements ExecutionTree {
 //   private KeyPrimary keyCurrent;
    private ArrayList<Row_table> rows = new ArrayList<>();
    private ArrayList<String> columns = new ArrayList<>();

    public Table_database(String name) { this.name = name; }

    public void addRow(){
        //TODO
    }
    public void addColumn(String name){
        //TODO
    }

}
