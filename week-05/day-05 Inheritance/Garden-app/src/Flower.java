public class Flower extends Plant{

    public Flower() {
        super();
        lessAmount = 5;
        absorbRate = 0.75;
    }

    public Flower(String color) {
        super(color);
    }

    @Override
    public boolean needsWater() {
        return super.needsWater();
    }

    @Override
    public void watering(int amount) {
        super.watering(amount);
    }
}
