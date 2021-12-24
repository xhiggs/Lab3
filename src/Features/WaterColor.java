package Features;

public enum WaterColor {
    RIFFLE_GREEN(", в темно-зеленой толще воды"), DARK_BLUE("<No description>");

    public final String description;

    private WaterColor(String description) {
        this.description = description;
    }
}
