package AWT;
import java.awt.*;
public class ButtonDemo {
    public static void main(String[] args) {
        Frame f = new Frame();

        Button b = new Button("Click me!!");

        b.setBounds(100, 100, 100, 50);

        f.add(b);

        f.setSize(300, 300);

        f.setLayout(null);

        f.setVisible(true);
    }
}
