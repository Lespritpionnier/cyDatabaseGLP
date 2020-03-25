package faceGraphical.userInterface;

import java.util.ArrayList;

import javax.swing.JFrame;

import faceGraphical.showTree.elements.TreePanel;
import mainStructures.dataFramework.Table_database;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.TreeBuilder;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;
import mainStructures.toolsModule.makeAnalysis.SyntaxHandling;



public class GUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TreePanel treePanel;

	/**
	 * To create a graphical tree frame, we need to specify the input tree text file.
	 * 
	 * @param input the name of input file with its path
	 */
	public GUI(ArrayList<ExecutionTree> input) {
		super("Graphical Tree Demo");

		TreeBuilder builder = new TreeBuilder();
		builder.addAll(input);
		ExecutionTree tree = builder.buildTree1(input);

		treePanel = new TreePanel(tree);

		initLayout();
	}

	private void initLayout() {
		getContentPane().add(treePanel);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}


	public static void main(String[] args) {
		//SyntaxHandling test = new SyntaxHandling("SELECT aa.you, bb.him cc.her FROM tb1 AS aa JOIN tb2 AS bb ON condition JOIN tb3 AS cc ON condition WHERE you=1;");
		//ArrayList<ExecutionTree> list = test.getNodes();
		CommandJointJOIN join1=new CommandJointJOIN();
		CommandJointJOIN join2=new CommandJointJOIN();
		Table_database tab1=new Table_database("tab1", null);
		Table_database tab2=new Table_database("tab2", null);
		Table_database tab3=new Table_database("tab3", null);
		CommandProjectionSELECT proj=new CommandProjectionSELECT(null);
		CommandSelectionWHERE sel=new CommandSelectionWHERE(null);
		ArrayList<ExecutionTree> list =new ArrayList<ExecutionTree> ();
		TreeBuilder tree=new TreeBuilder();
		list.add(proj);
		list.add(sel);
		list.add(tab1);
		list.add(join1);
		list.add(tab2);
		
		System.out.println(tree.relationnel(list));
		tree.buildTree1(list);
		new GUI(list);
	}
}