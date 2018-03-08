import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sum {
    ArrayList<Integer> integerList = new ArrayList<>();

    public void fill(int numberOfElementsToAdd) {
        int randNumber;
        Random random = new Random();
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            randNumber = random.nextInt(99) + 1;
            integerList.add(randNumber);
        }
    }

    public void printList(){
        System.out.println(integerList.toString());
    }

    public Sum() {

        this.integerList = new ArrayList<Integer>();
    }

    public int summList(){
        int sum= 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        return sum;
    }

    public int intScanner(){
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

    //method return boolean for checking if input:int variable equals summ()
    //method input level x(how many numbers you have to add together) calls summ() and boolean method
    //print at end of boolean method if anwser was correct or incorrect and how much was the difference.
    //make game lvl 1-5 and return resul
    //add points feature

    public static void main(String[] args) {
        Sum summingStuff = new Sum();
        summingStuff.fill(4);
        summingStuff.printList();

    }




}