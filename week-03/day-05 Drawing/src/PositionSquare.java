import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the x and y coordinates of the square's top left corner
      // and draws a 50x50 square from that point.
      // draw 3 squares with that function.
      // avoid code duplication.

        graphics.setColor(Color.ORANGE);
        for (int i = 0; i < 3; i++) {
            drawRectangle(graphics, (int)(Math.random()*(WIDTH-50)),(int)(Math.random()*(HEIGHT-50)));
        }

    }

    private static void drawRectangle(Graphics g, int startX, int startY) {
        g.drawRect(startX,startY,50,50);
    }


    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("PositionSquare");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}