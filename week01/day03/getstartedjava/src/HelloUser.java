import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user


        System.out.println("what's your Name?");
        Scanner sc;

        sc = new Scanner(System.in);

        String yourName;
        yourName = sc.nextLine();
        sc.close();

        System.out.println("Hello " + yourName + "!");
    }
}