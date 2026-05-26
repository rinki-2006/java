package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

class combodemo extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {
    JComboBox cb;
    JList list;
    JTextField tf;
    JSpinner sp1, sp2;

    combodemo(){
        super("Combo demo");
        String countries[] ={"India", "US", "UK", "America"};
        String months[] = {"January", "February", "March", "April" , "May", "June", "July", "August", "September", "October", "November", "December"};
       String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        cb = new JComboBox(countries);
        list = new JList(months);
        list.setVisibleRowCount(5);
        tf = new JTextField(15);
        JScrollPane sp = new JScrollPane(list);

        sp1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        sp2 = new JSpinner(new SpinnerListModel(days));

        setLayout(new FlowLayout());
        add(cb);
        add(sp);
        add(sp1);
        add(sp2);
        add(tf);

        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText((String) cb.getSelectedItem());
    }
    public void valueChanged(ListSelectionEvent e){
        tf.setText((String)list.getSelectedValue());
    }
    public void stateChanged(ChangeEvent e){
        if(e.getSource() == sp1){
            tf.setText(sp1.getValue() + " ");
        }
        else{
            tf.setText((String)sp2.getValue());
        }
    }
        }
public class listcombospinner {
    public static void main(String[] args) {
        combodemo c = new combodemo();
        c.setSize(500,500);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
