public class Plant {

    String color;
    double waterAmount;
    double lessAmount;
    int absorbRate;

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
