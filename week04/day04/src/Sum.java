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
        try{
            Scanner sc;
            sc = new Scanner(System.in);
            number = sc.nextInt();
            sc.close();
        } catch (Exception e){
            System.out.println("please enter an integer number");
        }
        return number;
    }

    //playOneRound
    public static int PlayOneRound(Sum sum){
        System.out.println("Sum the given numbers and enter your anwser");
        sum.printList();
        int answer = intScanner();

        if (isItCorrectBoolean(sum, answer)){
            System.out.println("TRUEEE");
        } else
        System.out.println("your answer is " + isItCorrectdifference(sum, answer) + " number(s) away from the correct one");//rewrite with better english
        System.out.println("the Correct answer is " + isItCorrectdifference(sum, answer));
        return sum.summList();
    }

    //method input level x(how many numbers you have to add together) calls summ() and boolean method
    public int levelPlay(int lvl, Sum sum){
        int missTipping = 0;
        sum.fill(lvl);
        missTipping += PlayOneRound(sum);
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

    public int PlayGame(int rounds){
        int missTipping = 0;
        
    }
    //make game method level(int) is the input lvl 1-5 and return result
    //add points feature later



    public static void main(String[] args) {
        Sum summingStuff = new Sum();
        summingStuff.levelPlay(2,summingStuff);
    }




}