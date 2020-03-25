package mainStructures.dataFramework.itemTypes;

import mainStructures.dataFramework.Item_row;

public class DataText implements Item_row {
    private String data;

    public DataText(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataText{" + '\'' + data + '\'' + '}';
    }
}
