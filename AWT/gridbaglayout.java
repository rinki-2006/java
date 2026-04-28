package AWT;

import java.awt.*;

class gridbagdemo extends Frame {
    Button b1, b2, b3, b4, b5;

    gridbagdemo() {
        super("Gridbag layout demo");
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");



        gbc.gridx = 1;
        gbc.gridy = 1;
        add(b1, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(b2,gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(b3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(b4,gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        add(b5,gbc);

    }
}
public class gridbaglayout {
    public static void main(String[] args) {
        gridbagdemo gbd = new gridbagdemo();
        gbd.setSize(500,500);
        gbd.setVisible(true);
    }
}
