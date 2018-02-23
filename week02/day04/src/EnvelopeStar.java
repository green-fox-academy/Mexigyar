import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.GREEN);

        for (int i = 0; i < 32; i++) {
            graphics.drawLine(WIDTH/2,i*(HEIGHT/64),WIDTH/2 + i*(WIDTH/64), HEIGHT/2);
            graphics.drawLine(WIDTH/2,i*(HEIGHT/64),WIDTH/2 - i*(WIDTH/64), HEIGHT/2);

            graphics.drawLine(WIDTH/2,HEIGHT-i*(HEIGHT/64),WIDTH/2 + i*(WIDTH/64), HEIGHT/2);
            graphics.drawLine(WIDTH/2,HEIGHT-i*(HEIGHT/64),WIDTH/2 - i*(WIDTH/64), HEIGHT/2);
            }
        for (int i = 0; i < 32; i++) {
            graphics.drawLine(WIDTH/2+1,i*(HEIGHT/64),(WIDTH/2 + i*(WIDTH/64))+1, HEIGHT/2);
            graphics.drawLine(WIDTH/2+1,i*(HEIGHT/64),(WIDTH/2 - i*(WIDTH/64))+1, HEIGHT/2);

            graphics.drawLine(WIDTH/2+1,HEIGHT-i*(HEIGHT/64),(WIDTH/2 + i*(WIDTH/64))+1, HEIGHT/2);
            graphics.drawLine(WIDTH/2+1,HEIGHT-i*(HEIGHT/64),(WIDTH/2 - i*(WIDTH/64))+1, HEIGHT/2);


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
