package mainStructures.toolsModule;

import java.util.ArrayList;

import mainStructures.dataFramework.Table_database;
import mainStructures.saveStockpile.CyDatabase;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.TreeBuilder;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;
import mainStructures.toolsModule.makeAnalysis.SyntaxHandling;

public class Test {
	public static void main(String[] args){
		/*SyntaxHandling test = new SyntaxHandling("SELECT aa.you, bb.him cc.her FROM tb1 AS aa JOIN tb2 AS bb ON condition JOIN tb3 AS cc ON condition WHERE you=1;");
		ArrayList<ExecutionTree> abc = test.getNodes();
		
		CommandJointJOIN join1=new CommandJointJOIN();
		CommandJointJOIN join2=new CommandJointJOIN();*/
		
		
		
		
		
		
		Table_database tab1=new Table_database("tab1", null);
		Table_database tab2=new Table_database("tab2", null);
		Table_database tab3=new Table_database("tab3", null);
		
		CyDatabase base=new CyDatabase();
		base.addTable(tab1);
		base.addTable(tab2);
		base.addTable(tab3);
		
		base.serializationSave("fichier.ser");
		base.serializationRead("fichier.ser");
		CommandProjectionSELECT proj=new CommandProjectionSELECT();
		CommandSelectionWHERE sel=new CommandSelectionWHERE();
		
		/*TreeBuilder tree= new TreeBuilder();
		tree.add(proj);
		tree.add(sel);
		
		*/
		/*for(ExecutionTree tests : abc) {
		System.out.println(tree.getName(tests));
		}*/
		//tree.buildTree();
}
}
//(tests.getClass().getName()