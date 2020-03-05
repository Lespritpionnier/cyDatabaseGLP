package faceGraphical.showTree;

import java.awt.Graphics;

import mainStructures.dataFramework.Table_list;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;

public interface ColorStrategt {

	void setColor(Graphics graphics, CommandJointJOIN node);

	void setColor(Graphics graphics, CommandProjectionSELECT node);

	void setColor(Graphics graphics, CommandSelectionWHERE node);

	void setColor(Graphics graphics, Table_list node);

	void setLineColor(Graphics graphics);
	
}
