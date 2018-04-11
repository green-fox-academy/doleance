public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double cuboidA=5;
        double cuboidB=5;
        double cuboidC=5;

        System.out.println("Surface Area: "+(cuboidA*cuboidB*2+cuboidC*cuboidB*2+cuboidA*cuboidC*2));
        System.out.println("Volume: "+cuboidA*cuboidB*cuboidC);

    }
}
