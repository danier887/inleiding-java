package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht1 extends Applet {

    //globaal
    TextField tekstvak;
        Button knopOK;
        Button knopreset;
        String message;
        public void init() {
            setSize(400,400);

            tekstvak = new TextField("    ");
            add(tekstvak);

            knopOK = new Button("OK");
            knopOK.addActionListener(new KnopOKlistener());
            add(knopOK);

        knopreset = new Button("Reset");
        knopreset.addActionListener(new Knopresetlistener());
        add(knopreset);
        message ="er is niets getypt";
    }

    public void paint(Graphics g) {
     g.drawString(message,20,150);
    }
        class KnopOKlistener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
              message =tekstvak.getText();
              repaint();
            }
        }
        class Knopresetlistener implements ActionListener {


            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("de reset knopt werkt");
                tekstvak.setText("");
            }

        }

    }





















