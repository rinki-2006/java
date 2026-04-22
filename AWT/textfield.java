package AWT;
import java.awt.*;
import java.awt.event.*;

class textdemo extends Frame implements TextListener, ActionListener{
    Label l1,l2;
    TextField tf;

     textdemo(){
         super("Text field demo");
         l1 = new Label("No text Entered yet");
         l2 = new Label("Enter key is not yet hit");
         tf = new TextField(20);
         tf.setEchoChar('*');

         tf.addTextListener(this);
         tf.addActionListener(this);

         setLayout(new FlowLayout());

         add(l1);
         add(l2);
         add(tf);
     }
     public void textValueChanged(TextEvent e){
         l1.setText(tf.getText());
     }
     public void actionPerformed(ActionEvent e){
         l2.setText(tf.getText());
     }

}
public class textfield {
    public static void main(String[] args) {
        textdemo td = new textdemo();
        td.setSize(300, 300);
        td.setVisible(true);
    }
}
