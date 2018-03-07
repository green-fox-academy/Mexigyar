package FlyableExercise;

public abstract class Vehicle {
    String name;
    int maxSpeed;
    String color;

    public Vehicle(String name, int maxSpeed, String color) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }
}
