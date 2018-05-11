public class BattleApp {
    public static void main(String[] args) {
        Ship myShip = new Ship("CrazyShit");
        Ship theirShip = new Ship("Tortuga");

        myShip.fillShip();
        theirShip.fillShip();

        System.out.println(myShip.whatsWithThisShip());
        System.out.println(theirShip.whatsWithThisShip());

        System.out.print("Let's find some trouble. ");
        if (myShip.battleShip(theirShip)) {
            System.out.println(" Yeeeah, you bastards!");
        } else {
            System.out.println(" Oh I loose.");
        }

        System.out.println(myShip.whatsWithThisShip());
        System.out.println(theirShip.whatsWithThisShip());
    }
}
