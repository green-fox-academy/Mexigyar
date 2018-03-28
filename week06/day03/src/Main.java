public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.importList();
        argHandler.argHandler(args, todoList);
        todoList.saveToFile();
    }

}



