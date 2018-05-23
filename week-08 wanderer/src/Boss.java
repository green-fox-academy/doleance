public class Boss extends Monster {

    public Boss() {
        super();
        maxHealthPoint += (int) (Math.random() * 6 + 1);
        defendPoint += (int) (Math.random() * 6 + 1) / 2;
        strikePoint += level;
        healthPoint = maxHealthPoint;
    }
}
