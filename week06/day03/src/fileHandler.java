

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class fileHandler {

    public static void importList(Container container) {
        try {
            Scanner todoListFile = new Scanner(new File("todoList.txt"));
            ArrayList<String> helpingList = new ArrayList<>();
            ArrayList<String> TaskList = new ArrayList<>();
            ArrayList<String> BooList = new ArrayList<>();
            ArrayList<String> IDList = new ArrayList<>();
            ArrayList<String> CreatedAtList = new ArrayList<>();
            while (todoListFile.hasNextLine()){
                helpingList.add(todoListFile.nextLine());
            }
            todoListFile.close();
            for (int i = 0; i < helpingList.size(); i++) {
                String [] strings = helpingList.get(i).split(",");
                TaskList.add(strings[0]);
                BooList.add(strings[1]);
                IDList.add(strings[2]);
                CreatedAtList.add(strings[3]);
            }

            for (int i = 0; i < TaskList.size(); i++) {
                container.todoList.add(new Todo(TaskList.get(i), completedIntToBoo(stringToInt(BooList.get(i))), stringToInt(IDList.get(i)),  CreatedAtList.get(i)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int stringToInt(String string){
        return Integer.parseInt(string);
    }


    public static int completedBooToInt(boolean b) {
        if (b) {
            return 1;
        } else
            return 0;
    }

    public static boolean completedIntToBoo(int n) {
        if (n == 1) {
            return true;
        } else
            return false;
    }



    public static void saveToFile(Container container) {
        try {
            FileWriter fileWriter = new FileWriter("todoList.txt");
            Writer output = new BufferedWriter(fileWriter);
            for (Todo todo: container.todoList) {
                output.write(todo.getTodo() + "," + completedBooToInt(todo.isCompleted()) + "," +todo.getID() + "," +todo.getCreatedAt() + "\n");
            }



            System.out.println("");
            System.out.println("Saved to a file");
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("saveToFile method exception occured");
        }
    }

}
