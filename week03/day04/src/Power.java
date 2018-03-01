public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    public static int Sum = 1;
    public static void selfMultyplier(int number, int power){
        if(power == 0){
        }else{
        Sum *= number;
            System.out.println(Sum);
            selfMultyplier(number, power -1);
        }
    }

    public static void main(String[] args) {
        selfMultyplier(3,3);
    }
}
