import org.junit.Assert;
import org.junit.Test;

public class GameTest {
    Game game = new Game();
    Player black = new Player();
    Player white = new Player();


    @Test
    public void highCardTest() {
        black.newHand(
                new Card(2, "H"),
                new Card(3, "D"),
                new Card(5, "S"),
                new Card(9, "C"),
                new Card("K", "D"));
        white.newHand(
                new Card(2, "C"),
                new Card(3, "H"),
                new Card(4, "S"),
                new Card(8, "C"),
                new Card("A", "H"));

        Assert.assertEquals(white, game.highCard(black, white));
    }
@Test
public void highCardTest2() {
        black.newHand(
                new Card(5, "H"),
                new Card(6, "D"),
                new Card(8, "S"),
                new Card(10, "C"),
                new Card("A", "D"));
        white.newHand(
                new Card(5, "C"),
                new Card(6, "H"),
                new Card(7, "S"),
                new Card(2, "C"),
                new Card("J", "H"));

        Assert.assertEquals(black, game.highCard(black, white));
    }


}