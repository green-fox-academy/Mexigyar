public class BunnyAgain {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication)

    public static int totalBunnyEars = 0;
    public static void StrangeBunnyEarCounter(int NumberOfBunnys){
        if (NumberOfBunnys == 0){
        }else if (NumberOfBunnys % 2 == 0){
            totalBunnyEars += 3;
            System.out.println(totalBunnyEars);
            StrangeBunnyEarCounter(NumberOfBunnys - 1);
        }else{
            totalBunnyEars += 2;
            System.out.println(totalBunnyEars);
            StrangeBunnyEarCounter(NumberOfBunnys - 1);
        }
    }

    public static void main(String[] args) {
        StrangeBunnyEarCounter(3);
    }
}
