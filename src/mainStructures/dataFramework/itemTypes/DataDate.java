package mainStructures.dataFramework.itemTypes;

import mainStructures.dataFramework.ItemRow;

public class DataDate implements ItemRow {
    private String data;

    @Override
    public String toString() {
        return "DataDate{" + data + '\'' + '}';
    }

    public DataDate(String value) {
        data=value;
    }


}
