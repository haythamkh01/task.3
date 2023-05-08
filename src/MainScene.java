import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class MainScene extends JPanel {
    private Ball ball;

    private Rectangle[] rectangles;


    public MainScene(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setBackground(Color.GREEN);
        this.ball = new Ball(10, 400, 20, 20);
        this.rectangles = new Rectangle[14];
        this.rectangles[0] = new Rectangle(0, 350, 100, 5);
        this.rectangles[1] = new Rectangle(100, 200, 5, 150);
        this.rectangles[2] = new Rectangle(100, 200, 300, 5);
        this.rectangles[3] = new Rectangle(400, 200, 5, 250);
        this.rectangles[4] = new Rectangle(400, 450, 200, 5);
        this.rectangles[5] = new Rectangle(600, 350, 5, 100);
        this.rectangles[6] = new Rectangle(600, 350, 400, 5);
        this.rectangles[7] = new Rectangle(0, 450, 200, 5);
        this.rectangles[8] = new Rectangle(200, 300, 5, 150);
        this.rectangles[9] = new Rectangle(200, 300, 100, 5);
        this.rectangles[10] = new Rectangle(300, 300, 5, 250);
        this.rectangles[11] = new Rectangle(300, 550, 400, 5);
        this.rectangles[12] = new Rectangle(700, 450, 5, 100);
        this.rectangles[13] = new Rectangle(700, 450, 300, 5);
        this.setFocusable(true);
        this.requestFocus();
        MovementListener movementListener = new MovementListener(this);
        this.addKeyListener(movementListener);


    }


    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.ball.paint(graphics);
        this.rectangles[0].paint(graphics);
        this.rectangles[1].paint(graphics);
        this.rectangles[2].paint(graphics);
        this.rectangles[3].paint(graphics);
        this.rectangles[4].paint(graphics);
        this.rectangles[5].paint(graphics);
        this.rectangles[6].paint(graphics);
        this.rectangles[7].paint(graphics);
        this.rectangles[8].paint(graphics);
        this.rectangles[9].paint(graphics);
        this.rectangles[10].paint(graphics);
        this.rectangles[11].paint(graphics);
        this.rectangles[12].paint(graphics);
        this.rectangles[13].paint(graphics);


    }

    public void moveBallRight() {
        this.ball.moveRight();
    }

    public void moveBallLeft() {
        this.ball.moveLeft();
    }

    public void moveBallUp() {
        this.ball.moveUp();
    }

    public void moveBallDown() {
        this.ball.moveDown();


    }
}