public class Plant {

    protected String color;
    protected double waterAmount;
    protected double lessAmount;
    protected double absorbRate;

    public Plant() {
        color = "whatever";
    }

    public Plant(String color) {
        this.color = color;
    }


    public boolean needsWater() {
        return (waterAmount < lessAmount);
    }

    public void watering(int amount) {
        waterAmount += amount * absorbRate;
    }
}
