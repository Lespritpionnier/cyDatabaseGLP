package mainStructures.dataFramework;


import mainStructures.dataFramework.itemTypes.Constraint;
import mainStructures.dataFramework.itemTypes.DataArchetype;

public abstract class Item_row implements DataArchetype {
    /**
     * ATTENTION: Use AddData() with checkConstraint()!
     */
    private String name;
    private Constraint constraint;

    public Item_row(String name) {
        this.name = name;
        constraint = new Constraint("NULL");
    }
    public Item_row(String name, String constraint) {
        this.name = name;
        this.constraint = new Constraint(constraint);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setConstraint(String constraint) {
        this.constraint.setConstraint(constraint);
    }
    public String getName() { return name; }
    public String getConstraint() { return constraint.toString(); }
}
