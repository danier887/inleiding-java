package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {

    //globaal

    Button Jongens;
    Button meisjes;
    Button mannen;
    Button vrouwen;

    int aantaljongens;
    int aantalmeisjes;
    int aantalmannen;
    int aantalvrouwen;
    int totaal;

    public void init() {
        setSize(400, 400);


        // knoppen
        Jongens = new Button("jongens");
        Jongens.addActionListener(new JongensListener());
        add(Jongens);
        meisjes = new Button("meisjes");
        meisjes.addActionListener(new meisjestListener());
        add(meisjes);
        mannen = new Button("mannen");
        mannen.addActionListener(new mannenlistener());
        add(mannen);
        vrouwen = new Button("vrouwen");
        vrouwen.addActionListener(new vrouwenlistener());
        add(vrouwen);

        aantaljongens = 0;
        aantalmeisjes = 0;
        aantalmannen=  0;
        aantalvrouwen= 0;
        totaal = 0;
    }

    // tabel
    public void paint(Graphics g) {
        // verticaal
        g.drawLine(30, 300, 30, 60);
        g.drawLine(30, 340, 30, 60);
        g.drawLine(30, 380, 30, 60);
        g.drawLine(100,350,100,60);
        // horiontaal
        g.drawLine(200, 60, 30, 60);
        g.drawLine(200, 110, 30, 110);
        g.drawLine(200, 160, 30, 160);
        g.drawLine(200, 210, 30, 210);
        g.drawLine(200, 260, 30, 260);
        //
        g.drawString(aantaljongens + "", 150, 100);
        g.drawString(aantalmeisjes + "", 150, 150);
        g.drawString(aantalmannen+ "",150,200);
        g.drawString(aantalvrouwen+"",150,250);
        g.drawString(totaal + "",150,300);

        g.drawString("jongens",50,100);
        g.drawString("meisjes",50,150);
        g.drawString("mannen",50,200);
        g.drawString("vrouwen",50,250);
        g.drawString("totaal",50,300);
    }


    class JongensListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        aantaljongens++;
        totaal++;
        repaint();

        }
    }

    class meisjestListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
         aantalmeisjes++;
         totaal++;
         repaint();
        }

    }

    class mannenlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        aantalmannen++;
        totaal++;
        repaint();
        }
    }

    class vrouwenlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        aantalvrouwen++;
        totaal++;
        repaint();
        }


    }
}








