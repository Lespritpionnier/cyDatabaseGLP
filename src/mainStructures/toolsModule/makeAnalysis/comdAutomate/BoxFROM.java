package mainStructures.toolsModule.makeAnalysis.comdAutomate;

import mainStructures.dataFramework.Table_database;
import mainStructures.textExecutable.ExecutionTree;

public class BoxFROM implements BoxArchetype{
    String tableName;
    public BoxFROM(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public ExecutionTree makeNode() {
        return new Table_database(tableName);
    }
}
