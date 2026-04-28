package AWT;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class mousedemo extends Frame implements MouseListener, MouseMotionListener {
    Label l1,l2;

    mousedemo(){
        super("Mouse event demo");
        l1= new Label(" ");
        l2 = new Label("");

        setLayout(null);
        l1.setBounds(10,50,100,20);
        l2.setBounds(10,80,100,20);
        add(l1);
        add(l2);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseEntered(MouseEvent e){
        l1.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent e){
        l1.setText("Mouse exited");
    }
    public void mouseClicked(MouseEvent e){
        l1.setText("Mouse clicked");
    }
    public void mousePressed(MouseEvent e){
        l1.setText("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        l1.setText("Mouse released");
    }
    public void mouseDragged(MouseEvent e){
        l1.setText("Mouse dragged");
    }
    public void mouseMoved(MouseEvent e){
        l1.setText("mouse moved");
        l2.setText("(" + e.getX() + "," + e.getY() + ")");
    }
}
public class mouseevent {
    public static void main(String[] args) {
        mousedemo md = new mousedemo();
        md.setSize(500,500);
        md.setVisible(true);
    }
}
