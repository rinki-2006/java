package AWT;
import java.awt.*;
class flowdemo extends Frame{
    Button b1, b2, b3, b4, b5, b6;

    flowdemo(){
        super("Flow layout demo");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.setHgap(100);
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }
}
public class flowlayout {
    public static void main(String[] args) {
        flowdemo f = new flowdemo();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
