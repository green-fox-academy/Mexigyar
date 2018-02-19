public class reverse {

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

    public static void main(String[] args){

        int[] aj = {3,4,5,6,7};
        for (int i = 0; i < aj.length/2 ; i++) {
            int memory = 0;
            memory = aj [i];
            aj[i] = aj[aj.length-1-i];
            aj[aj.length-1-i] = memory;
        }
        for (int i = 0; i < aj.length; i++) {
            System.out.print("|"+ aj[i]);
        }
        System.out.println("|");
    }
}
