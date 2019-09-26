package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {


    // globaal
    int positiefgetal;
    int Positiefgetal1;
    int negatiefgetal;
    int uitkomst;


    public void init() {

positiefgetal= 10;
Positiefgetal1=10;
negatiefgetal=5;

uitkomst = (positiefgetal+Positiefgetal1) /negatiefgetal;


    }



    public void paint(Graphics g){

        g.drawString("de uitkomst is:" + uitkomst, 20, 20);

    }







}
