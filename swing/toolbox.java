package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

class tooldemo extends JFrame implements ActionListener {
    JToolBar tb;
    JButton b1, b2, b3, b4, b5;
    JTextArea ta;

    tooldemo() {
        super("Tool demo");
        tb = new JToolBar();
        b1 = new JButton(new ImageIcon("C:\\Users\\HP\\Downloads\\save.png"));
        b2 = new JButton(new ImageIcon("C:\\Users\\HP\\Downloads\\open.png"));
        b3 = new JButton(new ImageIcon("C:\\Users\\HP\\Downloads\\copy.png"));
        b4 = new JButton(new ImageIcon("C:\\Users\\HP\\Downloads\\cut2.png"));
        b5 = new JButton(new ImageIcon("C:\\Users\\HP\\Downloads\\new.png"));

        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(b5);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        add(tb, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        JMenuItem m2 = new JMenuItem("open");
        file.add(m1);
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        m2.setMnemonic(KeyEvent.VK_O);

        b2.setActionCommand("open");
        b2.addActionListener(this);
        m2.addActionListener(this);

        b1.addActionListener(this);
        m1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("open")) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File f = fc.getSelectedFile();

            try {
                FileInputStream fis = new FileInputStream(f);
                byte b[] = new byte[fis.available()];
                fis.read(b);

                String str = new String(b);
                ta.setText(str);
                fis.close();
            } catch (Exception ae) {
                System.out.println(ae);
            }
        }
        else{
            Color col = JColorChooser.showDialog(this, "FontColor", Color.red);
            ta.setForeground(col);
        }
    }
}
public class toolbox {
    public static void main(String[] args) {
    tooldemo td = new tooldemo();
    td.setSize(300,300);
    td.setVisible(true);
    td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
