package mainStructures.textCommands.nodesPart;

public abstract class CommandArchetypeNode implements ExecutionTree{
    protected ExecutionTree left;
    protected ExecutionTree right;

    public CommandArchetypeNode() {
        left = null;
        right = null;
    }

    public CommandArchetypeNode(ExecutionTree left, ExecutionTree right) {
        this.left = left;
        this.right = right;
    }
    public CommandArchetypeNode(ExecutionTree only) {
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


