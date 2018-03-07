package main.java.animals;
import FlyableExercise.*;
public class Bird extends Animal implements Flyable{
    @Override
    public String breed() {
        return "laying eggs";
    }

    public Bird() {
        setName("Bird");
    }

    public Bird(String name) {
        setName(name);
    }

    @Override
    public void land() {
        System.out.println(getName() + " has landed on the ground");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying with its wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getName() + " has taken off from the ground and is now in the air");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.takeOff();
        bird.fly();
        bird.land();
    }

}
