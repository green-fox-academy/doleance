import java.util.ArrayList;

public class GameObjects {
    public ArrayList<Character> charsOnBoard = new ArrayList<>();
    public int howManyMonsters = (int)(Math.random() * 4);

    public void GameObjects() {
        Hero hero = new Hero();
        charsOnBoard.add(hero);
        Boss bossy = new Boss();
        Monster withAKey = new Monster();
        withAKey.hasTheKey = true;
        Monster withoutAKey = new Monster();
        charsOnBoard.add(bossy);
        charsOnBoard.add(withAKey);
        charsOnBoard.add(withoutAKey);
        newMonster(howManyMonsters);
}

    private void newMonster(int howManyMonsters) {
        if (howManyMonsters > 0) {
            Monster temp = new Monster();
            charsOnBoard.add(temp);
        }
        newMonster(howManyMonsters - 1);
    }

}
