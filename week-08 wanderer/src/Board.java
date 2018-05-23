import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    //int testBoxX = 72;
    //int testBoxY = 72;

    public boolean doWeHaveOneMoreStep = true;
    GameObjects charsOnTheBoard;

    public Board() {
        charsOnTheBoard = new GameObjects();
        setPreferredSize(new Dimension(GameProperties.WINDOW_SIZE, GameProperties.WINDOW_SIZE));
        setVisible(true);
        Map map = new Map(getGraphics());
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        PositionedImage image = new PositionedImage("wanderer-java/img/hero-down.png", 0, 0);
        image.draw(graphics);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this because
        // this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
          //  image -= 100;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
          //  testBoxY += 100;
        }
        if (doWeHaveOneMoreStep) {
            doWeHaveOneMoreStep = !doWeHaveOneMoreStep;
            for (int i = 1; i < charsOnTheBoard.charsOnBoard.size(); i++) {
                charsOnTheBoard.charsOnBoard.get(i).move();
            }
        }
        repaint();
    }
}