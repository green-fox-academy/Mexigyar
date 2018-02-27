public class DivideByZero {
    // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
    public static void main(String[] args) {
        divider(8);
    }
    public static void divider (double divider){
        if (divider == 0) {
            System.out.println("fail");
        }else {
            double PrintThis = 10 / divider;
            System.out.println(PrintThis);
        }
    }
}
