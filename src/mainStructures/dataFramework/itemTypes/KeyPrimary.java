package mainStructures.dataFramework.itemTypes;

import mainStructures.dataFramework.Item_row;
import mainStructures.dataFramework.exceptions.WrongDataTypeException;

public class KeyPrimary extends Item_row {
    private long data;

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
}
