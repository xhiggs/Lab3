package Items;

import Actors.Creature;

import java.util.ArrayList;
import java.util.Objects;

public class Boat {
    ArrayList<Creature> passengers;

    public Boat() {
        passengers = new ArrayList<>();
    }

    public void addPassenger(Creature creature) {
        if (!passengers.contains(creature)) {
            passengers.add(creature);
        }
    }

    public void removePassenger(Creature creature) {
        passengers.remove(creature);
    }

    @Override
    public String toString() {
        return  " наверх под киль лодки.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return Objects.equals(passengers, boat.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengers);
    }
}
