// using anonymous class
package AWT;
import java.awt.*;
import java.awt.event.*;

class listener3 extends Frame{
    TextField tf;
    Button b;
    int count = 0;

    listener3(){
        super("Listener 3");
        tf = new TextField("0", 20);
        b = new Button("click");
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        // make object of interface important to override abstract method i.e. anonymous object
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                tf.setText(String.valueOf(count));
            }
        });
    }

}
public class listenermethod3 {
    public static void main(String[] args) {
        listener3 l = new listener3();
        l.setSize(300, 300);
        l.setVisible(true);
    }
}
