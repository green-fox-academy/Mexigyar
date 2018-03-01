import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    /*
    Sharpie Set

Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> Sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies
     */

    List<Sharpie> sharpies;

    public SharpieSet() {
        sharpies = new ArrayList<>();
    }

    public void addSharpies(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public boolean usable(Sharpie sharpie) {
        boolean hasInk = false;
        if (sharpie.inkAmount > 0) {
            hasInk = true;
        }
        return hasInk;
    }

    public int countUsable() {
        int counter = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (usable(sharpies.get(i))) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (!usable(sharpies.get(i))) {
                sharpies.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "SharpieSet{" +
                "sharpies=" + sharpies +
                '}';
    }

    public static void main(String[] args) {
        Sharpie sharpieOne = new Sharpie("blue", 3);
        Sharpie sharpieTwo = new Sharpie("red", 1);
        Sharpie sharpieThree = new Sharpie("green", 2);
        sharpieTwo.setInkAmount(0);

        SharpieSet mySharpieSet = new SharpieSet();
        mySharpieSet.addSharpies(sharpieOne);
        mySharpieSet.addSharpies(sharpieTwo);
        mySharpieSet.addSharpies(sharpieThree);

        mySharpieSet.removeTrash();

        System.out.println(mySharpieSet);
    }

}
