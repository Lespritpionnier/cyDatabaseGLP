package mainStructures.toolsModule.makeAnalysis.comdAutomate;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BoxSELECT extends AutoBoxArchetype {
    public BoxSELECT(ArrayList<ExecutionTree> nodes, StringTokenizer remain) {
        super(nodes, remain);

    }
    @Override
    public void runAutomate() {
    }

}
