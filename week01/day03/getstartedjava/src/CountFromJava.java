import java.util.Scanner;

public class CountFromJava {

    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

    public static void main( String[] args) {

        System.out.println("give me a number");
        Scanner scan;
        scan = new Scanner(System.in);
        int first;
        first = scan.nextInt();

        System.out.println("give me an even bigger one");
        scan = new Scanner(System.in);
        int second;
        second = scan.nextInt();

        scan.close();
        if (first < second) {
            for (int i=0; i < second-first; i++){
                int result = first + i;
                System.out.println(result);

            }
        }

    }
}
