public class Main {
    public static void main(String[] args) {
        SharpieSet penCase = new SharpieSet();
        Sharpie pen1 = new Sharpie();
        Sharpie pen2 = new Sharpie();
        Sharpie pen3 = new Sharpie();
        Sharpie pen4 = new Sharpie();
        pen3.inkAmount = 0;
        penCase.mySharpies.add(pen1);
        penCase.mySharpies.add(pen2);
        penCase.mySharpies.add(pen3);
        penCase.mySharpies.add(pen4);

        System.out.println(penCase.countUsable());
        System.out.println(penCase.mySharpies.size());
        penCase.removeTrash();
        System.out.println(penCase.mySharpies.size());
    }
}
