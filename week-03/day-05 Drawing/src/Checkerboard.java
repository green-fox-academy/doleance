import sun.reflect.ReflectionFactory;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(2 * j * WIDTH / 8, 2 * i * HEIGHT / 8, WIDTH / 8, HEIGHT / 8);
                graphics.fillRect(2 * j * WIDTH / 8 + WIDTH / 8, (2 * i + 1) * HEIGHT / 8, WIDTH / 8, HEIGHT / 8);
            }
        }



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setBackground(Color.WHITE);
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