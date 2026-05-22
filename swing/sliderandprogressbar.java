package swing;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class sliderdemo extends JFrame implements ChangeListener {
    JSlider sl;
    JProgressBar pb;
    JPanel p1, p2;
    int w = 50;

    sliderdemo(){
        super("Slider demo");
        sl = new JSlider(0, 100,50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        pb = new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);
//        pb.setIndeterminate(true);

        p1 = new JPanel(){
            public void paintComponent(Graphics g){
                // clear the previous drawing
                super.paintComponent(g);
                // 250-w/2 keep the circle in center
                g.drawOval(200 - w/2,200- w/2,w,w);
            }
        };

        p2 = new JPanel();
        p2.add(pb);

        add(sl, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        sl.addChangeListener(this);
    }
    public void stateChanged(ChangeEvent e){
        w = sl.getValue();
        p1.repaint();
        pb.setString(w + " %");
        pb.setStringPainted(true);
        pb.setValue(w);
    }
}
public class sliderandprogressbar {
    public static void main(String[] args) {
        sliderdemo s = new sliderdemo();
        s.setSize(500,500);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
