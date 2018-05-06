import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants = new ArrayList();

    public int thirstyPlants() {
        int howManyThirstyPlants = 0;
        for (Plant plant : plants) {
            if (plant.needsWater()) {
                howManyThirstyPlants++;
            }
        }
        return howManyThirstyPlants;
    }

    public void watering(int amount) {
        System.out.println("Watering with " + amount);
        int amountDivider = thirstyPlants();
        try {
            for (Plant plant : plants) {
                if (plant.needsWater()) {
                    plant.watering(amount / amountDivider);
                }
            }
        } catch (ArithmeticException zero) {
            System.out.println("There is no thirsty plant. You're an awesome gardener.");
        }
    }

    public void gardenStatus() {
        for (Plant plant : plants) {
            if (plant.needsWater()) {
                System.out.println("The " + plant.color + " " +
                        String.valueOf(plant.getClass()).substring(String.valueOf(plant.getClass()).indexOf(" ") + 1, String.valueOf(plant.getClass()).length())
                        + " needs water.");
            } else {
                System.out.println("The " + plant.color + " " +
                        String.valueOf(plant.getClass()).substring(String.valueOf(plant.getClass()).indexOf(" ") + 1, String.valueOf(plant.getClass()).length())
                        + " doesn't need water.");
            }
        }
        System.out.println();
    }


}
