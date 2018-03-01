import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class firstDrawing {
    private static void mainDraw(Graphics graphics) {
        // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png


        topSquare(4, graphics);
        leftSquare(4, graphics);
        rightSquare(4, graphics);
        bottomSquare(4, graphics);

    }


    public static int rectHeight = 0;
    public static int thisRound = 1;
    public static int rectWidth = 0;


    public static void topSquare(int rounds, Graphics graphics) {
        if (rounds == 0) {
            thisRound = 1;
            rectWidth = 0;
        } else {
            rectWidth = rectWidth + (WIDTH / Power(3, thisRound));
            graphics.drawRect(rectWidth, 0, WIDTH / Power(3, thisRound), HEIGHT / Power(3, thisRound));
            thisRound++;
            topSquare(rounds - 1, graphics);
            leftSquare(rounds - 1, graphics);
        }
    }

    public static void bottomSquare(int rounds, Graphics graphics) {
        if (rounds == 0) {
            thisRound = 1;
            rectWidth = 0;
            rectHeight = 0;
        } else {
            rectWidth = rectWidth + (WIDTH / Power(3, thisRound));
            rectHeight = rectHeight + (HEIGHT / Power(3, thisRound)) * 2;
            graphics.drawRect(rectWidth, rectHeight, WIDTH / Power(3, thisRound), HEIGHT / Power(3, thisRound));
            thisRound++;
            bottomSquare(rounds - 1, graphics);
        }
    }

    public static void leftSquare(int rounds, Graphics graphics) {
        if (rounds == 0) {
            rectHeight = 0;
            thisRound = 1;
        } else {
            rectHeight = rectHeight + HEIGHT / Power(3, thisRound);
            graphics.drawRect(0, rectHeight, WIDTH / Power(3, thisRound), HEIGHT / Power(3, thisRound));
            thisRound++;
            leftSquare(rounds - 1, graphics);
        }
    }


    public static void rightSquare(int rounds, Graphics graphics) {
        if (rounds == 0) {
            thisRound = 1;
            rectHeight = 0;
            rectWidth = 0;
        } else {
            rectWidth = rectWidth + (WIDTH / Power(3, thisRound))*2;
            rectHeight = rectHeight + (HEIGHT / Power(3, thisRound));
            graphics.drawRect(rectWidth, rectHeight, WIDTH / Power(3, thisRound), HEIGHT / Power(3, thisRound));
            thisRound++;
            rightSquare(rounds - 1, graphics);
        }
    }


    public static int Power(int number, int power) {
        if (power == 1) {
            return number;
        } else {
            return number * Power(number, power - 1);
        }
    }


    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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