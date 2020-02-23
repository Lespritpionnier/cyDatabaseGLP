package mainStructures.textExecutable;

import mainStructures.toolsModule.pairVisitor.TreeVisitor;

public interface ExecutionTree extends TreeVisitor {

    ExecutionTree getLeft();
    ExecutionTree getRight();
    <T> T accept(TreeVisitor<T> visitor);
}
