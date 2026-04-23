package AWT;
import java.awt.*;
import java.awt.event.*;

class textareademo extends Frame implements ActionListener{
    Label l;
    TextField tf;
    Button b;
    TextArea ta;

    textareademo(){
        super("Text area demo");
        l = new Label("No text entered");
        tf = new TextField(20);
        b = new Button("click");
        ta = new TextArea(10,30);

        setLayout(new FlowLayout());
        add(l);
        add(tf);
        add(b);
        add(ta);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
//        l.setText(ta.getSelectedText());
//        tf.setText(ta.getText());

//        ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }

}
public class textarea {
    public static void main(String[] args) {
        textareademo tad = new textareademo();
        tad.setSize(400, 400);
        tad.setVisible(true);
    }
}
