package HS8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht83 extends Applet{
    TextField tekstvak;
    Label label;
    double prijs;
    Button okeknop;

    public void init() {
        tekstvak = new TextField("schrijf de prijs hier", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        label = new Label("BTW Calculator");
        add(label);

        okeknop = new Button();
        okeknop.setLabel("Oke");
        okeknopListener kn1 = new okeknopListener();
        okeknop.addActionListener(kn1);
        add(okeknop);

    }



    public void paint(Graphics g) {
        g.drawString("prijs met BTW: "+ (prijs*1.21),60,70);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            prijs = Double.parseDouble( s );
            repaint();
        }
    }

    class okeknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            prijs = Double.parseDouble( s );
            repaint();
        }
    }
}
