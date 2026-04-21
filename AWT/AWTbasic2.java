package AWT;
import java.awt.*;

class MYframe extends Frame{
    Button b;
    Label l;
    TextField tf;

    MYframe(){
        super("My First App");
        setLayout(new FlowLayout());
        b = new Button("OK");
        l = new Label("Name");
        tf = new TextField(20);

        add(b);
        add(l);
        add(tf);
    }
}
public class AWTbasic2 {
    public static void main(String[] args) {
        MYframe f = new MYframe();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
