package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht5 extends Applet {


    int cijfer;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstlistener());

        label = new Label("typ hier");

        add(tekstvak);
        add(label);
    }

    @Override
    public void paint(Graphics g) {

        g.drawString(tekst, 50, 45);


    }

    class tekstlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if (cijfer > 5) {
                tekst = " voldoende";
                repaint();

            } else {

                tekst = " onvoldoende ";
                repaint();
            }
        }

    }

}