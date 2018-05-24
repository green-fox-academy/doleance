public class Monster extends Character {

    boolean hasTheKey = false;

    public Monster() {
        maxHealthPoint = (int) (Math.random() * 6 + 1) * GameProperties.level * 2;
        defendPoint = (int) (Math.random() * 6 + 1) * GameProperties.level / 2;
        strikePoint = (int) (Math.random() * 6 + 1) * GameProperties.level;
        healthPoint = maxHealthPoint;
    }

    @Override
    public void move() {

    }
}
