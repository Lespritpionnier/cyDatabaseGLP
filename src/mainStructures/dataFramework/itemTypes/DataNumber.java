package mainStructures.dataFramework.itemTypes;

import mainStructures.dataFramework.ItemRow;

public class DataNumber implements ItemRow {
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

    @Override
    public String toString() {
        return "DataNumber{" +
                "data=" + data +
                '}';
    }

}
