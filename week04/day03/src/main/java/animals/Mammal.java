package main.java.animals;

public class Mammal extends Animal {
    @Override
    public String breed() {
        return "pushing miniature versions out";
    }

    public Mammal() {
        setName("Mammal");
    }

    public Mammal(String name) {
        setName(name);
    }
}
