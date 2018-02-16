import java.util.Scanner;

public class PartyIndicator {
    // Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

    public static void main( String[] args ) {

        System.out.println("How many girls are coming to the party?");
        Scanner scan;
        scan = new Scanner(System.in);
        int girls;
        girls = scan.nextInt();

        System.out.println("AAAAAnd how many boys are coming to the party?");
        scan = new Scanner(System.in);
        int boys;
        boys = scan.nextInt();

        scan.close();


        if (boys == girls && girls + boys > 20){
            System.out.println("The party is excelent.");
        }
        else if (boys != girls && girls + boys > 20){
            System.out.println("Quite a cool party!!!");
        }
        else if (boys + girls < 20){
            System.out.println("Avarage party....");
        }
        else if (girls == 0){
            System.out.println("Sausage party...");
        }


        scan.close();



    }
}
