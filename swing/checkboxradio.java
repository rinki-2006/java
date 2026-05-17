package swing;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class checkbox extends JFrame implements ActionListener {
    JTextField tf;
    JCheckBox c1, c2;
    JRadioButton r1, r2;
    checkbox(){
        tf = new JTextField("Demo text", 20);
        tf.setBounds(10, 20, 100, 80);

        c1 = new JCheckBox("Bold");
        // press ALT + B
        c1.setMnemonic(KeyEvent.VK_B);

        c2 = new JCheckBox("Italic");
        // press ALT + I
        c2.setMnemonic(KeyEvent.VK_I);

        r1 = new JRadioButton("Upper");
        r2 = new JRadioButton("Lower");
        // select one radio at one time
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        r1.addActionListener(this);
        r2.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);

        r1.setActionCommand("Upper");
        r2.setActionCommand("lower");
        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
    }
   public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()){
            case"Upper":
                tf.setText(tf.getText().toUpperCase());
                break;
            case"lower":
                tf.setText(tf.getText().toLowerCase());
                break;
        }
        int b = 0, i = 0;
        if(c1.isSelected()){
            b = Font.BOLD;
        }
        if(c2.isSelected()){
            i = Font.ITALIC;
        }
        Font f = new Font("Times New Roman", b|i, 15);
        tf.setFont(f);
   }
}
public class checkboxradio {
    public static void main(String[] args) {
    checkbox c = new checkbox();
    c.setSize(300, 300);
    c.setVisible(true);
    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
