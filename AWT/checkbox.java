package AWT;
import java.awt.*;
import java.awt.event.*;

class checkboxdemo extends Frame implements ItemListener{
    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup cg;

    checkboxdemo() {
        super("Checkbox demo");
        l = new Label("Nothing is selected");
        cg = new CheckboxGroup();
        c1 = new Checkbox("Java", false, cg);
        c2 = new Checkbox("Python", false,cg);
        c3 = new Checkbox("C#",false,cg);

        // for checkbox
//        c1 = new Checkbox("Java");
//        c2 = new Checkbox("Python");
//        c3 = new Checkbox("C#");

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
       public void  itemStateChanged(ItemEvent e){
            String str = "";
            if(c1.getState()){
                str = str + " " + c1.getLabel();
        }
           if(c2.getState()){
               str = str + " " + c2.getLabel();
           }
           if(c3.getState()){
               str = str + " " + c3.getLabel();
           }
           if(str.isEmpty()){
               str = "Nothing is selected";
           }
           l.setText(str);
    }
}
public class checkbox {
    public static void main(String[] args) {
        checkboxdemo cd = new checkboxdemo();
        cd.setSize(450,450);
        cd.setVisible(true);

    }
}
