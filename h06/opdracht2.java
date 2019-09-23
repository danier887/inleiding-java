package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    int minuut;
    int dag;
    int uur;
    int jaar;


    public void paint(Graphics g) {

        minuut=1*60;
        uur=60;
        dag=24;
        jaar=365;

        g.setColor(Color.black);
        g.drawLine(100, 320, 100, 30);

        g.drawLine(80, 50, 300, 50);
        g.drawLine(80, 100, 300, 100);
        g.drawLine(80, 150, 300, 150);
        g.drawLine(80, 200, 300, 200);
        g.drawLine(80, 250, 300, 250);
        g.drawLine(80, 300, 300, 300);


        g.drawString("seconden", 40, 80);
        g.drawString("uren", 60, 130);
        g.drawString("dagen", 50, 180);
        g.drawString("jaren", 55, 230);

        g.drawString("In een minuut zitten " + minuut + " seconden", 110,90);
        g.drawString("In een uur zitten " + uur + " minuten", 110,130);
        g.drawString("In een dag zitten " + dag+ " uren ", 110,180);
        g.drawString("In een jaar zitten " + dag+ " dagen ", 110,230);
    }
}





