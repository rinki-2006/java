package swing;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

class borderdemo extends JFrame{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
    borderdemo(){
        l = new JLabel("Name");
        tf = new JTextField(20);
        b  = new JButton("Ok");

        Border b2 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),
                "Login", TitledBorder.ABOVE_TOP, TitledBorder.CENTER);
        p = new JPanel();
        p.add(l);
        p.add(tf);
        p.add(b);

        add(p);
        p.setBorder(b2);
        setLayout(new FlowLayout());
    }
}
public class border {
    public static void main(String[] args) {
        borderdemo b1 = new borderdemo();
        b1.setSize(300,300);
        b1.setVisible(true);
        b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
