package FlyableExercise;

public class Helicopter extends Vehicle implements Flyable{
    public Helicopter(String name, int maxSpeed, String color) {
        super(name, maxSpeed, color);
    }

    @Override
    public void land() {
        System.out.println(getName() + "has landed");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "is flying with it propeller");
    }

    @Override
    public void takeOff() {
        System.out.println(getName() + "has taken off from the ground and is now in the air");
    }

    public static void main(String[] args) {
        Helicopter myHelicopter = new Helicopter("small hellicopter", 10, "blue");
        myHelicopter.takeOff();
        myHelicopter.fly();
        myHelicopter.land();
    }
}
