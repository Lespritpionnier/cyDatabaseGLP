package mainStructures.textCommands;

import mainStructures.toolsModule.treeExcutable.TreeVisitor;

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

	@Override
	public void setLeft(ExecutionTree node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRight(ExecutionTree node) {
		// TODO Auto-generated method stub
		
	}
}
