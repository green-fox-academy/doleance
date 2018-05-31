import java.awt.*;

public class Boss extends Monster {

    public Boss(Graphics graphics) {
        super(graphics);
        maxHealthPoint += (int) (Math.random() * 6 + 1);
        defendPoint += (int) (Math.random() * 6 + 1) / 2;
        strikePoint += GameProperties.level;
        healthPoint = maxHealthPoint;
        picture = "wanderer-java/img/boss.png";
        drawCharacter(graphics, pozX, pozY);
    }

}
