package mainStructures.toolsModule.pairVisitors;

import mainStructures.dataFramework.Table_database;
import mainStructures.textExecutable.commands.*;

public interface TreeVisitor<T> {

    T visit(CommandProjectionSELECT node);

    T visit(CommandSelectionWHERE node);

    T visit(CommandJointJOIN node);

    T visit(Table_database node);

}
