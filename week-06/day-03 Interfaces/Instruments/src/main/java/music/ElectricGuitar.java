package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        setName("Electric Guitar");
        setNumberOfStrings(6);
    }

    public ElectricGuitar(int strings) {
        this();
        setNumberOfStrings(strings);
    }

    @Override
    public String sound() {
        return "twang";
    }
}
