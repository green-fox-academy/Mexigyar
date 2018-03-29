import java.time.LocalDateTime;

public class Todo {
    String todo;
    boolean completed;
    int ID;
    int createdAt;
    int completedAt;




    public Todo(String todo, int ID) {
        this.todo = todo;
        this.completed = false;
        this.ID = ID;
    }

    public Todo(String todo, boolean completed, int ID) {
        this.todo = todo;
        this.completed = completed;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return checkbox() + todo;
    }

    public String checkbox(){

        if (isCompleted()){
            return "[x] ";
        }else
            return "[ ] ";
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTodo() {
        return todo;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getID() {
        return ID;
    }
}
