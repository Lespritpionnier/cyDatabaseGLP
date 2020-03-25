package mainStructures.toolsModule.makeAnalysis.comdAutomate;

import mainStructures.dataFramework.Table_database;
import mainStructures.textExecutable.ExecutionTree;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BoxFROM /*extends AutoBoxArchetype*/ {

    String tableName;
    public BoxFROM(String tableName) {
        this.tableName = tableName;
    }
    public ExecutionTree makeNode() {
        return new Table_warehouse(tableName);
    }















   /*!!!!!!!!!!!!!!
    public BoxFROM(ArrayList<ExecutionTree> nodes, StringTokenizer remain) {
        super(nodes, remain);
    }

    public BoxFROM(String temp) {
        super();
    }

    !!!!!!!!!!!!!!!!!*/
}
