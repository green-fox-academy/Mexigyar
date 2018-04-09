import java.util.ArrayList;

public class Player {

    ArrayList<Card> hand = new ArrayList<>();


    public void newHand(Card card1, Card card2, Card card3, Card card4, Card card5){
        this.hand.add(card1);
        this.hand.add(card2);
        this.hand.add(card3);
        this.hand.add(card4);
        this.hand.add(card5);
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
