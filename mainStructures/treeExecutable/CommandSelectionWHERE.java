package mainStructures.treeExecutable;

import java.util.ArrayList;

public class CommandSelectionWHERE extends Command {
    private ArrayList<String> conditions;



    public CommandSelectionWHERE(ArrayList<String> conditions) {
        this.conditions = conditions;
    }
    public void addCondition (String condition){
        conditions.add(condition);
    }
}
