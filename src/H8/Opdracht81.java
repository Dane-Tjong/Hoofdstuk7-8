package H8;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht81 extends Applet {
    Button okeknop;
    Button resetknop;
    TextField tekstvak;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        label = new Label("Rush B Cyka");
        add(label);

        okeknop = new Button();
        okeknop.setLabel("Oke");
        okeknopListener kn1 = new okeknopListener();
        okeknop.addActionListener(kn1);
        add(okeknop);

        resetknop = new Button();
        resetknop.setLabel("Reset");
        resetknopListener kn2 = new resetknopListener();
        resetknop.addActionListener(kn2);
        add(resetknop);

    }

    public void paint(Graphics g) {
        g.drawString("dit is het getal." + getal,50,60);

    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }

    class okeknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }

    class resetknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            getal = 0;
            repaint();
        }
    }
}