import jdk.nashorn.api.tree.ForInLoopTree;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    static int ITERATOR = 0;
    static int iterator = 0;

    private static void mainDraw(Graphics graphics) {
        int Size = 600;
        int startingPosition = 69;
        int loops = 3;
        int loopCondition = (Size / loops) - 1;


        drawGrid(startingPosition, startingPosition, Size, graphics, iterator);
    }

    // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png



    public static void drawGrid(int x, int y, int size, Graphics graphics, int iterator) {


        int sub = size / 2;
        int loopsLeft = sub / 18;

        for (int i = 0; i < loopsLeft ; i++) {
            graphics.setColor(getRandomColor());
            graphics.drawRect(x + sub / 2, y + sub / 2, sub, sub);
            graphics.drawRect(x + sub / 2 - i, y + sub / 2 - i, sub + 2 * i, sub + 2 * i);
            graphics.drawRect(x + sub / 2 + i, y + sub / 2 + i, sub - 2 * i, sub - 2 * i);
        }


        if (sub > 18 && iterator < ITERATOR) {
            drawGrid(x, y, sub, graphics, iterator + 10);
            drawGrid(x + sub, y, sub, graphics, iterator + 10);
            drawGrid(x, y + sub, sub, graphics, iterator + 10);
            drawGrid(x + sub, y + sub, sub, graphics, iterator + 10);
        }
    }

    private static Color getRandomColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }


    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

    public static void main(String[] args) throws InterruptedException {

        JFrame jFrame = new JFrame("Drawing");
        ImagePanel imagePanel = new ImagePanel();
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(imagePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);


        while (true) {
            imagePanel.repaint();
            ITERATOR++;
            Thread.sleep(500);
        }

    }
static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
            mainDraw(graphics);

    }


}

}

