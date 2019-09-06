package h02;


import java.applet.Applet;


/*

@(#)Show.java 1.0 03/02/26

*

 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;

//een klasse met de naam Show van het type Applet
public class opdracht1 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.blue);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("danier barghouty", 50, 60 );


    }






}

