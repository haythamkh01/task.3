import java.awt.*;

public class Ball extends GameComponent{


    private int x;
    private int y;
    private int width;
    private int height;


    public Ball (int x,int y,int width,int height){
        this.x =x;
        this.y=y;
        this.width= width;
        this.height= height;
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.blue);
        graphics.fillOval( this.x,this.y,this.width, this.height);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void moveRight(){
        this.x++;
    }
    public void moveLeft(){
        this.x--;
    }
    public void moveUp(){
        this.y--;
    }
    public void moveDown(){
        this.y++;
    }
}
