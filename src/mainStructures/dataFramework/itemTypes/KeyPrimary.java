package mainStructures.dataFramework.itemTypes;

import mainStructures.dataFramework.Item_row;
import mainStructures.dataFramework.exceptions.WrongDataTypeException;

public class KeyPrimary implements Item_row {
    private Long data;

    public KeyPrimary(long value) {
        data=value;
    }

    public Long getData() {
        return data;
    }

   /*
    @Override
    public boolean checkTypeCorrect(DataArchetype item) throws WrongDataTypeException {
        return false;
    }

    @Override
    public void setData(DataArchetype item) {

    }

    @Override
    public boolean equals(DataArchetype item) {
        return false;
    }

 */
}