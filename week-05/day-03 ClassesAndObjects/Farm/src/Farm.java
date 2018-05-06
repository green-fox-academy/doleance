import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> Animals = new ArrayList<>();
    int slots;

    public Farm() {
        slots = 100;
    }

    public Animal breed() {
        Animal puppy = new Animal();
        if (slots > 0) {
            slots--;
            return puppy;
        } else {
            System.out.println("There is no room for a new animal. :(");
            return null;
        }
    }

    public void slaughter() {
        int minHunger = Animals.get(0).hunger;
        int fatestAnimal = 0;
        for (int i = 1; i < Animals.size(); i++) {
            if (Animals.get(i).hunger < minHunger) {
                minHunger = Animals.get(i).hunger;
                fatestAnimal = i;
            }
        }
        Animals.remove(fatestAnimal);
        slots++;
    }

    //it has slots which defines the number of free places for animals
    //breed() -> creates a new animal if there's place for it
    //slaughter() -> removes the least hungry animal

}
