package mainStructures.toolsModule.treeExcutable;

import mainStructures.toolsModule.dealDatagram.ZonedData;
import mainStructures.dataFramework.TableDatabase;
import mainStructures.nodeCommand.CommandJointJOIN;
import mainStructures.nodeCommand.CommandProjectionSELECT;
import mainStructures.nodeCommand.CommandSelectionWHERE;
import mainStructures.toolsModule.dealDatagram.JoinComparator;
import mainStructures.toolsModule.dealDatagram.SelectProjector;
import mainStructures.toolsModule.dealDatagram.WhereFilter;

public class ExecutiveVisitor implements ParsingVisitor<ZonedData>{

	@Override
	public ZonedData visit(CommandProjectionSELECT node) {
		ZonedData tab = node.getRight().accept(this);
		return SelectProjector.goWork(node.getDataWanted(), tab);
	}

	@Override
	public ZonedData visit(CommandSelectionWHERE node) {
		ZonedData tab = node.getRight().accept(this);
		return WhereFilter.goWork(node.getPreConditions(), tab);
	}

	@Override
	public ZonedData visit(CommandJointJOIN node) {
		ZonedData tab1 = node.getLeft().accept(this);
//System.out.println("TB1 in V "+tab1);
		ZonedData tab2 = node.getRight().accept(this);
//System.out.println("TB2 in V "+tab2);
		return JoinComparator.goWork(node.getCondition(), tab1, tab2);
	}

	@Override
	public ZonedData visit(TableDatabase node) {
		return node.toVirtual();
	}

}
