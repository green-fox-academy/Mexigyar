import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logs {
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
    public static void main(String[] args) {
        System.out.println(getPostRatio("log.txt"));

    }
    public static String getPostRatio(String filename){
        String ratio = "";
        double GET = 0;
        double POST = 0;

        try{
            Path anyPath = Paths.get(filename);

            List<String> temps = Files.readAllLines(anyPath);

            for (String s : temps) {
                if(s.charAt(41) == 'P') {
                    POST++;
                } else if(s.charAt(41) == 'G') {
                    GET++;
                }
            }
            System.out.println("length " + temps.size());
            System.out.println(GET + "get");
            System.out.println(POST + "post");
            double ratioD = POST / GET;
            ratio = String.valueOf(ratioD);
            System.out.println(ratioD + "ratio");
            return ratio;
            }catch(Exception e){
            return "Exception occured";
        }

    }
}
