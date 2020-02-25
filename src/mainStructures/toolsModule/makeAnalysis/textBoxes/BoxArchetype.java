package mainStructures.toolsModule.makeAnalysis.textBoxes;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.TreeBuilder;

import java.util.ArrayList;

public abstract class BoxArchetype {
    private ArrayList<String> textAllocated = new ArrayList<>();


    public ExecutionTree makeNode(ExecutionTree node){
        return node;
    }


}
