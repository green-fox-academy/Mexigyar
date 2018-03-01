public class NumberAdder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    public static int totalSum = 0;
    public static void NumberAdder(int number){
        int Sum;
        if(number == 1){
            totalSum += 1;
            System.out.println(totalSum);
        }else{
            Sum = number + number-1;
            totalSum += Sum;
            System.out.println(totalSum);
            NumberAdder(number - 1);
        }
    }

    public static void main(String[] args) {
        NumberAdder(2);
    }
}
