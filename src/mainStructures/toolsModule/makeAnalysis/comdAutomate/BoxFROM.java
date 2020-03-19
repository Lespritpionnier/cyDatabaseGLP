package mainStructures.toolsModule.makeAnalysis.textBoxes;

import mainStructures.dataFramework.Table_array;
import mainStructures.textExecutable.ExecutionTree;

public class BoxFROM implements BoxArchetype{
    String tableName;
    public BoxFROM(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public ExecutionTree makeNode() {
        return new Table_array(tableName);
    }
}
