package dataStructures;

public interface Data {

    public void checkTypeRight() throws TypeWrongException;
    public void modifyData(Data item) throws TypeWrongException;
}
