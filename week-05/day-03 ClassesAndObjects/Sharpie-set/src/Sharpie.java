public class Sharpie {

    String color;
    float width;
    float inkAmount;

    public Sharpie() {
        this.inkAmount = 100.0f;
    }

    public Sharpie(String color, float width) {
        this();
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmount -= 0.05;
    }

}
