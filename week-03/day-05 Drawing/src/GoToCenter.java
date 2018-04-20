import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        int x = 5;
        int y = 5;
        //drawLineToTheCenter(graphics, x, y);
        graphics.setColor(Color.ORANGE);
        for (int i = 0; i < 50; i++) {
            drawLineToTheCenter(graphics, (int)(Math.random()*WIDTH), (int)(Math.random()*HEIGHT));
        }

    }

    private static void drawLineToTheCenter(Graphics whichClass, int startX, int startY) {
        whichClass.drawLine(startX,startY,WIDTH/2, HEIGHT/2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("GoToCenter");
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