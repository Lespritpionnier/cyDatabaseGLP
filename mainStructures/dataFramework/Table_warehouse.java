package mainStructures.dataFramework;

import mainStructures.dataFramework.dataDetails.DataArchetype;
import mainStructures.textExecutable.ExecutionTree;

public class Table_warehouse extends TableArchetype implements ExecutionTree {
    //Primary Key is in the first column
    private DataArchetype[][] table = new DataArchetype[][];

}
