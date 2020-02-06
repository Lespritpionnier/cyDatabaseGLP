package mainStructures.dataFramework;

public interface Data {

    public void checkTypeCorrect() throws TypeWrongException;
    public void modifyData(Data item) throws TypeWrongException;
}
