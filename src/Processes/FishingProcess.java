package Processes;

import Actors.Creature;
import Actors.Whale;
import Items.IFishingRod;

import java.util.Objects;

public class FishingProcess {
    boolean isAlive;
    IFishingRod fishingRod;

    public FishingProcess(IFishingRod fishingRod) {
        this.isAlive = true;
        this.fishingRod = fishingRod;
        this.fishingRod.prepare();
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void kill() {
        if (this.isAlive()) {
            this.isAlive = false;
            this.fishingRod.remove();
        }
    }

    public Creature tryToFish() {
        return Math.random() > 0.9 ? new Whale("Pantoloshka") : null;
    }

    @Override
    public String toString() {
        return "FishingProcess{" + "isAlive=" + isAlive + ", fishingRod=" + fishingRod + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FishingProcess that = (FishingProcess) o;
        return isAlive == that.isAlive && Objects.equals(fishingRod, that.fishingRod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAlive, fishingRod);
    }
}
