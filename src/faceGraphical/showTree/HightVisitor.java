package faceGraphical.showTree;

import mainStructures.dataFramework.Table_database;
import mainStructures.textExecutable.commands.CommandArchetype;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;
import mainStructures.toolsModule.pairVisitors.TreeVisitor;

public class HightVisitor implements TreeVisitor<Void> {
	
	private int height = 0;
	private int currentHeight = 0;

	public int getHeight() {
		return height;
	}

	
	private void processTable() {
		if (height < currentHeight) {
			height = currentHeight;
		}
	}

	

	private void processCommand(CommandArchetype node) {
		currentHeight++;
		node.getLeft().accept(this);
		node.getRight().accept(this);
		currentHeight--;
	}

	@Override
	public Void visit(CommandProjectionSELECT node) {
		processCommand(node);
		return null;
	}

	@Override
	public Void visit(CommandSelectionWHERE node) {
		processCommand(node);
		return null;
	}

	@Override
	public Void visit(CommandJointJOIN node) {
		processCommand(node);
		return null;
	}

	

	@Override
	public Void visit(Table_database node) {
		processTable();
		return null;
	}

	

}
