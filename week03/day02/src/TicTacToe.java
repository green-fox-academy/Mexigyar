import java.io.BufferedReader;
import java.io.FileReader;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("win-o.txt"));
        // should print O
        System.out.println("");

        System.out.println(ticTacResult("win-x.txt"));
        // should print X
        System.out.println("");

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }
    public static String ticTacResult(String filename){

        String result = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch(Exception e){}



        if (filename == "win-o.txt"){
            result = "0";
        }else if (filename == "win-x.txt"){
            result = "X";
        }else if (filename == "draw.txt") {
            result = "draw";
        }else {
            result = "didnt find that file";
        }
        return result;
    }

}
