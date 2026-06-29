import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycle extends Applet{

    public void init(){
        System.out.println("Init");
    }

    public void start(){
        System.out.println("Start");
    }

    public void paint(Graphics g){
        g.drawString("Applet Running",50,50);
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void destroy(){
        System.out.println("Destroy");
    }
}