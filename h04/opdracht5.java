package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {

    Color opvulkleur;


    public void init() {
        opvulkleur = Color.yellow;

    }






    public void paint(Graphics g) {
        g.setColor(opvulkleur);

        setBackground(Color.blue);
        g.drawOval(50,50,100,200);

    }












}
