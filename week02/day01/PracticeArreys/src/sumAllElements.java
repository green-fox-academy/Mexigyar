public class sumAllElements {
    // - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
    public static void main(String[] argd) {
        int[] ai = {3, 4, 5, 6, 7};
        int totalSum = 0;

        for (int i = 0; i < ai.length; i++) {

            totalSum += ai[i];
            if (i == ai.length - 1) {
                System.out.println(totalSum);
            }
        }
    }
}
