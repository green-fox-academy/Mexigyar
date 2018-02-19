public class printer {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

    public static void main(String [] args){
        printerFunc("messy","cozy","rosy");

    }
    public static void printerFunc(String... inputs){
        for (String input : inputs) {
            System.out.print(input + ", ");
        }
    }
}
