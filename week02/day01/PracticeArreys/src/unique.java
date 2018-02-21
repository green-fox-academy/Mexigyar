import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
          //should print: `[1, 11, 34, 52, 61]`

        //List<Integer> mzArraz = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 4, 4, 9, 2));
        //mzArraz = mzArraz.stream()
            //    .distinct()
          //      .collect(Collectors.toList());
        //System.out.println(mzArraz);

    }

    public static int[] unique(int [] inputArray) {
        Arrays.sort(inputArray);


        int[] outputArrey = {};
        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] != inputArray[i + 1]) {
                System.out.println(inputArray[i]);
//                outputArrey.add(inputArray[i]);
            }


        }

        return outputArrey ;
    }
}