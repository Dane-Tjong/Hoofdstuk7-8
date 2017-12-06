package HS8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet{
    TextField calc1,calc2;
    double cijfer1,cijfer2;
    Button keer,gedeeld,plus,min;
    double antwoord;

    public void init() {
        calc1 = new TextField("", 15);
        add(calc1);


        calc2 = new TextField("", 15);
        add(calc2);

        keer = new Button();
        keer.setLabel("*");
        keerListener kn1 = new keerListener();
        keer.addActionListener(kn1);
        add(keer);

        gedeeld = new Button();
        gedeeld.setLabel("/");
        gedeeldListener kn2 = new gedeeldListener();
        gedeeld.addActionListener(kn2);
        add(gedeeld);

        plus = new Button();
        plus.setLabel("+");
        plusListener kn3 = new plusListener();
        plus.addActionListener(kn3);
        add(plus);

        min = new Button();
        min.setLabel("-");
        minListener kn4 = new minListener();
        min.addActionListener(kn4);
        add(min);

    }

    public void paint(Graphics g) {
        g.drawString("het antwoord = "+antwoord,50,60);
    }

    class keerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = calc1.getText();
            cijfer1 = Double.parseDouble(s1);

            String s2 = calc2.getText();
            cijfer2 = Double.parseDouble(s2);

            antwoord = cijfer1*cijfer2;
            repaint();
        }
    }

    class gedeeldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = calc1.getText();
            cijfer1 = Double.parseDouble(s1);

            String s2 = calc2.getText();
            cijfer2 = Double.parseDouble(s2);

            antwoord = cijfer1/cijfer2;
            repaint();
        }
    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = calc1.getText();
            cijfer1 = Double.parseDouble(s1);

            String s2 = calc2.getText();
            cijfer2 = Double.parseDouble(s2);

            antwoord = cijfer1+cijfer2;
            repaint();
        }
    }

    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = calc1.getText();
            cijfer1 = Double.parseDouble(s1);

            String s2 = calc2.getText();
            cijfer2 = Double.parseDouble(s2);

            antwoord = cijfer1-cijfer2;
            repaint();
        }
    }

}

