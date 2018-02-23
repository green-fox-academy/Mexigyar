import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class  LinePlay {
    public static void mainDraw(Graphics graphics) {



        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.red);
            graphics.drawLine(0,i*(HEIGHT/16),i*(WIDTH/16),HEIGHT);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(i*(WIDTH/16),0,WIDTH,i*(HEIGHT/16));

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