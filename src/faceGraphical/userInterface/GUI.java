package faceGraphical.userInterface;

import java.util.ArrayList;

import javax.swing.JFrame;

import faceGraphical.showTree.elements.TreePanel;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.TreeBuilder;



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
	public GUI(ArrayList<String> input) {
		super("Graphical Tree Demo");

		TreeBuilder builder = new TreeBuilder();
		builder.addAll(input);
		ExecutionTree tree = builder.buildTree();

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
		ArrayList<String> list= new ArrayList<String> ();
		list.add("CommandJointJOIN");
		list.add("CommandProjectionSELECT");
		list.add("CommandSelectionWHERE");
		list.add("Table_datebase");
		new GUI(list);
	}
}