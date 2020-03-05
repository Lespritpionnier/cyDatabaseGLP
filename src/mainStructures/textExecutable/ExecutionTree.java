package mainStructures.textExecutable;

import mainStructures.toolsModule.pairVisitors.TreeVisitor;

public interface ExecutionTree {

    ExecutionTree getLeft();
    ExecutionTree getRight();
    
    
    <T> T accept(TreeVisitor<T> visitor);

}
