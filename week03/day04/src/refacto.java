public class refacto {
    // Create a recursive function called `refactorio`
// that returns it's input's factorial
    public static int value = 1;
    public static int factorial(int N){
        if (N == 1){
            return value;
        }else {
            value *= N;
            factorial(N-1);
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(8));
    }
}
