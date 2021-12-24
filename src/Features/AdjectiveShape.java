package Features;

public enum AdjectiveShape {
    HUGE("громадное, "), FORMIDABLE("грозное, "), MOTIONLESS("неподвижное."),
    GREENISH_MOSSY(" Зеленовато-замшелым");

    public final String description;

    private AdjectiveShape(String description) {
        this.description = description;
    }
}
