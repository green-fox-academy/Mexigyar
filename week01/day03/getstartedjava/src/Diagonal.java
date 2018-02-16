import java.util.Scanner;

public class Diagonal {
    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

    public static void main(String[] args) {

        Scanner scan;

        System.out.println("Enter a number!");
        scan = new Scanner(System.in);
        int number;
        number = scan.nextInt();

        System.out.println("Whats your favorite symbol?");
        scan = new Scanner(System.in);
        String symbol;
        symbol = scan.nextLine();
        scan.close();



        for (int x = 0; x < number; x++) {
            System.out.print(symbol);
        }
        System.out.println(" ");
        for (int N = 0; N < number - 2; N++) {

            System.out.print(symbol);
            int whiteLeft = 0;
            for (; whiteLeft < N; whiteLeft++) {
                System.out.print(" ");
            }

            System.out.print(symbol);

            int whiteRight = number - 3 - whiteLeft;
            for (int h = 0; h < whiteRight; h++) {
                System.out.print(" ");
            }

            System.out.print(symbol);
            System.out.println(" ");
        }

        for (int x = 0; x < number; x++) {
            System.out.print(symbol);

        }
    }
}