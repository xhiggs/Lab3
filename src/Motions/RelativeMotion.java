package Motions;

// Зеленовато-замшелым стволом гигантского дерева скользнуло оно наверх под киль лодки.

import Actors.Creature;
import Features.AdjectiveShape;
import Features.AssociativeShape;
import Features.MotionShape;

import java.util.Objects;

public record RelativeMotion(Object object, Creature creature, AdjectiveShape adjectiveShape,
                             AssociativeShape associativeShape, MotionShape motionShape) {

    public void run() {
        System.out.print(this);
    }

    public String toString() {
        return this.adjectiveShape.description + this.associativeShape.description + this.creature.toString() +
                this.motionShape.description + this.object.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelativeMotion that = (RelativeMotion) o;
        return Objects.equals(object, that.object) && Objects.equals(creature, that.creature) && adjectiveShape == that.adjectiveShape && associativeShape == that.associativeShape && motionShape == that.motionShape;
    }

    @Override
    public int hashCode() {
        return Objects.hash(object, creature, adjectiveShape, associativeShape, motionShape);
    }
}
