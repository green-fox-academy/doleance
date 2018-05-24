import java.awt.*;

public class Hero extends Character {

    public Hero() {
        maxHealthPoint = (int)(Math.random() * 6 + 1) * 3 + 20;
        defendPoint = (int)(Math.random() * 6 + 1) * 2;
        strikePoint = (int)(Math.random() * 6 + 1) + 5;
        healthPoint = maxHealthPoint;
        pozX = 0;
        pozY = 0;
    }

    @Override
    public void move(String whereToMove) {
        if (whereToMove == "up") {
            moveUp();
        }
    }

    public void moveLeft(Graphics graphics) {
        if
        PositionedImage imgFloor = new PositionedImage(
                "wanderer-java/img/floor.png", i * 72, j * 72);
        imgFloor.draw(graphics);
    }

    public void moveRight(Graphics graphics) {

    }

    public void moveUp(Graphics graphics) {

    }

    public void moveDown(Graphics graphics) {

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
