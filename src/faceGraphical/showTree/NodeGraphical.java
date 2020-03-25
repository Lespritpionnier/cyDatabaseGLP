package faceGraphical.showTree;


import mainStructures.dataFramework.Table_database;
import mainStructures.textExecutable.ExecutionTree;

import mainStructures.textExecutable.commands.CommandArchetype;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;



public class NodeGraphical{

	private static final String JOIN_SYMBOL="CommandJointJOIN";
	private static final String SELECT_SYMBOL="CommandProjectionSELECT";
	private static final String WHERE_SYMBOL ="CommandSelectionWHERE";
	//private static final String CREATE_SYMBOL = "Création";
	//private static final String DELETE_SYMBOL = "Suppression";


	
	public static Table_database createConstant(String name) {
		return new Table_database(name, null);
	}



	public static CommandArchetype createOperation(String type, ExecutionTree left, ExecutionTree right) throws IllegalArgumentException {
		
	
			switch (type) {
			case JOIN_SYMBOL:
				return new CommandJointJOIN();
			case SELECT_SYMBOL:
				return new CommandProjectionSELECT(null);
			case WHERE_SYMBOL:
				return new CommandSelectionWHERE(null);
			
			default:
				throw new IllegalArgumentException("Unknown operation type : " + type);
			}
		}
	}




