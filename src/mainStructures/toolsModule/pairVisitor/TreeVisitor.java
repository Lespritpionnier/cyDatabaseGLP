package mainStructures.toolsModule.pairVisitor;

import mainStructures.dataFramework.Table_database;
import mainStructures.dataFramework.Table_warehouse;
import mainStructures.textExecutable.commands.*;

public interface TreeVisitor<T> {

    T visit(CommandProjectionSELECT node);

    T visit(CommandSelectionWHERE node);

    T visit(CommandJointJOIN node);

    T visit(CommandModificationSET node);

    T visit(CommandRemovingDELETE node);

    T visit(Table_database node);

    T visit(Table_warehouse node);

}
