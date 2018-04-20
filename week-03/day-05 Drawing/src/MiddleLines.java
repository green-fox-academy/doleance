import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MiddleLines {
    public static void mainDraw(Graphics graphics) {
        // draw a red horizontal line to the canvas' middle.
        graphics.setColor(Color.RED);
        graphics.drawLine(10, HEIGHT/2, WIDTH-10, HEIGHT/2);
        // draw a green vertical line to the canvas' middle.
        graphics.setColor(Color.GREEN);
        graphics.drawLine(WIDTH/2,10, WIDTH/2, HEIGHT-10);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("MiddleLines");
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