package mainStructures.treeExecutable;

import java.util.ArrayList;

public class CommandSelectionWHERE extends CommandArchetype {
    private ArrayList<String> conditions = new ArrayList<String>();


    public void addCondition (String condition){
        conditions.add(condition);
    }
}
