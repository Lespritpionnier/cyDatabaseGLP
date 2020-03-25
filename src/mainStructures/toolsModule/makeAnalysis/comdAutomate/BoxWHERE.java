package mainStructures.toolsModule.makeAnalysis.comdAutomate;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;

import java.util.ArrayList;

public class BoxWHERE {
    ArrayList<String> conditions = new ArrayList<>();

    public BoxWHERE(ArrayList<String> conditions) {
        this.conditions = conditions;
    }

    public ExecutionTree makeNode() {
        return new CommandSelectionWHERE(conditions);
    }
}
