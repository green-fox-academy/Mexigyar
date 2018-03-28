public class argHandler {
    public static void argHandler(String[] args, TodoList todoList){
        if (args.length == 0) {
            todoList.noArg();
        } else {
            if (args.length == 1) {
                todoList.oneArg(args[0]);
            } else if (args.length == 2) {
                todoList.twoArgs(args[0], args[1]);
            }
        }
    }
}
