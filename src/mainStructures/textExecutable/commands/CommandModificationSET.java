package mainStructures.textExecutable.commands;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitors.TreeVisitor;

public class CommandModificationSET implements ExecutionTree {
    @Override
    public ExecutionTree getLeft() {
        return null;
    }

    @Override
    public ExecutionTree getRight() {
        return null;
    }

    @Override
    public <T> T accept(TreeVisitor<T> visitor) {
        return null;
    }
    //Check if the type is PrimaryKEY. If so, return Exception
}
