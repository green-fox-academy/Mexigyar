public class Bunny {
    // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    public static int ears = 0;
    public static void bunnyEars(int bunny){
        if (bunny == 0){
        }else{
            ears++;
            ears++;
            System.out.println(ears);
            bunnyEars(bunny - 1);
        }
    }

    public static void main(String[] args) {
        bunnyEars(10);
    }
}
