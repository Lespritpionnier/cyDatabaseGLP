package mainStructures.treeExecutable;

public class CommandJointJOIN extends CommandArchetype {
    private String choiceON;

    /**
     * We only need the name of the column be chosen
     *             but not the syntax with "="
     * @param choiceON
     */

    public void setChoice (String choiceON){
        this.choiceON = choiceON;
    }
}
