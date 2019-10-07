package h011;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {




    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 21) {
            x += 20;


            g.drawString("" + teller, x, 30 );
            teller++;
        }
    }
}




