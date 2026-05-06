package swing;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

class textfield extends JFrame{
    textfield() {
        super("Formatted text field demo");
        JTextField tf = new JTextField(20);
        DateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
        JFormattedTextField ft = new JFormattedTextField(df);
        ft.setColumns(15);
        ft.setValue(0);

//        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nf1 = new NumberFormatter(nf);
        nf1.setAllowsInvalid(false);
        nf1.setMaximum(10000);
        JFormattedTextField ft1 = new JFormattedTextField(nf1);
        ft1.setValue(0); // for currency
        ft1.setColumns(15);

        JTextArea ta = new JTextArea(10,10);
        add(ta);
        add(tf);
        add(ft);
        add(ft1);
        setLayout(new FlowLayout());

    }
}
public class formattedtextfield {
    public static void main(String[] args) {
        textfield b1 = new textfield();
        b1.setSize(300, 300);
        b1.setVisible(true);
        b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
