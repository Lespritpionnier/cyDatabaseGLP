package mainStructures.dataFramework;

import mainStructures.toolsModule.pairVisitor.TableVisitor;

public abstract class TableArchetype {
    private int dimColumns;
    private int dimRows;

    <T> T accept(TableVisitor<T> visitor) {
        return null;
    }
}
