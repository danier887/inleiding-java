package h011;

import java.applet.Applet;
import java.awt.*;

public class opdracht8 extends Applet {

    public void paint(Graphics g) {


        int x = 200;
        int y = 200;
        int width = 20;
        int height = 20;
        int teller = 0;


        while (teller < 100) {

            g.drawOval(x, y, width, height);

            x -= 10;
            y -= 10;
            width += 20;
            height += 20;
            teller++;

        }

    }
}
