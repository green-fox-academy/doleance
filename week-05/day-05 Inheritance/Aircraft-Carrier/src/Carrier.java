import java.util.ArrayList;

public class Carrier {

    int healthPoint;
    int storedAmmo;
    ArrayList<Aircraft> weapons;

    Carrier(int healthPoint, int storedAmmo) {
        weapons = new ArrayList<>();
        this.healthPoint = healthPoint;
        this.storedAmmo = storedAmmo;
    }

    public void add(Aircraft newWeapon) {
        weapons.add(newWeapon);
    }

    public void fill () {
        try {
            int remainedAmmo = storedAmmo;
            int i = 0;
            while (!weapons.get(i).isPriority()) {
                i++;
            }
            if (i < weapons.size()) {
                remainedAmmo = weapons.get(i).refill(remainedAmmo);
            }
        } throw
    }

    It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
    If there is not enough ammo than it should start to fill the aircraftis with priority first
    If there is no ammo when this method is called it should throw an exception

}
