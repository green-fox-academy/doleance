import java.awt.*;
import java.util.ArrayList;

public class EnemyOnBoard {
    public ArrayList<Character> enemyOnBoard = new ArrayList<>();
    public int howManyMonsters = (int)(Math.random() * 4);

    public EnemyOnBoard(Graphics graphics) {
        Boss bossy = new Boss(graphics);
        Monster withAKey = new Monster(graphics);
        withAKey.hasTheKey = true;
        Monster withoutAKey = new Monster(graphics);
        enemyOnBoard.add(bossy);
        enemyOnBoard.add(withAKey);
        enemyOnBoard.add(withoutAKey);
        newMonster(graphics, howManyMonsters);
}

    private void newMonster(Graphics graphics, int howManyMonsters) {
        if (howManyMonsters > 0) {
            Monster temp = new Monster(graphics);
            enemyOnBoard.add(temp);
        }
        newMonster(graphics,howManyMonsters - 1);
    }

}
