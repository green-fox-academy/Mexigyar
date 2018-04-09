package TodoApp;

import java.time.LocalDateTime;

public class Todo {
    String todo;
    boolean completed;
    int ID;
    String createdAt;
    int completedAt;




    public Todo(String todo, int ID) {
        this.todo = todo;
        this.completed = false;
        this.ID = ID;
        this.createdAt = getCurrentTime();
    }

    public Todo(String todo, boolean completed, int ID, String createdAt) {
        this.todo = todo;
        this.completed = completed;
        this.ID = ID;
        this.createdAt = createdAt;
    }

    public String getCurrentTime(){
        LocalDateTime currentTime;
        currentTime = LocalDateTime.now();
        return currentTime.toString();
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

    public String getCreatedAt() {
        return createdAt;
    }

    public int getCompletedAt() {
        return completedAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setCompletedAt(int completedAt) {
        this.completedAt = completedAt;
    }
}
