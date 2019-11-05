package h012;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Opdracht5 extends Applet {

    TextField tekstvak;
    Button knop;
    boolean gevonden;
    boolean geklikt;
    int index;

    int[] getallen = {1, 2, 3, 4, 5, 6};


    public void init() {

        tekstvak = new TextField(10);
        add(tekstvak);

        knop = new Button(" knop");
        knop.addActionListener(this::actionPerformed);
        add(knop);

        gevonden = false;
    }

    public void paint(Graphics g) {

        if (geklikt) {
            if (gevonden) {
                g.drawString(" de index is gevonden " + index, 50, 60);
            } else {
                g.drawString(" de index is niet gevonden ", 50, 60);
            }
        }
    }


    public void actionPerformed(ActionEvent e) {
        gevonden = false;
        int input = Integer.parseInt(tekstvak.getText());
        geklikt = true;

        for (int i = 0; i < getallen.length; i++) {
            if (getallen[i] == input) {
                gevonden = true;
                index = 1;
            }
            repaint();
        }
        {
            for (int x :  getallen) {
                if (x ==  6) {
                    break;
                }
            }
        }
    }
}

