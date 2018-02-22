import java.util.*;
import java.util.ArrayList;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        planetList.add("Saturn");
        for (int i = 0; i < planetList.size; i++) {

        }

        //System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
    }

    public static ArrayList<String> putSaturn()    {
        ArrayList<String> Saturn = new ArrayList<>();
        Saturn.add("Saturn");
        return(Saturn);

    }


}
