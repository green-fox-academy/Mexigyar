public class Deck {
    public Card draw(){
        Card card = new Card();
        return card;
    }

    public Deck(int num) {
        for (int i = 0; i < num; i++) {
            Card card = new Card();
        }
    }
}
