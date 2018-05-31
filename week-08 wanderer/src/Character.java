import java.awt.*;

public abstract class Character {
    int maxHealthPoint;
    int defendPoint;
    int strikePoint;
    int healthPoint;
    int pozX = 1;
    int pozY = 1;
    String picture;

    public void die() {

    }

    public abstract void move(String whereToMove);

    public boolean willIFallFromTheMap(int poz) {
        if ((poz < 0) || poz >= GameProperties.BOARD_SIZE) {
            return false;
        } else {
            return true;
        }
    }

    public void drawCharacter(Graphics graphics, int pozX, int pozY) {
        PositionedImage charImage = new PositionedImage(picture,
                pozX * GameProperties.ELEMENT_SIZE, pozY * GameProperties.ELEMENT_SIZE);
       charImage.draw(graphics);
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
