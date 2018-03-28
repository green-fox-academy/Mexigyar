

import java.io.*;

/*

public class fileHandler {
    public static void importList(TodoList todoList) {
        String line;
        try {
            BufferedReader input = new BufferedReader(new FileReader("todoList.txt"));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                todoList.add(line);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void saveToFile() {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            Writer output = new BufferedWriter(fileWriter);
            for (int i = 0; i < todolist.size(); i++) {
                output.write(todolist.get(i) + "\n");
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
*/