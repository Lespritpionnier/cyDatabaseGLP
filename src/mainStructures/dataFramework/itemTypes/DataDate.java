package mainStructures.dataFramework.itemTypes;

import mainStructures.dataFramework.Item_row;

public class DataDate implements Item_row {
    private String data;

    @Override
    public String toString() {
        return "DataDate{" + data + '\'' + '}';
    }

    public DataDate(String value) {
        data=value;
    }


}
