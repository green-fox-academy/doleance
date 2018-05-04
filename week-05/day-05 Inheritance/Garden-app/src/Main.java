public class Main {

    public static void main(String[] args) {

        Garden myBeautifulGarden = new Garden();

        Flower yellowFlow = new Flower("yellow");
        Flower blueFlow = new Flower("blue");
        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        myBeautifulGarden.plants.add(yellowFlow);
        myBeautifulGarden.plants.add(blueFlow);
        myBeautifulGarden.plants.add(purpleTree);
        myBeautifulGarden.plants.add(orangeTree);

        myBeautifulGarden.gardenStatus();

        myBeautifulGarden.watering(40);

        myBeautifulGarden.watering(70);

    }

}
