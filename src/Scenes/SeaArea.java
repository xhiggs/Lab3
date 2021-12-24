package Scenes;

import Features.WaterColor;
import java.util.HashSet;
import java.util.Objects;

public class SeaArea implements ISeaArea {
    private final WaterColor waterColor;
    private final HashSet<Object> objects;

    public SeaArea(WaterColor waterColor) {
        this.waterColor = waterColor;
        this.objects = new HashSet<>();
    }

    @Override
    public void add(Object object) {
        this.objects.add(object);
    }

    @Override
    public void remove(Object object) {
        this.objects.remove(object);
    }

    @Override
    public void clear() { this.objects.clear(); }

    @Override
    public void showColor() {
        System.out.print(this.waterColor.description);
    }

    @Override
    public String toString() {
        return "SeaArea{" + "waterColor=" + waterColor + ", objects=" + objects + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeaArea seaArea = (SeaArea) o;
        return waterColor == seaArea.waterColor && Objects.equals(objects, seaArea.objects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waterColor, objects);
    }
}