import static org.junit.Assert.*;

public class ApplesTest {


    @org.junit.Test
    public void getApple() {
        Apples apples = new Apples();
        assertEquals("apple", apples.getApple());

    }
}