package h013;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void paint(Graphics g) {

        int x = 20;
        int y = 20;
        int weight = 40;
        int height = 40;

        rodemuur(g, x, y, weight, height);

    }

    void rodemuur(Graphics g, int x, int y, int weight, int height) {
        for (int i = 0; i <20 ; i++) {
            x = 20;
            for (int b = 0; b <10 ; b++) {
                g.setColor(Color.red);
                g.fillRect(x,y,weight,height);
                g.setColor(Color.black);
                g.drawRect(x,y,weight,height);
                y += weight;
                
            }

        }
    }
}
