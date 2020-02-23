package mainStructures.textExecutable.commands;

import mainStructures.textExecutable.ExecutionTree;

import java.util.ArrayList;

public class CommandSelectionWHERE implements ExecutionTree {
    private ArrayList<String> conditions = new ArrayList<String>();


    public void addCondition (String condition){
        conditions.add(condition);
    }
}
