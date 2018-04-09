import java.util.Random;

public class Card {
    int color;
    int value;

    public Card() {
        Random r = new Random();
        this.color = r.nextInt(4);
        this.value = r.nextInt(13);
    }
}
