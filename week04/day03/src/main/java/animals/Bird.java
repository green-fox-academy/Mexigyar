package main.java.animals;

public class Bird extends Animal {
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

}
