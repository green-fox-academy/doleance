public class Flower extends Plant{

    public Flower() {
        super();
        lessAmount = 5;
        absorbRate = 0.75;
    }

    public Flower(String color) {
        this();
        this.color = color;
    }
}
