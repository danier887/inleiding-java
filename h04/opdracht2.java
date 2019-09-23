package h04;



       import java.applet.Applet;
       import java.awt.*;

public class opdracht2 extends Applet {


    // huis
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(300, 350, 300, 250);
        g.drawLine(300, 350, 350, 250);
        g.drawLine(600, 350, 350, 250);

        // raam
        g.drawRect(335, 450, 120, 100);

       // deur
        g.drawRect(500, 450, 80, 150);

    }











}
