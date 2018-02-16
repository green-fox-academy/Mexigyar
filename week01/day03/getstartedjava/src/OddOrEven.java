import java.util.Scanner;


public class OddOrEven {

    // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

    public static void  main( String[] args ) {

        System.out.println("Enter a Number");

        Scanner scan;
        scan = new Scanner(System.in);

        int number;
        number = scan.nextInt();
        scan.close();



        if (number%2 == 0) {
            System.out.println("thats an even number");
            }
        else {
            System.out.println("Its an Odd number");
            }


    }

}
