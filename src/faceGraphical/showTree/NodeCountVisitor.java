package faceGraphical.showTree;



import mainStructures.dataFramework.TableDatabase;
import mainStructures.textCommands.ExecutionTree;
import mainStructures.textCommands.nodesPart.CommandJointJOIN;
import mainStructures.textCommands.nodesPart.CommandProjectionSELECT;
import mainStructures.textCommands.nodesPart.CommandSelectionWHERE;
import mainStructures.toolsModule.treeExcutable.TreeVisitor;

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
	public Integer visit(TableDatabase node) {
		processTableNode(node);
		return null;
	}
}
