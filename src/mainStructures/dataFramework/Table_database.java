package mainStructures.dataFramework;

import mainStructures.dataFramework.exceptions.TableFormatProblemException;
import mainStructures.dataFramework.itemTypes.KeyPrimary;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.pairVisitors.TreeVisitor;

import java.util.ArrayList;
import java.util.HashMap;

public class Table_database extends ArrayList<Row_table> implements ExecutionTree {
 //   private KeyPrimary keyCurrent;
    private String tableName;
    private HashMap<String,String> infoDatatype;
    private String primaryKey;
    private HashMap<String,String> foreignKeys;
    private int nextKey; //MAYBE RELATE TO SIZE()
    //private ArrayList<Integer> indexRanked = new ArrayList<>()


    public Table_database(String tableName, HashMap<String,String> infoDatatype) {
       this.tableName=tableName;
       this.infoDatatype = infoDatatype;
       nextKey=1; //MAYBE RELATE TO SIZE()
    }



    //Think about REMOVE()



    @Override
    public boolean add(Row_table row_table) {
        //try {
        //    checkFormat(row_table);
            row_table.put(primaryKey,new KeyPrimary(nextKey));
            super.add(row_table);
        //} catch (TableFormatProblemException e){System.out.println("FORMAT NOT MATCH!!!");return false;}
        nextKey++;
        return true;
    }
    public void checkFormat(Row_table row_table) throws TableFormatProblemException {
        //NEED TO ADD A PART FOR NULL DATA
        if ((infoDatatype.size()-1)==row_table.size()){
            //if (infoDatatype.equals(row_table.getColumnsName)) { return; }
        } throw new TableFormatProblemException();
    }



    public void setForeignKeys(HashMap<String, String> foreignKeys) {
        this.foreignKeys = foreignKeys;
    }

    @Override
    public String toString() {
        return "Table_database{" + "tableName='" + tableName + '\'' + '}' + "\n";
    }

    @Override
    public <T> T accept(TreeVisitor<T> visitor) {
        return null;
    }
    public String getColumnsType(String nameCol) { return infoDatatype.get(nameCol); }
    public String getKeyName() { return primaryKey; }
    public String getName() { return tableName; }
    public int getNextKey() { return nextKey; }
    @Override
    public ExecutionTree getLeft() { return null; }
    @Override
    public ExecutionTree getRight() { return null; }
}
