package AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;


class menudemo extends Frame {
    Menu file, sub;
    MenuItem open , save, close, closeall;
    CheckboxMenuItem auto;
    TextField tf;

    menudemo(){
        // first create menu item
        super("Menu demo");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("CloseAll");
        auto = new CheckboxMenuItem("Auto Save");

        // create menu
        file = new Menu("File");
        sub = new Menu("Close");

        // add all the thing into menu
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add("Close");
        sub.add("CloseAll");

        // add menu to memubar
        MenuBar mb = new MenuBar();
        mb.add(file);
        // add menu bar to file
        setMenuBar(mb);

        // for text field
        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);


        open.addActionListener((ActionEvent e)-> tf.setText("Open"));
        save.addActionListener((ActionEvent e)-> tf.setText("Save"));
        close.addActionListener((ActionEvent e)-> tf.setText("Close"));
        closeall.addActionListener((ActionEvent e)-> tf.setText("CloseAll"));

        auto.addItemListener((ItemEvent ie)->{
            if(auto.getState()){
                tf.setText("Auto On");
            }
            else{
                tf.setText("Auto off");
            }
                }
                );
    }


}
public class menu {
    public static void main(String[] args) {
        menudemo md = new menudemo();
        md.setSize(500, 500);
        md.setVisible(true);
    }
}
