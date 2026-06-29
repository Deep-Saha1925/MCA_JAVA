package Applet;

import java.awt.Graphics;

public class Line extends Applet{
    public void paint(Graphics g){
        g.drawLine(20, 20, 200, 20);

        // Rectangle
        g.drawRect(30, 30, 150, 200);
    }
}
