package mainStructures.textCommands;

import mainStructures.toolsModule.treeExcutable.TreeVisitor;

public interface ExecutionTree {

    ExecutionTree getLeft();
    ExecutionTree getRight();
    void setLeft(ExecutionTree node);
    void setRight(ExecutionTree node);

    
    <T> T accept(TreeVisitor<T> visitor);

}
