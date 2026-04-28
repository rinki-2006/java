package AWT;

import java.awt.*;

class borderdemo extends Frame {
    Button b1, b2, b3, b4, b5;

    borderdemo() {
        super("Border layout demo");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
//        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);

        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tues"));
        p.add(new Button("Wed"));
        add(p,BorderLayout.EAST);
    }
}

public class borderlayout {
    public static void main(String[] args) {
        borderdemo bd = new borderdemo();
        bd.setSize(300,300);
        bd.setVisible(true);
    }
}
