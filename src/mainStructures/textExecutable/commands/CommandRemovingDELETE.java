package mainStructures.textExecutable.commands;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitors.TreeVisitor;

public class CommandRemovingDELETE implements ExecutionTree {
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
}
