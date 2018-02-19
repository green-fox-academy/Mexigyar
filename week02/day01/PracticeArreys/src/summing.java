public class summing {
    //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
    public static void main(String[] args){

        System.out.println(sumFunc(4));
    }
    public static int sumFunc(int biggestNum){
        int totalSum= 0;
        for (int i = 1; i <= biggestNum; i++) {
            totalSum= totalSum + i;
        }
        return totalSum;
    }
}
