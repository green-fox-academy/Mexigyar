import java.util.Scanner;

public class triangle {
    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

    public static void main( String[] args){

        System.out.println("Enter a number!");
        Scanner scan;
        scan = new Scanner(System.in);
        int number;
        number = scan.nextInt();
        scan.close();

        for(int i=1; i<= number; i++){

            for(int g=1; g <= i; g++){

                System.out.print("*");
            }
            System.out.println("");

        }



    }
}
