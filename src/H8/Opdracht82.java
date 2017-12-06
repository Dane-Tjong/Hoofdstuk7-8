package HS8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet{
    int man,vrouw,pman,pvrouw, totaal;
    Button knopMan,knopVrouw,knopPMan,knopPVrouw;

    public void init() {
        knopMan = new Button();
        knopMan.setLabel("Oke");
        knopManListener kn1 = new knopManListener();
        knopMan.addActionListener(kn1);
        add(knopMan);
        knopMan.setLabel("Man");

        knopVrouw = new Button();
        knopVrouw.setLabel("Oke");
        knopVrouwListener kn2 = new knopVrouwListener();
        knopVrouw.addActionListener(kn2);
        add(knopVrouw);
        knopVrouw.setLabel("vrouw");

        knopPMan = new Button();
        knopPMan.setLabel("Oke");
        knopPManListener kn3 = new knopPManListener();
        knopPMan.addActionListener(kn3);
        add(knopPMan);
        knopPMan.setLabel("Potentiële Man");

        knopPVrouw = new Button();
        knopPVrouw.setLabel("Oke");
        knopPVrouwListener kn4 = new knopPVrouwListener();
        knopPVrouw.addActionListener(kn4);
        add(knopPVrouw);
        knopPVrouw.setLabel("Potentiële Vrouw");

    }
    public void paint(Graphics g) {
        g.drawString("er zijn zoveel mannen: "+ man,40,50);
        g.drawString("er zijn zoveel vrouwen: "+ vrouw,40,65);
        g.drawString("er zijn zoveel potentielemannen: "+ pman,40,80);
        g.drawString("er zijn zoveel potentielevrouwen: "+ pvrouw,40,95);
        g.drawString("Dit zijn het totaal mensen: "+ totaal,40,110);

    }

    class knopManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man++;
            totaal++;
            repaint();
        }
    }
    class knopVrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            totaal++;
            repaint();
        }
    }
    class knopPManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pman++;
            totaal++;
            repaint();
        }
    }
    class knopPVrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pvrouw++;
            totaal++;
            repaint();
        }
    }

}
