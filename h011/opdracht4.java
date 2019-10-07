package h011;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {


    public void paint(Graphics g) {

        int y = 0;

        int teller=0;


        while (teller<30){

            y += 20;

            teller+=3;

            g.drawString(teller+ "    ", 60, y);




        }
    }
}
