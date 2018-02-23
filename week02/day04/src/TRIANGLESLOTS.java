import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TRIANGLESLOTS {

    public static void mainDraw(Graphics graphics) {

        double WIDTHDOUBLE = 320;
        double HEIGHTDOUBLE = 343;

        double ayPont = Math.sqrt(WIDTHDOUBLE*WIDTHDOUBLE-(WIDTHDOUBLE*WIDTHDOUBLE)/4);
        int TriangleHight = 277;

        graphics.drawLine(0, HEIGHT, WIDTH, HEIGHT);
        graphics.drawLine(WIDTH,HEIGHT,WIDTH/2,HEIGHT-TriangleHight);
        graphics.drawLine(WIDTH/2, HEIGHT-TriangleHight, 0, HEIGHT);

        

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