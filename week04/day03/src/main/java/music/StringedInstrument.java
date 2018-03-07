package main.java.music;

public abstract class StringedInstrument extends Instrument {
    @Override
    public void play() {
        System.out.print(getName() + ", a " + getNumberOfStrings() +"-stringed instrument that goes ");
        sound();
        System.out.println("");
    }
    private  int numberOfStrings;
   abstract void sound();

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
