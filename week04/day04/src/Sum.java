import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sum {
    ArrayList<Integer> integerList = new ArrayList<>();


    //constructor
    public Sum() {
        this.integerList = new ArrayList<Integer>();
    }

    //fills list in object
    public void fill(int numberOfElementsToAdd) {
        int randNumber;
        Random random = new Random();
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            randNumber = random.nextInt(99) + 1;
            integerList.add(randNumber);
        }
    }

    //empty list
    public void emptyList(){
        int rounds = integerList.size();
        for (int i = 0; i < rounds; i++) {
            integerList.remove(0);
        }
    }


    public void printList(){
        System.out.println(integerList.toString());
    }


    //sums numbers in the objects list
    public int summList(){
        int sum= 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        return sum;
    }

    //scans in an int number
    public static int intScanner(){
        int number = 0;
        String line = "";
        try{
            Scanner sc;
            sc = new Scanner(System.in);
            number = Integer.parseInt(sc.nextLine());
        } catch (Exception e){
            System.out.println("please enter an integer number");
        }
        return number;
    }
    //NO need to close scanner until the end

    //playOneRound
    public static int playOneRound(Sum sum){
        System.out.println("Sum the given numbers and enter your anwser");
        sum.printList();
        int answer = intScanner();//only scans once and uses that input in the whole game
        if (isItCorrectBoolean(sum, answer)){
            System.out.println("TRUEEE");

        } else {
        System.out.println("your answer is " + isItCorrectdifference(sum, answer) + " number(s) away from the correct one");//rewrite with better english
        }
        System.out.println("the Correct answer was " + sum.summList());
        return isItCorrectdifference(sum, answer);
    }

    //method input level x(how many numbers you have to add together) calls summ() and boolean method
    public static int levelPlay(int lvl, Sum sum){
        int missTipping = 0;
        sum.fill(lvl);
        missTipping += playOneRound(sum);
        sum.emptyList();
        return missTipping ;

    }

    //print at end of boolean method if anwser was correct or incorrect and how much was the difference.
    public static boolean isItCorrectBoolean(Sum sum, int awnser){
        return sum.summList() == awnser;
    }

    //return difference in absolute value
    public static int isItCorrectdifference(Sum sum, int awnser){

        return Math.abs(sum.summList() - awnser);
    }

    public static void playGame(int rounds, Sum sum){
        int missTipping = 0;
        for (int i = 1; i <= rounds; i++) {
            missTipping += levelPlay(i, sum);
        }
        if (missTipping == 0){
            System.out.println("VEEEERYY NICEEE you completed all levels without even misstipping even once.");
            System.out.println("Try to do the same on a higher lvl.");
        }
        if (missTipping > 0)
        System.out.println("you misstipped with " + missTipping + " try to do better next time");
    }
    //make game method level(int) is the input lvl 1-5 and return result
    //add points feature later



    public static void main(String[] args) {
        System.out.println("how many rounds do you wanto play? (each round gets more difficult as the game advances)");
        int rounds = intScanner();
        Sum summingStuff = new Sum();
        playGame(rounds,summingStuff);
    }




}