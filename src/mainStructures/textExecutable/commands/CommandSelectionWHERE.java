package mainStructures.textExecutable.commands;

import mainStructures.textExecutable.ExecutionTree;

import java.util.ArrayList;

public class CommandSelectionWHERE implements ExecutionTree {
    private ArrayList<Integer> markedRows_Indexes;
    private ArrayList<PredicateCondition> predicateConditions = new ArrayList<>();


    public void addCondition (String condition){
        conditions.add(condition);
    }
}
