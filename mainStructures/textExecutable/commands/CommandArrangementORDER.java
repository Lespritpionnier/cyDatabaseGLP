package mainStructures.textExecutable.commands;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitor.TreeVisitor;

public class CommandArrangementORDER implements ExecutionTree {
    private String markedColumn;
    private Boolean ifDESC = false;

    @Override
    public ExecutionTree getLeft() {
        return null;
    }

    @Override
    public ExecutionTree getRight() { return null; }

    @Override
    public <T> T accept(TreeVisitor<T> visitor) {
        return null;
    }
    //PAS POUR L'INSTANT
}
