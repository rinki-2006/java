package AWT;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class cardlayoutdemo extends Frame implements ItemListener {
   Button b1,b2,b3;
   TextField tf1, tf2, tf3;
   Checkbox c1,c2;

   CardLayout cl;

   Panel p1;
   Panel p2;
   Panel cp;
   Panel mainp;

   cardlayoutdemo(){
       super("Card layout demo");
       CheckboxGroup cg = new CheckboxGroup();
       c1 = new Checkbox("One",true, cg);
       c2 = new Checkbox("two", false,cg);
       c1.addItemListener(this);
       c2.addItemListener(this);

       b1 = new Button("One");
       b2 = new Button("Two");
       b3 = new Button("Three");

       tf1 = new TextField(10);
       tf2 = new TextField(10);
       tf3 = new TextField(10);

       cp = new Panel();
       cp.add(c1);
       cp.add(c2);

       p1 = new Panel();
       p1.add(b1);
       p1.add(b2);
       p1.add(b3);

       Panel p2 = new Panel();
       p2.add(tf1);
       p2.add(tf2);
       p2.add(tf3);

       mainp = new Panel();
       cl = new CardLayout();
       mainp.setLayout(cl);
       mainp.add("One", p1);
       mainp.add("Two", p2);

       add(cp,BorderLayout.NORTH);
       add(mainp,BorderLayout.CENTER);
   }
   public void itemStateChanged(ItemEvent e){
       if(c1.getState()){
           cl.first(mainp);
       }
       else{
           cl.last(mainp);
       }
   }
}
public class cardlayout {
    public static void main(String[] args) {
        cardlayoutdemo cd = new cardlayoutdemo();
        cd.setSize(300,300);
        cd.setVisible(true);
    }
}
