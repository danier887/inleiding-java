package h011;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet
{

    public void init() {

    }


    public void paint(Graphics g) {


        setSize(400,400);

        int y = 0;
        int x = 0;
        int teller = 0;


        while (teller <5)


        {


            y +=40;
            x +=40;


            g.drawRect(x,y,40,40);

            teller++;
        }




    }








}
