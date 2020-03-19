package mainStructures.toolsModule.pairVisitors;

import mainStructures.dataFramework.Table_database;

public interface TableVisitor<TableArchetype> {

    public TableArchetype visit(Table_database tableArray);
    public TableArchetype visit(Table_database tableList);
}
