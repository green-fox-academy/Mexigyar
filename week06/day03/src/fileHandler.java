

import java.io.*;
import java.util.Scanner;


public class fileHandler {

    public static void importList(Container container) {
        try {
            Scanner todoListFile = new Scanner(new File("todoList.txt"));
            while (todoListFile.hasNextLine() ){
                container.todoList.add(new Todo(todoListFile.nextLine(),container.ID));
                container.ID++;
            }
            todoListFile.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    


    public static boolean isItCompleted(int n){
        if (n == 0){
            return false;
        } else
            return true;
    }

    public static void saveToFile(Container container) {
        try {
            FileWriter fileWriter = new FileWriter("todoList.txt");
            Writer output = new BufferedWriter(fileWriter);
            for (int i = 0; i < container.todoList.size(); i++) {
                output.write(container.todoList.get(i).getTodo() + "\n");
            }
            System.out.println("");
            System.out.println("Saved to a file");
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("saveToFile method exception occured");
        }
    }

    public static void saveToFile222(Container container) {
        try {
            FileWriter fileWriter = new FileWriter("isCompleted.txt");
            Writer output = new BufferedWriter(fileWriter);
            for (int i = 0; i < container.todoList.size(); i++) {
                if (container.todoList.get(i).isCompleted()) {
                    output.write(1 + "\n");
                } else
                    output.write(0 + "\n");
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("saveToFile222 method exception occured");
        }
    }
}
