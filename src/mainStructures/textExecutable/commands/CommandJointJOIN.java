package mainStructures.textExecutable.commands;

import mainStructures.dataFramework.dataDetails.KeyForeign;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitor.TreeVisitor;

public class CommandJointJOIN extends CommandArchetype {
    private KeyForeign choiceON;
    
    
    public CommandJointJOIN(ExecutionTree left, ExecutionTree right) {
    	super(left, right);
		
	}
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
		// TODO Auto-generated method stub
		return null;
	}

    
    /**
     * We only need the name of the column be chosen
     *             but not the syntax with "="?????????????
     */

}
