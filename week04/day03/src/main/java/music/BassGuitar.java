package main.java.music;

public class BassGuitar extends  StringedInstrument {
    public BassGuitar() {
        setNumberOfStrings(4);
        setName("Bass Guitar");
        }

    public BassGuitar(int i) {
        setNumberOfStrings(i);
        setName("Bass Guitar");
    }


    @Override
    void sound() {
        System.out.print("Duum-duum-duum");
    }
}
