package faceGraphical.showTree;



import mainStructures.dataFramework.Table_database;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;
import mainStructures.toolsModule.pairVisitors.TreeVisitor;

public class NodeCountVisitor implements TreeVisitor<Integer>{
	private int count;

	public NodeCountVisitor() {
		count = 0;
	}
	

	private Integer processCommandNode(ExecutionTree node) {
		node.getLeft().accept(this);
		node.getRight().accept(this);
		return ++count;
	}
	
	private Integer processTableNode(ExecutionTree node) {
		return ++count;
	}
	
	
	@Override
	public Integer visit(CommandProjectionSELECT node) {
		processCommandNode(node);
		return null;
	}

	@Override
	public Integer visit(CommandSelectionWHERE node) {
		processCommandNode(node);
		return null;
	}

	@Override
	public Integer visit(CommandJointJOIN node) {
		processCommandNode(node);
		return null;
	}

	@Override
	public Integer visit(Table_database node) {
		processTableNode(node);
		return null;
	}
}
