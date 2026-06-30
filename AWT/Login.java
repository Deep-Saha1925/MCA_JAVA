import java.awt.*;

public class Login {

    public static void main(String args[]){

        Frame f=new Frame("Login");

        Label l=new Label("Name");

        TextField t=new TextField();

        Button b=new Button("Login");

        l.setBounds(30,50,60,30);
        t.setBounds(100,50,150,30);
        b.setBounds(100,100,100,30);

        f.add(l);
        f.add(t);
        f.add(b);

        f.setLayout(null);
        f.setSize(350,250);
        f.setVisible(true);

    }

}