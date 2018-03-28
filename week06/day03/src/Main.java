public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.importList();
        System.out.println("");
        System.out.println("here are the arguments you gave");
        for (int i = 0; i < args.length; i++) {
            int plusOne = i + 1;
            System.out.print("your " + plusOne + ". argument is ");
            System.out.println("|" + args[i] + "|");
        }
        argHandler(args, todoList);
        todoList.saveToFile();
    }

}



