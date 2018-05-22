import java.util.ArrayList;

public class Excercise10 {
    public static void main(String[] args) {
        //Create a Fox class with 3 properties(name, type, color)
        // Fill a list with at least 5 foxes, it's up to you how you name/create them!
        // Write a Stream Expression to find the foxes with green color!
        // Write a Stream Expression to find the foxes with green color and pallida type!

        ArrayList<Fox> myFoxes = new ArrayList<>();
        Fox frank = new Fox("Frank", "pallida", "green");
        myFoxes.add(frank);
        Fox theo = new Fox("Theodore", "bengalensis", "green");
        myFoxes.add(theo);
        Fox cynthia = new Fox("Cynthia", "pallida", "purple");
        myFoxes.add(cynthia);
        Fox tyb = new Fox("Tybalt", "pallida", "green");
        myFoxes.add(tyb);
        Fox meru = new Fox("Merutemezenis", "vulpes", "yellow");
        myFoxes.add(meru);

        System.out.println("Green foxes:");
        myFoxes.stream()
                .filter(foxie -> foxie.getColor().equals("green"))
                .forEach(foxie -> System.out.println(foxie.getName()+ " (" + foxie.getColor() + " " + foxie.getType() + ")"));

        System.out.println("\nGreen pallidas:");
        myFoxes.stream()
                .filter(foxie -> foxie.getColor().equals("green"))
                .filter(foxy -> foxy.getType().equals("pallida"))
                .forEach(foxie -> System.out.println(foxie.getName()+ " (" + foxie.getColor() + " " + foxie.getType() + ")"));


    }
}
