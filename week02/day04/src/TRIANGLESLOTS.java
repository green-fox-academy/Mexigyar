import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TRIANGLESLOTS {

    public static void mainDraw(Graphics graphics) {

        double WIDTHDOUBLE = 320;

        double ayPont = Math.sqrt(WIDTHDOUBLE*WIDTHDOUBLE-(WIDTHDOUBLE*WIDTHDOUBLE)/4);
        int TriangleHight = 277128129/1000000;
        int Magassag = HEIGHT - TriangleHight;






        for (int i = 1; i < 23; i++) {
            graphics.setColor(Color.blue);
            graphics.drawLine(WIDTH/2-(WIDTH/44)*i, Magassag + (TriangleHight/22)*i,WIDTH/2+(WIDTH/44)*i, Magassag + (TriangleHight/22)*i);

            graphics.setColor(Color.red );
            graphics.drawLine(WIDTH/2-(WIDTH/44)*i, Magassag + (TriangleHight/22)*i,WIDTH-i*(WIDTH/22),HEIGHT);

            graphics.setColor(Color.GREEN);
            graphics.drawLine(i*(WIDTH/22),HEIGHT,WIDTH/2+(WIDTH/44)*i, Magassag + (TriangleHight/22)*i);
        }
        graphics.setColor(Color.PINK);
        graphics.drawLine(0, HEIGHT, WIDTH, HEIGHT);
        graphics.drawLine(WIDTH,HEIGHT,WIDTH/2,Magassag);
        graphics.drawLine(WIDTH/2, Magassag, 0, HEIGHT);



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