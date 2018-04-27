import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        drawRandomRectangle(graphics, 10);

    }

    public static void drawRandomRectangle(Graphics g, int howMany) {
        int rectWidth = 0;
        int rectHeight = 0;
        for (int i = 0; i < howMany; i++) {
            g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            rectWidth = (int) (Math.random() * (WIDTH - 100));
            rectHeight = (int) (Math.random() * (WIDTH - 100));
            g.drawRect((int) (Math.random() * (WIDTH - rectWidth)), (int) (Math.random() * (HEIGHT - rectHeight)), rectWidth, rectHeight);
        }
    }


    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FourRectangles");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}