package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        setName("Bass Guitar");
        setNumberOfStrings(4);
    }

    public BassGuitar(int strings) {
        this();
        setNumberOfStrings(strings);
    }

    @Override
    public String sound() {
        return "duum-duum-duum";
    }
}
