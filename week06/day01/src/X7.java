import java.util.ArrayList;
import java.util.Arrays;

public class X7 {
    //Write a Stream Expression to find the frequency of characters in a given string!

    public static void main(String[] args) {


        String stringToSearch = "she saw a fish on the seashore and "
                + "I'm sure The fish she saw on the seashore was a saw-fish.";

        long count = stringToSearch.toLowerCase().chars().filter(e -> e == 's')
                .count();

        System.out.println(count);
    }
}
