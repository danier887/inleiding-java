package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {


    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(80, 105, 75, 30);
        g.setColor(Color.blue);
        g.fillRect(140, 105, 75, 60);
        g.setColor(Color.gray);
        g.fillRect(200, 105, 75, 80);



            g.setColor(Color.green);
            g.drawString("Valerie: 40 kg ", 60, 150);


            g.setColor(Color.blue);
            g.drawString(" Hans: 80 kg ", 120, 180);


            g.setColor(Color.gray);
            g.drawString(" Jeroen: 100 kg", 200, 200);
        }






}




