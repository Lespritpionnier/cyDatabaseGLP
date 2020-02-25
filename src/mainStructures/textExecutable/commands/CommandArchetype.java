package mainStructures.textExecutable.commands;

import mainStructures.textExecutable.ExecutionTree;

public abstract class CommandArchetype {
    private ExecutionTree left;
    private ExecutionTree right;

    public CommandArchetype() {
        left = null;
        right = null;
    }

    public CommandArchetype(ExecutionTree left, ExecutionTree right) {
        this.left = left;
        this.right = right;
    }
    public CommandArchetype(ExecutionTree only) {
        left = only;
        right = null;
    }

    public void setLeft(ExecutionTree left) {
        this.left = left;
    }
    public void setRight(ExecutionTree right) {
        this.right = right;
    }
    public ExecutionTree getLeft() {
        return left;
    }
    public ExecutionTree getRight() {
        return right;
    }

}


