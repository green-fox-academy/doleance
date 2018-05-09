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

    public void fill() throws Exception {
        if (storedAmmo == 0) {
            throw new Exception("We've ran out of ammo. :cold_sweat:");
        } else {
            int remainedAmmo = storedAmmo;
            int i = 0;
            do {
                if (weapons.get(i).isPriority()) {
                    remainedAmmo = weapons.get(i).refill(remainedAmmo);
                }
                i++;
            } while ((remainedAmmo > 0) && (i < weapons.size()));

            i = 0;
            while ((remainedAmmo > 0) && (i < weapons.size())) {
                if (!(weapons.get(i).currAmmo == weapons.get(i).maxAmmo)) {
                    remainedAmmo = weapons.get(i).refill(remainedAmmo);
                }
                i++;
            }
            storedAmmo = remainedAmmo;
        }
    }

    public void fight(Carrier enemy) {
        int allDamage = 0;
        for (Aircraft weap : this.weapons) {
            allDamage += weap.fight();
        }
        enemy.healthPoint -= allDamage;
    }

    public int allDamage() {
        int damageSum = 0;
        for (Aircraft weap : this.weapons) {
            damageSum += weap.currAmmo * weap.baseDamage;
        }
        return damageSum;
    }

    public String getStatus() {
        StringBuilder stringBuilder = new StringBuilder();
        if (healthPoint > 0) {
            stringBuilder.append("HP:");
            stringBuilder.append(healthPoint);
            stringBuilder.append(", Aircraft count:");
            stringBuilder.append(weapons.size());
            stringBuilder.append(", Ammo Storage:");
            stringBuilder.append(storedAmmo);
            stringBuilder.append(", Total damage:");
            stringBuilder.append(allDamage());
        } else {
            stringBuilder.replace(0, stringBuilder.length(), "It's dead, Jim.");
        }
        if (weapons.size() > 0) {
            stringBuilder.append("\nAircrafts:\n");
            for (Aircraft weap : weapons) {
                stringBuilder.append(weap.getStatus());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
