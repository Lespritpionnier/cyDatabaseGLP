package mainStructures.toolsModule.pairVisitors;

import mainStructures.dataFramework.Table_list;
import mainStructures.dataFramework.Table_array;
import mainStructures.textExecutable.commands.CommandJointJOIN;

public class MergeVisitor implements TableVisitor {
    @Override
    public Table_array visit(Table_array tableArray) {
        return tableArray;
    }

    @Override
    public Table_array visit(Table_list tableList) {
        Table_array table_convert = new Table_array();
        //TODO
        return table_convert;
    }

    public Table_array visit(CommandJointJOIN node) {
        Table_array table_merge = new Table_array();
        //TODO
        return table_merge;
    }
}
