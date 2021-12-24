package Actors;

import Features.AssociativeShape;
import Features.AdjectiveShape;
import Features.MotionShape;

import java.util.ArrayList;
import java.util.List;


public class Whale extends Creature {
    private final AssociativeShape associativeShape;
    private final MotionShape motionShape;
    private final ArrayList<AdjectiveShape> adjectiveShapes;

    public Whale(String name) {
        super(name);
        this.associativeShape = AssociativeShape.MOUNTAIN_RANGE;
        this.motionShape = MotionShape.SHINE;
        this.adjectiveShapes = new ArrayList<>(List.of(
                AdjectiveShape.HUGE, AdjectiveShape.FORMIDABLE, AdjectiveShape.MOTIONLESS));
    }

    public void showMotionDescription() {
        System.out.print(motionShape.description);
    }

    public void showAssociativeDescription() {
        System.out.print(associativeShape.description);
    }

    public void showAdjectiveDescription() {
        System.out.print("Что-то ");
        for (AdjectiveShape adjShape: this.adjectiveShapes) {
            System.out.print(adjShape.description);
        }
    }

    @Override
    public String toString() {
        return  " оно";
    }
}
