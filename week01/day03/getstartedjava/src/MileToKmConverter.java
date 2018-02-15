import java.util.Scanner;

public class MileToKmConverter {


    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("What do you think how many kilomeers do you travel every weekday in avarage ?");
        Scanner scan1;

        scan1 = new Scanner(System.in);

        int kmTraveled;
        kmTraveled = scan1.nextInt();

        scan1.close();

        double milesTraveled = kmTraveled / 1.6;
        System.out.println("you travel " + milesTraveled + " miles every weekday in avarage");

    }
}