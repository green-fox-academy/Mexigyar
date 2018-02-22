public class TakesLonger {

        public static void main(String... argv){


            String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
            String quotePt1 = quote.substring(0,21);
            String quotePt2 = "always takes longer than ";
            String quotePt3 = quote.substring(21);

            quote = quotePt1 + quotePt2 + quotePt3;

            // When saving this quote a disk error has occured. Please fix it.
            // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
            // Using pieces of the quote variable (instead of just redefining the string)

            System.out.println(quote);
        }

}
