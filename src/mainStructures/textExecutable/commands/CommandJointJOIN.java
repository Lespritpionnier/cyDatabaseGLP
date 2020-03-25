package mainStructures.textExecutable.commands;

import mainStructures.dataFramework.itemTypes.KeyForeign;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitors.TreeVisitor;

import java.util.ArrayList;

public class CommandJointJOIN extends CommandArchetype implements ExecutionTree {
    KeyForeign choiceON;
    ArrayList<String> condition;

    public CommandJointJOIN() {
    }

    public void setCondition(ArrayList<String> condition) {
        this.condition = condition;
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
