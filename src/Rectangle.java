import java.awt.*;

public class Rectangle extends GameComponent{

    private int x;
    private int y;
    private int width;
    private int height;

public Rectangle (int x,int y,int width,int height){
    this.x =x;
    this.y=y;
    this.width= width;
    this.height= height;
}
    public void paint(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect( this.x,this.y,this.width, this.height);
    }


}
