package AWT;
import java.awt.*;
import java.awt.event.*;

class windowdemo extends Frame implements WindowListener{
    Label l;

    windowdemo(){
        super("Window event demo");
        l = new Label("                     ");
        setLayout(new FlowLayout());
        add(l);
        addWindowListener(this);
    }
    public void windowOpened(WindowEvent e){
        l.setText("Window opened");
    }
    public void windowActivated(WindowEvent e){
        l.setText("Window activated");
    }
    public void windowDeactivated(WindowEvent e){
        l.setText("Window deactivated");
    }
    public void windowIconified(WindowEvent e){
        l.setText("Window minimize");
    }
    public void windowDeiconified(WindowEvent e){
        l.setText("Window Deiconified");
    }
    public void windowClosed(WindowEvent e){
        l.setText("Window closed");
    }
    public void windowClosing(WindowEvent e){
        l.setText("Window closing");
        System.exit(0);
    }
}
public class windowevent {
    public static void main(String[] args) {
        windowdemo wd = new windowdemo();
        wd.setSize(500,500);
        wd.setVisible(true);
    }
}
