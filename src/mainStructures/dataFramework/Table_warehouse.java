package mainStructures.dataFramework;

import mainStructures.dataFramework.dataDetails.DataArchetype;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitor.TreeVisitor;

public class Table_warehouse extends TableArchetype implements ExecutionTree {
    //Primary Key is in the first column
    private Item_row[][] table = new Item_row[][];

    @Override
    public <T> T accept(TreeVisitor<T> visitor) {
        return null;
    }
}
