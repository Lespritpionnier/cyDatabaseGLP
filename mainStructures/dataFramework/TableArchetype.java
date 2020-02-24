package mainStructures.dataFramework;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitor.TableVisitor;

public abstract class TableArchetype {
    protected String name;
    private int dimColumns;
    private int dimRows;

    public TableArchetype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDimColumns() {
        return dimColumns;
    }
    public void setDimColumns(int dimColumns) {
        this.dimColumns = dimColumns;
    }

    public int getDimRows() {
        return dimRows;
    }
    public void setDimRows(int dimRows) {
        this.dimRows = dimRows;
    }

    public ExecutionTree getLeft() { return null; }
    public ExecutionTree getRight() { return null; }
}
