public class Hero extends Character {

    public Hero() {
        maxHealthPoint = (int)(Math.random() * 6 + 1) * 3 + 20;
        defendPoint = (int)(Math.random() * 6 + 1) * 2;
        strikePoint = (int)(Math.random() * 6 + 1) + 5;
        healthPoint = maxHealthPoint;
    }

    public void stageUp() {
        int chances = (int)(Math.random() * 10 + 1);
        if (chances == 10) {
            healthPoint = maxHealthPoint;
        } else if (chances < 6) {
            healthPoint *= 1.1;
        } else {
            healthPoint *= 1.3;
        }
    }
}
