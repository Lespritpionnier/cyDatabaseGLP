package mainStructures.textCommands.nodesPart;

import mainStructures.toolsModule.treeExcutable.ParsingVisitor;

import java.util.ArrayList;

public class CommandSelectionWHERE extends CommandArchetypeNode {
    private ArrayList<Integer> markedRows_Indexes;
    private ArrayList<String> justForPre =new ArrayList<>();

    public CommandSelectionWHERE(ArrayList<String> predicateConditions) {
        super();
        //loop to add predicateConditions
        justForPre = predicateConditions;
    }

//    public String toString() {
//        return "\n VOICI WHERE!{Conditions:" + justForPre + '}' + "\n";
//    }
    
    public CommandSelectionWHERE() {
	}

//	public void addCondition (String condition){
//        ResultPredicateCondition pC = new ResultPredicateCondition(condition);
//        predicateConditions.add(pC);
//    }

    @Override
    public String getFormulaRA() {
        return "Sel("+right.getFormulaRA()+")";
    }

    @Override
    public <T> T accept(ParsingVisitor<T> visitor) {
        return null;
    }
}
