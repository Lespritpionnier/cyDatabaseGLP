package mainStructures.dataFramework;

import mainStructures.textExecutable.ExecutionTree;

public abstract class TableArchetype {
    protected String name;
    private int dimColumns;
    private int dimRows;
    private ExecutionTree left;
    private ExecutionTree right;

    public TableArchetype(String name) {
        this.name = name;
        left = null;
        right = null;
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
