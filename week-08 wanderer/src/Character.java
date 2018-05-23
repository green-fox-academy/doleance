public abstract class Character {
    int maxHealthPoint;
    int defendPoint;
    int strikePoint;
    int healthPoint;
    int level = 1;

    public void die() {

    }

    public void move() {

    }

    public void battleUp() {
        if (this.getClass() == Hero.class) {
            maxHealthPoint += (int) (Math.random() * 6 + 1);
            defendPoint += (int) (Math.random() * 6 + 1);
            strikePoint += (int) (Math.random() * 6 + 1);
        }
    }

    public void attack(Character victim) {
        if (victim.healthPoint > 0) {
            victim.attack(this);
        } else victim.die();
        if (this.getClass() == Hero.class) {
            this.battleUp();
        }
    }

}
