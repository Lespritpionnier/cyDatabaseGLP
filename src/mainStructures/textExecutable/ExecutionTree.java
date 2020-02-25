package mainStructures.textExecutable;

import mainStructures.toolsModule.pairVisitor.TreeVisitor;

public interface ExecutionTree {

    ExecutionTree getLeft();
    ExecutionTree getRight();

    <T> T accept(TreeVisitor<T> visitor);

}
