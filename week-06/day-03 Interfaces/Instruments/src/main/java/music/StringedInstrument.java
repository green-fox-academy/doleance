package main.java.music;

public abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public abstract String sound();

    public void play() {
        System.out.println(getName() + " a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
