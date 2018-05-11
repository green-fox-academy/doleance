import java.util.ArrayList;
import java.util.List;

public class Armada {

    List<Ship> ships;

    Armada() {
        ships = new ArrayList<>();
    }

    public void recruitShips() {
        for (int i = 0; i < (int)(Math.random() * 5) + 1; i++) {
            ships.add(new Ship());
        }
    }

    public boolean war (Armada enemy) {
        int myFighter = 0;
        int theirFighter = 0;
        while (myFighter < (this.ships.size()) && (theirFighter < enemy.ships.size())) {
            if (this.ships.get(myFighter).battleShip(enemy.ships.get(theirFighter))) {
                theirFighter++;
            } else {
                myFighter++;
            }
        }
        return (theirFighter == enemy.ships.size());
    }


}
