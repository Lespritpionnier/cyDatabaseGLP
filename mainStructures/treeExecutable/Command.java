package mainStructures.treeExecutable;
import mainStructures.Table;

public abstract class Command implements Execution{
	private Table table;
	
	public Execution getLeftOperation() {
		return null;
	}
	
	public Execution getRightOperation() {
		return null;
	}
	public String calculate() {
		return null;
	}
	
}
