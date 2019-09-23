package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    int ChakirGewicht;
    int DamirGewicht;
    int JayronGewicht;

    int hoogteXas;

    public void init(){

        setSize(900,900);

        hoogteXas = 360;

        ChakirGewicht = 100;
        DamirGewicht = 300 ;
        JayronGewicht = 50 ;

    }


    public void paint(Graphics g) {
        // staven

        // chakir
        g.setColor(Color.black);
        int hoogteXas= 350;
             g.fillRect(130,  hoogteXas - ChakirGewicht,50, ChakirGewicht);

        // damir
        g.setColor(Color.blue);
        g.fillRect(80,hoogteXas - DamirGewicht,50, DamirGewicht);

        // jayron
        g.setColor(Color.green);
        g.fillRect(180, hoogteXas - JayronGewicht, 50, JayronGewicht);





        g.setColor(Color.black);
        // verticale as
        g.drawLine(50,100,50,hoogteXas);

        // horizontale as
        g.drawLine(50,hoogteXas,250,hoogteXas);










}
}