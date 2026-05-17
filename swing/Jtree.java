package swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.*;
import java.awt.*;

class treedemo extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel label;

    treedemo(){
        super("Tree demo");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:/Users/HP/Desktop/java");
        File f = new File("C:/Users/HP/Desktop/java");

        for(File x : f.listFiles()){
            // for directory
            if(x.isDirectory()){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for(File y : x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(x.getName()));
                }
                root.add(temp);
            }
            else {
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }
        tree = new JTree(root);
        tree.addTreeSelectionListener(this);
        // add scrollbar
        JScrollPane p = new JScrollPane(tree);
        label = new JLabel("No file selected");



        add(p, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
    }
    public void valueChanged(TreeSelectionEvent e){
        label.setText(e.getPath().toString());
    }
}
public class Jtree {
    public static void main(String[] args) {
    treedemo d = new treedemo();
    d.setSize(300, 300);
    d.setVisible(true);
    d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
