import java.math.BigInteger;

public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    public static int selfMultyplier(int number, int power){
        if(power == 1){
            return number;
        }else{
        return number * selfMultyplier(number, power - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(selfMultyplier(3,6));
        System.out.println(selfMultyplier(2,8));
        System.out.println(Math.pow(2, 3));

    }
}
