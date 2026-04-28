//using inner class
package AWT;
import java.awt.*;
import java.awt.event.*;

class listener2 extends Frame{
    TextField tf;
    Button b;
    int count = 0;

    listener2(){
        super("Listener 2");
        tf = new TextField("0", 20);
        b = new Button("click");
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener(new Mylistener());
    }
    class Mylistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            count++;
            tf.setText(String.valueOf(count));
        }
    }
}
public class listenermethod2 {
    public static void main(String[] args) {
        listener2 l = new listener2();
        l.setSize(300, 300);
        l.setVisible(true);
    }
}
