package mainStructures.toolsModule.pairVisitors;

import mainStructures.dataFramework.Table_list;
import mainStructures.dataFramework.Table_array;

public interface TableVisitor<TableArchetype> {

    public TableArchetype visit(Table_array tableArray);
    public TableArchetype visit(Table_list tableList);
}
