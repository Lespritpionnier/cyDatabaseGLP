package faceGraphical.showTree.elements;

import java.awt.Color;
import java.awt.Graphics;

import faceGraphical.showTree.ColorStrategt;
import mainStructures.dataFramework.Table_list;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;


public class PaintColor implements ColorStrategt{
	
	@Override
	public void setColor(Graphics graphics, CommandJointJOIN node) {
		graphics.setColor(Color.RED);
	}

	@Override
	public void setColor(Graphics graphics, CommandProjectionSELECT node) {
		graphics.setColor(Color.BLUE);

	}

	@Override
	public void setColor(Graphics graphics, CommandSelectionWHERE node) {
		processOperation(graphics);
	}

	@Override
	public void setColor(Graphics graphics, Table_list node) {
		processOperation(graphics);

	}

	

	@Override
	public void setLineColor(Graphics graphics) {
		graphics.setColor(Color.BLACK);

	}

	private void processOperation(Graphics graphics) {
		graphics.setColor(Color.BLACK);

	}

}
