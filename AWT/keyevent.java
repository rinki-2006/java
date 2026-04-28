package AWT;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class keydemo extends Frame implements KeyListener {
    Label l1, l2, l3, l4;

    keydemo(){
        super("Key demo event");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);
        l1.setBounds(30, 20, 200, 50);
        l2.setBounds(30, 50, 200, 50);
        l3.setBounds(30, 80, 200, 50);
        l4.setBounds(30, 110, 200, 50);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
        l1.setText("key pressed");
        l2.setText("");
    }
    public void keyReleased(KeyEvent e){
        l2.setText("key released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
    public void keyTyped(KeyEvent e){
        l3.setText("Key typed ");

        l4.setText(new Date(e.getWhen()) + "");
    }
}
public class keyevent {
    public static void main(String[] args) {
        keydemo kd = new keydemo();
        kd.setSize(500,500);
        kd.setVisible(true);
    }


}
