import java.util.ArrayList;
import java.util.Arrays;

public class X6 {
    public static void main(String[] args) {
        ArrayList<String> cities;

        {
            cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
        }
        cities
                .stream()
                .filter(s -> s.charAt(0) == 'A')
                .filter(s -> s.charAt(s.length() - 1) == 'I')
                .forEach(System.out::println);
    }
}
