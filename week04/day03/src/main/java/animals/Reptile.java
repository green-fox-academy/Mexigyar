package main.java.animals;

public class Reptile extends Animal {
    @Override
    public String breed() {
        return "layin' eggs";
    }

    public Reptile() {
        setName("Reptile");
    }

    public Reptile(String name) {
        setName(name);
    }
}
