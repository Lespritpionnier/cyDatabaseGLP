package mainStructures.toolsModule.pairVisitor;

import mainStructures.textExecutable.commands.*;

public interface TreeVisitor<T> {

    T visit(CommandProjectionSELECT node);

    T visit(CommandSelectionWHERE node);

    T visit(CommandJointJOIN node);

    T visit(CommandModificationSET node);

    T visit(CommandRemovingDELETE node);

}
