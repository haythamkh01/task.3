import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    public static final int WIDTH =1000;
    public static final int HEIGHT =800;



    public Game(){
        MainScene mainScene=new MainScene(0,0,WIDTH,HEIGHT);
        this.add(mainScene);
        this.setResizable(false);
        this.setTitle("MY GAME");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(WIDTH,HEIGHT);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
