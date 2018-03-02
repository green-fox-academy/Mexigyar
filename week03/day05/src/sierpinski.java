import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class sierpinski {
    private static void mainDraw(Graphics graphics) {
        drawGasket(50, 50, 729, graphics);


        // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png
    }

    private static void drawGasket(int x, int y, int side, Graphics graphics) {
        int sub = side / 3;
        graphics.fillRect(x + sub - 1, y + sub - 1, sub - 1, sub - 1);

        if (sub >= 3) {
            drawGasket(x, y, sub,graphics);
            drawGasket(x + sub, y, sub,graphics);
            drawGasket(x + 2 * sub, y, sub,graphics);
            drawGasket(x, y + sub, sub,graphics);
            drawGasket(x + 2 * sub, y + sub, sub,graphics);
            drawGasket(x, y + 2 * sub, sub,graphics);
            drawGasket(x + sub, y + 2 * sub, sub,graphics);
            drawGasket(x + 2 * sub, y + 2 * sub, sub,graphics);
        }
    }






    // Don't touch the code below
    static int WIDTH = 1500;
    static int HEIGHT = 1500;

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