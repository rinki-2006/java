package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class internalframe1 extends JInternalFrame{
    static int count = 0;
    JTextArea ta;
    JScrollPane sp;

    internalframe1(){
        super("Document " + (++count) , true, true, true, true);
        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenuItem m2 = new JMenuItem("Save");

        m1.add(m2);
        mb.add(m1);
        setJMenuBar(mb);

        setSize(300,300);
        setVisible(true);
        setLocation(50,50);
    }
}
class internalframedemo extends JFrame implements ActionListener {
    JDesktopPane dp;

    internalframedemo(){
        super("Internal frame demo");
        dp = new JDesktopPane();
        setContentPane(dp);

        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");

        m.add(m1);
        mb.add(m);
        setJMenuBar(mb);

        m1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        internalframe1 i = new internalframe1();
        dp.add(i);
    }
}
public class JInternalframe {
    public static void main(String[] args) {
        internalframedemo id = new internalframedemo();
        id.setSize(800,800);
        id.setVisible(true);
        id.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
