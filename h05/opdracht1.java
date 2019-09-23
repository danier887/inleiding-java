package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {




    //declaratie.
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;

        public void init() {

           setSize(800,800);

            //initialisatie.
            opvulkleur = Color.MAGENTA;
            lijnkleur = Color.BLACK;
            breedte = 200;
            hoogte = 100;

        }

        public void paint(Graphics g) {

         // lijn

         g.drawLine( 200,  100 ,breedte, hoogte);

            //teken rechthoek
            g.drawRect(100, 100, breedte, hoogte);


            //teken afgeronde rechthoek
            g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

            //teken gevulde rechthoek
            g.setColor(opvulkleur);
            g.fillRect(315, 100, breedte, hoogte);

            //teken ovaal
            g.setColor(lijnkleur);
            g.drawOval(315, 100, breedte, hoogte);

            //teken gevulde ovaal
            g.setColor(opvulkleur);
            g.fillOval(315, 225, breedte, hoogte);

            // cirkel
            g.setColor(opvulkleur);
            g.fillOval (150, 350, 100, 100);

            //  naam rechthoek
            g.setColor(Color.black);
            g.drawLine( 100,  60, 300,60 );


            g.setColor(Color.black);
            g.drawOval (350, 350, 100, 100);







        }
    }

















