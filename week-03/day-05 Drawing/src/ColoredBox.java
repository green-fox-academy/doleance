import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    graphics.setColor(Color.ORANGE);
    graphics.drawLine(10,10,290,10);
    graphics.setColor(Color.PINK);
    graphics.drawLine(10,10,10,290);
    graphics.setColor(Color.CYAN);
    graphics.drawLine(290,10,290,290);
    graphics.setColor(new Color(20,190,190));
    graphics.drawLine(10,290,290,290);
    
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("ColoredBox");
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