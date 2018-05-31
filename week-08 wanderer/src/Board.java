import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    public boolean doWeHaveOneMoreStep = true;
    static EnemyOnBoard enemies;
    static Map map;
    static Hero hero;

    public Board() {

        setPreferredSize(new Dimension(GameProperties.WINDOW_SIZE, GameProperties.WINDOW_SIZE));
        setVisible(true);


    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        map = new Map(graphics);
        map.boardDraw(graphics);
        hero = new Hero(graphics);
        hero.drawCharacter(graphics, hero.pozX, hero.pozY);
        //   enemies = new EnemyOnBoard(graphics);
      /*  for (Character enemy : enemies.enemyOnBoard) {
            enemy.drawCharacter(graphics, enemy.pozX, enemy.pozY);
        } */
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);


    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.pozX += 200;
            System.out.println(hero.pozX);
        }

        /*
       if (e.getKeyCode() == KeyEvent.VK_W) {
            //hero.picture = "wanderer-java/img/hero-left.png";
            hero.move("up");
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.move("down");
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.move("left");
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.move("right");
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            //  testBoxY += 100;
        }
        if (!doWeHaveOneMoreStep) {
            doWeHaveOneMoreStep = !doWeHaveOneMoreStep;
            for (Character enemy : enemies.enemyOnBoard) {
                enemy.move("");
                enemy.move("");
            }
        }
         */

        repaint();
    }
}