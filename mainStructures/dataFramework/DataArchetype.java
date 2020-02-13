package mainStructures.dataFramework;

public interface DataArchetype {

    public void setData(DataArchetype item) throws WrongDataTypeException;
    public boolean equals (DataArchetype value);
}
