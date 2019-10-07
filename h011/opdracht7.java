package h011;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {



        public void init () {

            setSize(600,600);
        }


        public void paint (Graphics g){


            int x = 200;
            int y = 200;
            int width = 20;
            int height = 20;
            int teller = 0;


            while (teller < 50) {

                g.drawOval(x, y, width, height);

                x -= 10;
                y -= 10;
                width += 20;
                height += 20;
                teller++;

            }
        }
    }
