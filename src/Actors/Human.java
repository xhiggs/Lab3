package Actors;

import Items.FishingRod;
import Processes.FishingProcess;
import Scenes.Sea;

public class Human extends Creature {
    public Human(String name) {
        super(name);
    }

    public void shout() {
        System.out.print("И вдруг Снорк крикнул");
    }

    public Creature fishing(Sea sea) {
        FishingProcess fishingProcess = new FishingProcess(new FishingRod());
        Creature caught = null;
        for (; caught == null; caught = fishingProcess.tryToFish()) ;
        fishingProcess.kill();
        sea.atBottom.add(caught);
        return caught;
    }
}
