package mainStructures.toolsModule.pairVisitor;

import mainStructures.dataFramework.Table_database;
import mainStructures.dataFramework.Table_warehouse;

public interface TableVisitor<TableArchetype> {

    public TableArchetype visit(Table_warehouse tableArray);
    public TableArchetype visit(Table_database tableList);
}
