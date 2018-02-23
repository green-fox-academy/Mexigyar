public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


        String inOrder = "";

        for (int i = 0; i < reversed.length(); i++) {

            inOrder += reversed.charAt(reversed.length()-i-1);

        }
        System.out.println(inOrder);
        //System.out.println(reverse(reversed));
    }

}

// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.
