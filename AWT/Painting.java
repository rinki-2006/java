package AWT;
import java.awt.*;
import java.awt.event.*;
class mypaint extends Frame{
    int x = 0;
    int y  = 0;
    mypaint() {
        super("Painting");
//        addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e){
//            x = e.getX();
//            y = e.getY();
//            repaint();
//
//            }
//        });
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e){
                x = e.getX();
                y = e.getY();
                repaint();

            }
        });
    }


    public void paint(Graphics g){
        g.setColor(Color.RED);
//        g.drawOval(x, y, 50,50);

        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Hello", x, y);
    }
}
public class Painting {
    public static void main(String[] args) {
        mypaint p = new mypaint();
        p.setSize(300,300);
        p.setVisible(true);
    }
}
