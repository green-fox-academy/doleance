import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {

        StepDrawer(graphics, 10);

    }

    private static void StepDrawer(Graphics g, int tinyestCube) {
        g.setColor(Color.MAGENTA);
        int minOfPanel = Math.min(WIDTH, HEIGHT);
        int sumLength = 0;
        int size = tinyestCube;
        boolean willItFit = true;
        while (willItFit) {
            g.fillRect(sumLength, sumLength, size, size);
            sumLength += size;
            size = (int)(size * 1.5);
            willItFit = (sumLength + size < minOfPanel);
        }
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
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