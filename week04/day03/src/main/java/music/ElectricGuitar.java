package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    @Override
    void sound() {
        System.out.print("Twang");
    }

    public ElectricGuitar() {
    setNumberOfStrings(6);
    setName("Electric Guitar");
    }

    public ElectricGuitar(int i) {
        setNumberOfStrings(i);
        setName("Electric Guitar");
    }

}
