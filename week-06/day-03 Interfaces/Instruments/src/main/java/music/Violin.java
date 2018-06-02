package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        setName("Violin");
        setNumberOfStrings(4);
    }

    public Violin(int strings) {
        this();
        setNumberOfStrings(strings);
    }

    @Override
    public String sound() {
        return "screech";
    }

}
