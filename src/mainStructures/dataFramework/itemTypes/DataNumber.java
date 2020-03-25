package mainStructures.dataFramework.itemTypes;

import mainStructures.dataFramework.Item_row;

public class DataNumber implements Item_row {
    private Double data;

    public DataNumber(String value) {
        data = Double.parseDouble(value);
    }

    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }
}
