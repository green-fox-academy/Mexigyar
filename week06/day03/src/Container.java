import java.util.ArrayList;

public class Container {
    ArrayList<Todo> todoList;

    public Container() {
        this.todoList = new ArrayList<>();
    }

    public void noArg() {
        System.out.println("No args given");
        System.out.println("");
        printUsage();
    }

    public void oneArg(String arg0) {
        listTasks(arg0);
        addTask(arg0);
        removeTask(arg0);
        checkTask(arg0);
    }

    public void twoArgs(String arg0, String arg1) {
        addTask(arg0, arg1);
        removeTask(arg0, arg1);
        checkTask(arg0, arg1);
    }


    public void printUsage() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println("Command line arguments:");
        System.out.println("-l   Lists all the tasks");
        System.out.println("-a \"task to add\"  Adds a new task");
        System.out.println("-r   Removes an task");
        System.out.println("-c   Completes an task");
    }


    public void listTasks(String args0) {
        if (args0.equals("-l")) {
            if (todoList.size() == 0) {
                System.out.println("No todos for today! ¯\\_(ツ)_/¯ ");
            } else
                for (int i = 0; i < todoList.size(); i++) {
                    int plusOne = i + 1;
                    System.out.println(plusOne + " - " + todoList.get(i).toString());
                }
        }
    }

    public int getAnID() {
        int ID = 1;
        if (todoList.size() != 0) {
            ID = todoList.get(0).getID();
            for (int i = 1; i < todoList.size(); i++) {
                if (todoList.get(i).getID() > todoList.get(i - 1).getID()) {
                    ID = todoList.get(i).getID();
                }
            }
        }
        return ID + 1;
    }


    public void addTask(String arg0) {
        if (arg0.equals("-a")) {
            System.out.println("you forgot to give a task to add to the todoList");
            System.out.println("you can add your task by writing it ");
            System.out.println("after the \" -a \" command between the \"(write your task here)\" signs");
        }

    }

    public void addTask(String arg0, String arg1) {
        if (arg0.equals("-a")) {
            Todo todo = new Todo(arg1, getAnID());
            this.todoList.add(todo);
            System.out.println("\"" + arg1 + "\" -was added to the list");
            System.out.println("this is your " + this.todoList.size() + ". task on your todo list now");
        }
    }

    public void removeTask(String args0) {
        if (args0.equals("-r")) {
            System.out.println("app entered -r command box");
            System.out.println("");
            System.out.println("please enter after \"-r\" which task you want to remove");
        }
    }

    public void removeTask(String args0, String args1) {
        if (args0.equals("-r")) {
            int noOfTask = Integer.parseInt(args1);
            System.out.println("task " + "\"" + this.todoList.get(noOfTask - 1).toString() + "\"" + " has been removed");
            this.todoList.remove(noOfTask - 1);
            System.out.println("");
        }

    }


    public void checkTask(String args0) {
        if (args0.equals("-c")) {
            System.out.println("app entered -c command box");
            System.out.println("please enter the index of the task you want to check");
        }
    }

    public void checkTask(String args0, String args1) {
        if (args0.equals("-c")) {
            int noOfTask = Integer.parseInt(args1);
            System.out.println("your " + noOfTask + "." + "task is " + "\"" + todoList.get(noOfTask - 1).toString() + "\"");
        }
    }


}

