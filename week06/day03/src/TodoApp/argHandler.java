package TodoApp;

public class argHandler {
    public static void argHandler(String[] args, Container container){

        System.out.println("");
        System.out.println("here are the arguments you gave");
        for (int i = 0; i < args.length; i++) {
            int plusOne = i + 1;
            System.out.print("your " + plusOne + ". argument is ");
            System.out.println("|" + args[i] + "|");
        }

        if (args.length == 0) {
            container.noArg();
        } else {
            if (args.length == 1) {
                container.oneArg(args[0]);
            } else if (args.length == 2) {
                container.twoArgs(args[0], args[1]);
            }
        }
    }
}
