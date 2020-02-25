package mainStructures.dataFramework.dataDetails;

import mainStructures.dataFramework.exceptions.WrongDataTypeException;

public interface DataArchetype {
    /**
     * This is the type original of Data, so it's an Interface
     * @param item
     * @throws WrongDataTypeException
     */

    public boolean checkTypeCorrect(DataArchetype item) throws WrongDataTypeException;
    public void setData(DataArchetype item);
    public boolean equals (DataArchetype item);
}
