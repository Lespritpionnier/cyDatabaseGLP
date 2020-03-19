package mainStructures.toolsModule.makeAnalysis.textBoxes;

import mainStructures.dataFramework.Table_array;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.commands.CommandJointJOIN;

public class BoxJOIN extends BoxFROM {
    private String choiceON;

    public BoxJOIN(String name){
        super(name);
        choiceON = null;
    }

    public void setChoiceON(String choiceON) {
        this.choiceON = choiceON;
    }

    @Override
    public ExecutionTree makeNode() {
        if(choiceON==null){
            return new Table_array(tableName);
        }
        CommandJointJOIN join = new CommandJointJOIN();
        join.setCondition(choiceON);
        return join;
    }
}
