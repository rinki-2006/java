// frame class as listener
package AWT;
import java.awt.*;
import java.awt.event.*;

class listener1 extends Frame implements ActionListener{
    TextField tf;
    Button b;
    int count;

    listener1(){
        super("Listener demo");
        tf = new TextField("0",20);
        b = new Button("count");

        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        count++;
        tf.setText(String.valueOf(count));
    }
}
public class listenermethod1 {
    public static void main(String[] args) {
        listener1 l = new listener1();
        l.setSize(300,300);
        l.setVisible(true);
    }
}
