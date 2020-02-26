package mainStructures.textExecutable;

import java.util.ArrayList;
import java.util.Stack;

import faceGraphical.showTree.elements.NodeGraphical;
import mainStructures.textExecutable.commands.CommandArchetype;
import mainStructures.textExecutable.commands.CommandJointJOIN;


public class TreeBuilder {
    private ExecutionTree root;
    private ArrayList<String> stocking= new ArrayList<String>();
    
    
    public TreeBuilder() {
    	
    }
    
    public void addAll(ArrayList<String> list) {
    	stocking.addAll(list);
    }
    
   
    
    public void add(ExecutionTree node) {
    	TreeBuilder tree= new TreeBuilder();
    	String AddingNode;
    	Class<? extends Object> test;
    	test=tree.makeTree(node);
    	AddingNode=tree.getName(test.getName());
    	
    	stocking.add(AddingNode);
    }
    
  
    public ArrayList<String> getStocking(){
    	return stocking;
    }

    public Class<? extends Object> makeTree(ExecutionTree node){
		return ((Object) node).getClass();   
    } 
    
    public String getName(String name) {
    	int pos = name.lastIndexOf(".");
    	if (pos > -1) {
    		return name.substring(pos+1);
    	} else {
		return name;
    	}
    }
    
    public ExecutionTree buildTree() {
		Stack<ExecutionTree> stack = new Stack<ExecutionTree>();
		String constantValue = "";
		String variableName = "";

		for (int index = 0; index < stocking.size(); index++) {
			// The current char in the formula to process
			String currentChar = stocking.get(index).substring(index, index + 1);

			if (!isCommands(currentChar)) {
				// Verify if it is the end of the formula or the end of the
				// constant chain / variable chain.
				boolean end = ((index + 1) == stocking.size())
						|| (isCommands(stocking.get(index).substring(index + 1, index + 2)));

				ExecutionTree operand = null;
				if (isTable(currentChar)) {
					constantValue += currentChar;
					if (end) {
						// All numbers are gathered, create the constant
						operand = NodeGraphical.createConstant(constantValue);
						constantValue = "";
					}
				} 
				if (end) {
					if (stack.isEmpty()) {
						// This is the case at beginning.
						stack.push(operand);
					} else {
						ExecutionTree peek = stack.peek();
						if (peek instanceof CommandJointJOIN) {
							((CommandJointJOIN) peek).setRight(operand);
						} else {
							stack.push(operand);
						}
					}
				}
			} else {
				// We need two different treatments for * and +/-
				if (currentChar.equals("CommandJointJOIN")) {
					// Create the * with the existing left operand.
					// The right operand will be null for the moment.
					ExecutionTree pop = stack.pop();
					CommandArchetype operation = NodeGraphical.createOperation(
							currentChar, pop, null);
					stack.push(operation);
				} else {
					// Process operations addition(+) or subtraction(-).
					if (stack.size() == 2) {
						ExecutionTree rightOperand = stack.pop();
						CommandArchetype operation = (CommandArchetype) stack.pop();
						operation.setRight(rightOperand);
						CommandArchetype newOperation = NodeGraphical.createOperation(
								currentChar, operation, null);
						stack.push(newOperation);
					} else {
						ExecutionTree leftOperand = stack.pop();
						CommandArchetype operation = NodeGraphical.createOperation(
								currentChar, leftOperand, null);
						stack.push(operation);
					}
				}
			}
		}

		// The last step for merge the two arithmetic operations.
		if (stack.size() == 2) {
			ExecutionTree rightOperand = stack.pop();
			CommandArchetype operation = (CommandArchetype) stack.peek();
			operation.setRight(rightOperand);
		}

		// Return the root of the tree (the root IS the tree).
		return stack.pop();
	}
    
    
    

	private boolean isCommands(String value) {
		return value.equals("CommandArrangementORDER") || value.equals("CommandJointJOIN") || value.equals("CommandJointJOIN") 
				|| value.equals("CommandModificationSET") 
				|| value.equals("CommandProjectionSELECT") || value.equals("CommandRemovingDELETE") || value.equals("CommandSelectionWHERE"); 
				
	}

	private boolean isTable(String value) {
		return !isCommands(value);
	}
    
}
