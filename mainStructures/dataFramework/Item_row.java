package mainStructures.dataFramework;


import java.util.HashMap;
import java.util.Hashtable;

public abstract class Item_row implements DataArchetype{
    /**
     * ATTENTION: Use AddData() with checkConstraint()!
     */
    private String name;
    private ConditionRestricted constraint = new ConditionRestricted("NULL");

    public void setName(String name) {
        this.name = name;
    }
    public void setConstraint(String conditionRestricted) {
        constraint.setConstraint(conditionRestricted);
    }

}
