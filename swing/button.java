package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Jbutton extends JFrame implements ActionListener {
    JButton b;
    JLabel l;
    int count = 0;

    Jbutton(){
        super("swing demo");
        b = new JButton("Click");
        l = new JLabel("count" + count);
        add(b);
        add(l);
        setLayout(new FlowLayout());
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        count++;
        l.setText(String.valueOf(count));
    }
}
public class button {
    public static void main(String[] args) {
        Jbutton b1 = new Jbutton();
        b1.setSize(300, 300);
        b1.setVisible(true);
        b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
