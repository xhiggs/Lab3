package Features;

public enum AssociativeShape {
    MOUNTAIN_RANGE(", словно горный хребет с таинственного ландшафта морского дна... "),
    GIANT_TREE_TRUNK(" стволом гигантского дерева");

    public final String description;

    private AssociativeShape(String description) {
       this.description = description;
    }
}
