public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.


    public static void main(String[] args) {
        CountDown(10);

    }


    public static void CountDown(int number) {
        if (number == 0) {
            System.out.println("0");
        }else{
            System.out.println(number);
            CountDown(number-1);
        }
    }

}
