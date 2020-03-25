package mainStructures.toolsModule.makeAnalysis.comdAutomate;

import mainStructures.dataFramework.Table_database;
import mainStructures.textExecutable.commands.CommandJointJOIN;

import java.util.ArrayList;

public class BoxJOIN{
    private ArrayList<String> choiceON = new ArrayList<>();

//    public BoxJOIN(String name){
//        super(name);
//        choiceON = null;
//    }

    public BoxJOIN() {
		// TODO Auto-generated constructor stub
	}

	public void addChoiceON(String choice) {
        choiceON.add(choice);
    }

    public CommandJointJOIN makeNode() {
        CommandJointJOIN join = new CommandJointJOIN();
        join.setCondition(choiceON);
        return join;
    }


  /*!!!!!!!!!!!
    public BoxJOIN(ArrayList<ExecutionTree> nodes, StringTokenizer remain) {

        super(nodes, remain);
    }
  !!!!!!!!!!!*/

}
