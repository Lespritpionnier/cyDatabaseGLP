package mainStructures.nodeCommand;

import mainStructures.toolsModule.treeExcutable.ParsingVisitor;

public class CommandJointJOIN extends CommandArchetypeNode {
    String condition;

    public CommandJointJOIN() {
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    public String getCondition() {
		return condition;
	}


    @Override
    public String getFormulaRA() {
        return "Join("+left.getFormulaRA()+","+right.getFormulaRA()+")";
    }

    @Override
	public <T> T accept(ParsingVisitor<T> visitor) {
		return visitor.visit(this);
	}

    
    /**
     * We only need the name of the column be chosen
     *             but not the syntax with "="?????????????
     */

}
