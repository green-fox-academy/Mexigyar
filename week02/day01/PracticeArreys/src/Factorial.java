public class Factorial {

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public static void main(String[] args){

    System.out.println(factorialFunc(4));
}
    public static int factorialFunc(int inputNum){
        int Factorial = 1;
        for (int i = 1; i <= inputNum; i++) {
            Factorial = Factorial * i;
        }
        return Factorial;
    }
}
