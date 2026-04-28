// lamda expression
package AWT;
import java.awt.*;
import java.awt.event.*;

class listener4 extends Frame{
    TextField tf;
    Button b;
    int count = 0;

    listener4(){
        super("Listener 4");
        tf = new TextField("0", 20);
        b = new Button("click");
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        // make object of interface important to override abstract method i.e. anonymous object
     b.addActionListener((ActionEvent e)->{
         count++;
         tf.setText(String.valueOf(count));
             }
             );
    }

}
public class listenermethod4 {
    public static void main(String[] args) {
        listener4 l = new listener4();
        l.setSize(300,300);
        l.setVisible(true);
    }
}
