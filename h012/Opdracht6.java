package h012;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet implements ActionListener {


    int[] getallen = {1, 4, 6, 6, 7, 8, 9};
    TextField tekstvak;
    int index;
    boolean gevonden;


    public void init() {

        tekstvak = new TextField(10);
        tekstvak.addActionListener(this);
        add(tekstvak);

    }


    public void paint(Graphics g) {

        if (gevonden) {
            g.drawString("index is gevonden"+index, 50, 50);
        } else { g.drawString("index is niet gevonden",50,50);
        }

    }

    public void actionPerformed(ActionEvent e) {

        gevonden = false;

        int input = Integer.parseInt(tekstvak.getText());


        for (int i = 0; i <getallen.length ; i++) {
            if (getallen[i] == input) {
                gevonden = true;
                index = i;


            }

        }
        repaint();
    }
}

