package Features;


public enum MotionShape {
    SLIDE(" скользнуло"), SHINE(", что-то забелело. Неужели брюхо Пантолошки?");

    public final String description;

    private MotionShape(String description) {
        this.description = description;
    }
}

