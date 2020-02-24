package mainStructures.dataFramework;

import mainStructures.dataFramework.dataDetails.DataArchetype;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitor.TreeVisitor;

public class Table_warehouse extends TableArchetype implements ExecutionTree {
    //Primary Key is in the first column
    private Item_row[][] table = new Item_row[][];

    public Table_warehouse(Item_row[][] table) {
        this.table = table;
    }

    @Override
    public <T> T accept(TreeVisitor<T> visitor) {
        return null;
    }
}
