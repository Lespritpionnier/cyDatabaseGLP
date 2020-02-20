package mainStructures.dataFramework;

public class DataBoole extends Item_row{
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
