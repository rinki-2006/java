package AWT;
import java.awt.*;
import java.awt.event.*;

class listboxdemo extends Frame implements ItemListener, ActionListener {
    List l;
    Choice c;
    TextArea ta;

    listboxdemo() {
        super("List box demo");
        l = new List(4, true);
        c = new Choice();
        ta = new TextArea(20, 30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wedday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == l) {
            ta.setText(l.getSelectedItem());
        } else {
            ta.setText(c.getSelectedItem());
        }
    }
    public void actionPerformed(ActionEvent e){
        String list[] = l.getSelectedItems();
        String txt = "";
        for(String x : list){
            txt = txt + x + "\n";
            ta.setText(txt);
        }
    }
}

    public class listboxandchoice {
        public static void main(String[] args) {
            listboxdemo lb = new listboxdemo();
            lb.setSize(400, 400);
            lb.setVisible(true);
        }
    }

