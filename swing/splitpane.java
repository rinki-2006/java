package swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class splitpanedemo extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList list;
    JLabel label;

    splitpanedemo(){
        super("Split pane demo");
        String cols[]  = {"RED", "BLUE", "GREEN", "YELLOW", "BLACK"};
        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane sp1 = new JScrollPane(list);
        add(sp1);

        label = new JLabel(" ");
        label.setOpaque(true);
        label.setBackground(Color.RED);
        JScrollPane sp2 = new JScrollPane(label);
        add(sp2);

//        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sp1, sp2);
//        sp.setDividerLocation(200);
//        add(sp);

        JTabbedPane tp = new JTabbedPane();
        tp.add("Color" , sp1);
        tp.add("Label" , sp2);
        add(tp);
    }
    public void valueChanged(ListSelectionEvent e){
        String str = (String)list.getSelectedValue();
        switch (str){
            case "RED" :
                label.setBackground(Color.RED);
                break;
            case "BLUE" :
                label.setBackground(Color.BLUE);
                break;
            case "GREEN" :
                label.setBackground(Color.GREEN);
                break;
            case "YELLOW" :
                label.setBackground(Color.YELLOW);
                break;
            case "BLACK" :
                label.setBackground(Color.BLACK);
                break;
        }
    }

}
public class splitpane {
    public static void main(String[] args) {
        splitpanedemo p = new splitpanedemo();
        p.setSize(500,500);
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
