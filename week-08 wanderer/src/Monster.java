import java.awt.*;

public class Monster extends Character {

    boolean hasTheKey = false;

    public Monster(Graphics graphics) {
        maxHealthPoint = (int) (Math.random() * 6 + 1) * GameProperties.level * 2;
        defendPoint = (int) (Math.random() * 6 + 1) * GameProperties.level / 2;
        strikePoint = (int) (Math.random() * 6 + 1) * GameProperties.level;
        healthPoint = maxHealthPoint;
        picture = "wanderer-java/img/skeleton.png";
        drawCharacter(graphics, pozX, pozY);
    }

    @Override
    public void move(String whereToMove) {

    }
}
