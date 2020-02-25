package mainStructures.dataFramework.dataDetails;

import mainStructures.dataFramework.Item_row;
import mainStructures.dataFramework.exceptions.WrongDataTypeException;

public class DataBit extends Item_row {
    private boolean data;

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


}
