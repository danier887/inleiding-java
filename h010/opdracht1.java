package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht1 extends Applet {


    TextField tekstvak;
    boolean firstnumber;
    int hoogste;
    int userinput;
    String sorry;


    public void init() {

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstlistener());
        add(tekstvak);

        hoogste = 0;
        firstnumber = true;
        sorry = " ";

    }


    public void paint(Graphics g) {

        g.drawString("hoogste getal:" + hoogste, 50, 100);
        g.drawString(sorry, 50, 160);


    }


    class tekstlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String userinputstring = tekstvak.getText();
            userinput = Integer.parseInt(userinputstring);

            if (firstnumber) {
                firstnumber = false;
                hoogste = userinput;
                repaint();

            } else {
                if (userinput > hoogste) {
                    hoogste = userinput;
                    sorry = " ";
                    repaint();


                }


            }
        }
    }
}