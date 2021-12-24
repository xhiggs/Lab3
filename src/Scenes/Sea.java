package Scenes;

import Actors.Creature;

import java.util.Objects;


public class Sea {
    public ISeaArea onSurface, atBottom;

    public Sea(ISeaArea onSurface, ISeaArea atBottom) {
        this.onSurface = onSurface;
        this.atBottom = atBottom;
    }

    public void liftFromBottomToSurface(Creature creature) {
        this.atBottom.remove(creature);
        this.onSurface.add(creature);
        System.out.print(" Что-то вздымалось к поверхности");
    }

    public void clear() {
        this.atBottom.clear();
        this.onSurface.clear();
    }

    @Override
    public String toString() {
        return "Sea{" + "onSurface=" + onSurface + ", atBottom=" + atBottom + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sea sea = (Sea) o;
        return Objects.equals(onSurface, sea.onSurface) && Objects.equals(atBottom, sea.atBottom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onSurface, atBottom);
    }
}
