package mainStructures.dataFramework.dataTypes;

import mainStructures.dataFramework.Item_row;
import mainStructures.dataFramework.dataTypes.DataArchetype;
import mainStructures.dataFramework.exceptions.WrongDataTypeException;

public class DataBit extends Item_row {
    private boolean data;

    @Override
    public boolean checkTypeCorrect(DataArchetype item){

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


}
