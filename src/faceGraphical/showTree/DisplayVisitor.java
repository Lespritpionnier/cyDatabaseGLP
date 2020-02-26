package faceGraphical.showTree;

import java.awt.Graphics;

import faceGraphical.showTree.elements.NodePosition;
import mainStructures.dataFramework.Table_database;
import mainStructures.dataFramework.Table_warehouse;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandModificationSET;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandRemovingDELETE;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;
import mainStructures.toolsModule.pairVisitor.TreeVisitor;

public class DisplayVisitor implements TreeVisitor<Void> {
	public DisplayVisitor(Graphics g, NodePosition startPoint, int treeHeight) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Void visit(CommandProjectionSELECT node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(CommandSelectionWHERE node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(CommandJointJOIN node) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Void visit(Table_database node) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
