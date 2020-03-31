package mainStructures.textCommands.nodesPart;

import mainStructures.dataFramework.itemTypes.KeyForeign;
import mainStructures.textCommands.ExecutionTree;
import mainStructures.toolsModule.treeExcutable.ParsingVisitor;

import java.util.ArrayList;

public class CommandJointJOIN extends CommandArchetypeNode {
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
    public String getFormulaRA() {
        return "Join("+left.getFormulaRA()+", "+right.getFormulaRA()+")";
    }

    @Override
	public <T> T accept(ParsingVisitor<T> visitor) {
		// TODO Auto-generated method stub
		return null;
	}

    
    /**
     * We only need the name of the column be chosen
     *             but not the syntax with "="?????????????
     */

}
