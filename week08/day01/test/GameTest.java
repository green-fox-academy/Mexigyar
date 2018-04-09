import org.junit.Assert;
import org.junit.Test;

public class GameTest {
    Game game = new Game();
    Player Black = new Player();
    Player White = new Player();


   @Test
    public void highCardTest(){
        Black.newHand(new Card(2,"H"),new Card(3,"D"),new Card(5,"S"),new Card(9,"C"),new Card("K","D"));
        White.newHand(new Card(2,"C"),new Card(3,"H"),new Card(4,"S"),new Card(8,"C"),new Card("A","H"));

        Assert.assertEquals(White,game.highCard(Black,White));
    }






}