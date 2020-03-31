package mainStructures.dataFramework.itemTypes;
import mainStructures.dataFramework.ItemRow;
import mainStructures.toolsModule.makeAnalysis.comdAutomate.BoxSELECT;

public class DataBit implements ItemRow {
    private Boolean data;

    public DataBit(String value) {
        SetValue(value);
    }

    public Boolean getData() {
        return data;
    }

    public void setData(Boolean data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataBit{"  + data + '}';
    }

    protected void SetValue(String value) {
        switch (value){
            case "YES": {
                data = true;
                break;
            }
            case "NO": {
                data = false;
                break;
            }
        }
    }
















/*
    @Override
    public boolean checkTypeCorrect(DataArchetype item){
        //TODO
    }

    @Override
    public void setData(DataArchetype item){
        try(checkTypeCorrect()){
            //TODO
        }catch (WrongDataTypeException){
            //TODO
        }
    }

    @Override
    public boolean equals(DataArchetype item) {
        //TODO
    }
 */


}