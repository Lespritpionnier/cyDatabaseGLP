package mainStructures.dataFramework;

import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitors.TreeVisitor;

import java.util.ArrayList;

public class Table_list extends TableArchetype implements ExecutionTree {
 //   private KeyPrimary keyCurrent;
    private ArrayList<Row_table> rows = new ArrayList<>();
    private ArrayList<String> columns = new ArrayList<>();

   public Table_list(String name) { super(name); }
   public Table_list(String name, ArrayList<Row_table> rows) {
      super(name);
      this.rows = rows;
   }

   public void addRow(){
        //TODO
    }
    public void addColumn(String name){
        //TODO
    }

   @Override
   public <T> T accept(TreeVisitor<T> visitor) {
      return null;
   }
}
