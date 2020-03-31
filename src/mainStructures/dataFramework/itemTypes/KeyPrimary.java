package mainStructures.dataFramework.itemTypes;

import mainStructures.dataFramework.ItemRow;
import mainStructures.dataFramework.exceptions.WrongDataTypeException;

public class KeyPrimary implements ItemRow {
    private Long data;

    public KeyPrimary(long value) {
        data=value;
    }

    public Long getData() {
        return data;
    }
    
    public String toString() {
        return "KeyPrimary:{"  + data +'}';
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
