public class warApp {
    public static void main(String[] args) {
        Armada thickPig = new Armada();
        thickPig.recruitShips();
        Armada saintWhore = new Armada();
        saintWhore.recruitShips();

        System.out.println(thickPig.ships.size());
        for ( Ship ship : thickPig.ships) {
            System.out.println(ship.whatsWithThisShip());
        }

        System.out.println(saintWhore.ships.size());
        for ( Ship ship : saintWhore.ships) {
            System.out.println(ship.whatsWithThisShip());
        }

        System.out.println(thickPig.war(saintWhore));

        for ( Ship ship : thickPig.ships) {
            System.out.println(ship.whatsWithThisShip());
        }

        for ( Ship ship : saintWhore.ships) {
            System.out.println(ship.whatsWithThisShip());
        }
    }
}
