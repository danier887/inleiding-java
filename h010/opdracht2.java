package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {

    TextField tekstvak;
    boolean firstnumber;
    int getal1;
    int getal2;
    int userinput;
    String sorry;



    public void init() {

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstlistener());
        add(tekstvak);

        getal1 = 0;
        getal2 = 0;
        firstnumber = true;
        sorry = " ";

    }


    public void paint(Graphics g) {

        g.drawString("hoogste getal:" + getal1, 50, 100);
        g.drawString("laagste getal:" + getal2, 60, 200);
        g.drawString(sorry, 50, 160);


    }


    class tekstlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String userinputstring = tekstvak.getText();
            userinput = Integer.parseInt(userinputstring);

            if (firstnumber) {
                firstnumber = false;
                getal1 = userinput;
                getal2 = userinput;
                repaint();

            } else {
                if (userinput > getal1) {
                    getal1 = userinput;
                    sorry = " ";
                } else if (userinput < getal2) {
                    getal2 = userinput;
                    sorry = "";
                    repaint();
                } else {
                    sorry = "sorry, maar " + userinput + " is niet hoger dan" + " is niet lager dan " + getal2;
                    repaint();

                }


            }
        }
    }
}