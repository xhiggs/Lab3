import Actors.*;
import Features.*;
import Items.Boat;
import Motions.RelativeMotion;
import Scenes.Sea;
import Scenes.SeaArea;


public class Story {
    /*
        И вдруг Снорк крикнул: Туго натянутая леса провисла, и глубоко внизу, в темно-зеленой толще воды, что-то
        забелело. Неужели брюхо Панталошки? Что-то вздымалось к поверхности, словно горный хребет с таинственного
        ландшафта морского дна... Что-то громадное, грозное, неподвижное. Зеленовато-замшелым стволом гигантского дерева
        скользнуло оно наверх под киль лодки.
    */

    public static void main(String[] args) {
        Sea sea = new Sea(new SeaArea(WaterColor.RIFFLE_GREEN), new SeaArea(WaterColor.DARK_BLUE));
        Boat boat = new Boat();
        sea.onSurface.add(boat);

        Human snork = new Human("Snork");
        boat.addPassenger(snork);

        snork.shout(); // И вдруг Снорк крикнул

        Creature undefinedCreature = snork.fishing(sea); // : Туго натянутая леса провисла

        sea.onSurface.showColor(); // , в темно-зеленой толще воды

        try {
            defineCreature(sea, boat, undefinedCreature);
        } catch (ClassCastException classCastException) {
            System.out.print("<There's no Pantoloshka>: " + classCastException.getMessage());
        } finally {
            sea.clear();
        }
    }

    private static void defineCreature(Sea sea, Boat boat, Creature undefinedCreature) throws ClassCastException {
        if (undefinedCreature instanceof Whale pantoloshka) {
            pantoloshka.showMotionDescription(); // , что-то забелело. Неужели брюхо Пантолошки?
            sea.liftFromBottomToSurface(undefinedCreature); // Что-то вздымалось к поверхности
            pantoloshka.showAssociativeDescription(); // , словно горный хребет с таинственного ландшафта морского дна...
            pantoloshka.showAdjectiveDescription(); // Что-то громадное, грозное, неподвижное.

            RelativeMotion relativeMotion = new RelativeMotion(boat, pantoloshka, AdjectiveShape.GREENISH_MOSSY,
                    AssociativeShape.GIANT_TREE_TRUNK, MotionShape.SLIDE);
            relativeMotion.run(); // Зеленовато-замшелым стволом гигантского дерева скользнуло оно наверх под киль лодки.
        } else {
            throw new ClassCastException("Undefined creature is not a whale");
        }
    }
}
