package mainStructures.dataFramework;

import mainStructures.dataFramework.dataDetails.DataArchetype;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitor.TreeVisitor;

public class Table_warehouse extends TableArchetype implements ExecutionTree {
    //Primary Key is in the first column
    private Item_row[][] table;

    public Table_warehouse(String name) { super(name); }
    public Table_warehouse(String name, Item_row[][] table) {
        super(name);
        this.table = table;
    }
    public Table_warehouse(String name, int dimRows, int dimColumns) {
        super(name);
        setDimRows(dimRows);
        setDimColumns(dimColumns);
        table = new Item_row[dimRows][dimColumns];
    }

    @Override
    public <T> T accept(TreeVisitor<T> visitor) {
        return null;
    }
}
