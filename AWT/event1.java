package AWT;
import java.awt.*;
import java.awt.event.*;
class buttondemo extends Frame implements ActionListener{
    int count = 0;
    Button b;
    Label l;

    buttondemo(){
    super("Button demo");
    l = new Label("    " + count);
    b = new Button("click");
    b.addActionListener(this);

    setLayout(new FlowLayout());
    add(l);
    add(b);

     }
     public void actionPerformed(ActionEvent e){
        count ++;
        l.setText("   " + count);
     }

}
public class event1 {
    public static void main(String[] args) {
        buttondemo bd = new buttondemo();
        bd.setSize(300, 300);
        bd.setVisible(true);
    }
}
