public class String1 {
    // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

    public static void xToWhy(String string){
        if (!string.contains("x")){
        }else{
            string = string.replace('x', 'y');
            System.out.println(string);
            xToWhy(string);
        }
    }

    public static void main(String[] args) {
        System.out.println( "randomtst".indexOf("x"));
        "randomtst".indexOf("x");
        System.out.println("changexto".replace('x','y'));

        xToWhy("xxxxxxxx");
    }
}
