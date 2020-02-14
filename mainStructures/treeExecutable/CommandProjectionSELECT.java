package mainStructures.treeExecutable;

import mainStructures.dataFramework.DataArchetype;
import mainStructures.dataFramework.Item_row;

public class CommandProjectionSELECT extends Command{
    private boolean ifDISTINCT = false;
    //QUESTION: if tab[] will be better




    public void setDistinct(boolean ifDISTINCT) {
        this.ifDISTINCT = ifDISTINCT;
    }

    public int getCOUNT (String columnName, Table_database table){
        int count = 0;
        //TO DO
        return count;
    }
    public double getSUM (String columnName, Table_database table){
        double sum = 0;
        //TO DO
        return sum;
    }
    public double getAVG (String columnName, Table_database table){
        double numerator = getSUM(columnName, table);
        int denominator = getCOUNT(columnName, table);
        //Need to be better in performance
        return numerator/denominator;
    }
    public DataArchetype getMAX (String columnName, Table_database table){
        //Need a confirmation of the returning type
    }
    public DataArchetype getMIN (String columnName, Table_database table){
        //Need a confirmation of the returning type (ALL ABOVE)
    }
}
