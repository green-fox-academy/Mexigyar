import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);

        List<Domino> dominoes2 = initializeDominoes2(dominoes);
        System.out.println(dominoes2);


    }
    public static List<Domino> initializeDominoes2(List<Domino> dominos){
        List<Domino> dominoes2 = new ArrayList<>();
        int lastValue;
        dominoes2.add(dominos.get(0));
        lastValue = dominos.get(0).getValues()[1];
        dominos.remove(0);
        for (int i = 0; i < dominos.size(); i++) {
            dominoes2.add()

        }

     return dominoes2;
    }


    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

}