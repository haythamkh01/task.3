import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementListener implements KeyListener {
       private  MainScene scene;

       public MovementListener(MainScene mainScene){
           this.scene=mainScene;

       }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
            this.scene.moveBallRight();
            this.scene.repaint();
        }

        if (e.getKeyCode()==KeyEvent.VK_LEFT) {
            this.scene.moveBallLeft();
            this.scene.repaint();
        }
        if (e.getKeyCode()==KeyEvent.VK_UP) {
            this.scene.moveBallUp();
            this.scene.repaint();
        }
        if (e.getKeyCode()==KeyEvent.VK_DOWN)
        this.scene.moveBallDown();
        this.scene.repaint();

    }

    public void keyReleased(KeyEvent e) {

    }
}
