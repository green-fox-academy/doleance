public class Aircraft {

    int maxAmmo;
    int currAmmo;
    int baseDamage;

    public int fight() {
        int ammo = currAmmo;
        currAmmo = 0;
        return ammo * baseDamage;
    }

    public int refill(int ammo) {
        int remainedAmmo = ammo - (maxAmmo - currAmmo);
        if (remainedAmmo >= 0) {
            currAmmo = maxAmmo;
        } else {
            currAmmo += ammo;
            remainedAmmo = 0;
        }
        return remainedAmmo;
    }

    public String getType() {
        if (this instanceof F16) {
            return "F16";
        } else if (this instanceof F35) {
            return "F35";
        } else {
            return "dunno";
        }
    }

    public String getStatus() {
        StringBuilder stringBuilder = new StringBuilder("Type ");
        stringBuilder.append(getType());
        stringBuilder.append(", Ammo: ");
        stringBuilder.append(currAmmo);
        stringBuilder.append(", Base Damage: ");
        stringBuilder.append(baseDamage);
        stringBuilder.append(", All Damage: ");
        stringBuilder.append(currAmmo * baseDamage);
        return stringBuilder.toString();
    }

    public boolean isPriority() {
        if (getType() == "F16") {
            return false;
        } else {
            return true;
        }
    }

}
