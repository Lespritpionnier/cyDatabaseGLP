package faceGraphical.showTree;


import mainStructures.dataFramework.TableDatabase;
import mainStructures.nodeCommand.CommandJointJOIN;
import mainStructures.nodeCommand.CommandArchetypeNode;
import mainStructures.nodeCommand.CommandProjectionSELECT;
import mainStructures.nodeCommand.CommandSelectionWHERE;
import mainStructures.nodeCommand.ExecutionTree;



public class NodeGraphical{

	private static final String JOIN_SYMBOL="CommandJointJOIN";
	private static final String SELECT_SYMBOL="CommandProjectionSELECT";
	private static final String WHERE_SYMBOL ="CommandSelectionWHERE";


	
	public static TableDatabase createConstant(String name) {
		return new TableDatabase(name, null);
	}



	public static CommandArchetypeNode createOperation(String type, ExecutionTree left, ExecutionTree right) throws IllegalArgumentException {
		
	
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




