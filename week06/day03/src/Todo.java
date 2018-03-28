public class Todo {
    String todo;
    boolean completed;
    int ID;

    public Todo(String todo, int ID) {
        this.todo = todo;
        this.completed = false;
        this.ID = ID;
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
