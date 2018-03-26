import java.util.ArrayList;

public class X5 {
    //Write a Stream Expression to find the uppercase characters in a string!
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        String string = "iugBUIjbUIB";

        strings.add(string);

        strings.
                stream()
                .filter(n -> n == n.toUpperCase())
                .count();
    }
}
