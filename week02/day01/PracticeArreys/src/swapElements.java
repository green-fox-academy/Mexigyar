public class swapElements {
    // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
    public static void main(String[] args){

        String[] abc = {"first", "second", "third"};
        String memory = abc[1];
        abc[1]= abc [3];
        abc [3] = abc[1];
    }
}
