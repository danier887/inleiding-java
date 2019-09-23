package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet{

    int Totaalbedrag;
    int Verdeelbedrag;

    public void init(){

setSize(800,800);

        }


public void paint(Graphics g){

     Totaalbedrag = 113;
     Verdeelbedrag = 4;

        // tabel

g.setColor(Color.black);
       g.drawLine(100,320,100,30);
       g.drawLine(150,320,150,30);
       g.drawLine(200,320,200,30);
       g.drawLine(250,320,250,30);
       g.drawLine(80,50,300,50);
       g.drawLine(80,100,300 ,100);
       g.drawLine(80,150,300,150);
       g.drawLine(80,200,300,200);
       g.drawLine(80,250,300,250);
       g.drawLine(80,300,300,300);

       // namen in het tabel

       g.drawString("jan ", 50, 80);
       g.drawString("ali", 50, 130);
       g.drawString("jeanette", 50, 180);
       g.drawString("danier", 50, 230);

      //  hoeveelheid euro in het tabel en het aantal waardoor het gedeeld word

       g.drawString("4", 120, 40);
       g.drawString("113", 160, 40);

       g.drawString("euro" + Totaalbedrag/Verdeelbedrag, 105, 80);
       g.drawString("euro" + Totaalbedrag/Verdeelbedrag, 105, 130);
       g.drawString("euro" + Totaalbedrag/Verdeelbedrag, 105, 180);
       g.drawString("euro" + Totaalbedrag/Verdeelbedrag, 105, 230);









}






}
