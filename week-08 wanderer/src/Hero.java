import java.awt.*;

public class Hero extends Character {

    public Hero(Graphics graphics) {
        maxHealthPoint = (int)(Math.random() * 6 + 1) * 3 + 20;
        defendPoint = (int)(Math.random() * 6 + 1) * 2;
        strikePoint = (int)(Math.random() * 6 + 1) + 5;
        healthPoint = maxHealthPoint;
        pozX = 0;
        pozY = 0;
        picture = "wanderer-java/img/hero-down.png";
        drawCharacter(graphics, pozX, pozY);
    }

    @Override
    public void move(String whereToMove) {
        if (whereToMove.equals("up")) {
            moveUp();
        } else if (whereToMove.equals("down")) {
            moveDown();
        } else if (whereToMove.equals("left")) {
            moveLeft();
        } else {
            moveRight();
        }
    }

    public void moveLeft() {
        picture = "wanderer-java/img/hero-right.png";
        if ((Map.boardMatrix[pozX - 1][pozY] > 0) && (!willIFallFromTheMap(pozX - 1))) {
            pozX -= 1;
        }
    }

    public void moveRight() {
        picture = "wanderer-java/img/hero-right.png";
        if ((Map.boardMatrix[pozX + 1][pozY] > 0) && (!willIFallFromTheMap(pozX + 1))) {
            pozY += 1;
        }
    }

    public void moveUp() {
        picture = "wanderer-java/img/hero-left.png";
        if ((Map.boardMatrix[pozX][pozY - 1] > 0) && (!willIFallFromTheMap(pozY - 1))) {
            pozY -= 1;
        }
    }

    public void moveDown() {
        picture = "wanderer-java/img/hero-down.png";
        if ((Map.boardMatrix[pozX][pozY + 1] > 0) && (!willIFallFromTheMap(pozY + 1))) {
            pozY += 1;
        }
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
