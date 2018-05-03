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
            return puppy;
            slots--;
        } else {
            System.out.println("There is no room for a new animal. :(");
        }
    }

    public void slaughter() {
        int minHunger = 30000;
        int fatestAnimal = -1;
        for (int i = 0; i < Animals.size(); i++) {
            if (Animals.get(i).hunger < minHunger) {
                minHunger = Animals.get(i).hunger;
                fatestAnimal = i;
            }
        }
        Animals.remove(fatestAnimal);
    }

    //it has slots which defines the number of free places for animals
    //breed() -> creates a new animal if there's place for it
    //slaughter() -> removes the least hungry animal

}
