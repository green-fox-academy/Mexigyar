package main.java.music;

public class Violin extends  StringedInstrument {
    @Override
    void sound() {
        System.out.print("Screech");
    }

    public Violin() {
        setNumberOfStrings(4);
        setName("Violin");
    }
}
