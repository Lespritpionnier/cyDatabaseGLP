package dataStructures.framework;

public interface Data {

    public void checkTypeCorrect() throws TypeWrongException;
    public void modifyData(Data item) throws TypeWrongException;
}
