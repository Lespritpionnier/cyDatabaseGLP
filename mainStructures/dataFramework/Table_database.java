package mainStructures.dataFramework;

import mainStructures.treeExecutable.ExecutionTree;

import java.util.ArrayList;

public class Table_database implements ExecutionTree {
    private String name;
    private KeyPrimary keyCurrent;
    private ArrayList<Row_table> rows = new ArrayList<Row_table>();
    private ArrayList<String> columns = new ArrayList<String>();

    /**
     * The list "columns" here is just for stocking the information
     *                              not for manipulating
     * @param name
     * @param keyOriginal
     */

    public Table_database(String name,KeyPrimary keyOriginal) {
        this.name = name;
        keyCurrent = keyOriginal;
    }
    public void addRow(){
        //TODO
    }
    public void addColumn(String name){
        //TODO
    }
}
