package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet {


    TextField tekstvak;
    TextField tekstvak1;
    Button Plus;
    Button Delen;
    Button Keer;
    Button Min;
    Double Getal;

    public void init() {

        tekstvak = new TextField(10);
        add  (tekstvak);

        tekstvak1 = new TextField(10);
        add(tekstvak1);

        Plus = new Button("+");
        Plus.addActionListener(new praktijkopdracht.Pluslistener());
       add(Plus);

       Delen = new Button(" / ");
       Delen.addActionListener(new praktijkopdracht.Delenlistener());
       add(Delen);


       Keer = new Button (" * ");
       Keer.addActionListener(new praktijkopdracht.Keerlistener());
       add(Keer);

       Min= new Button(" - ");
       Min.addActionListener(new praktijkopdracht.Minlistener());
       add(Min);

    }





    public void paint (Graphics g) {

        g.drawString("Het getal is " + Getal,60, 70 );


    }







    class Pluslistener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int input =Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak1.getText());
            int uitkomst = input + input2;
            tekstvak.setText("" + uitkomst);
            tekstvak1.setText("");
        }
    }

    class Delenlistener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int input =Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak1.getText());
            int uitkomst = input / input2;
            tekstvak.setText("" + uitkomst);
            tekstvak1.setText("");

        }
    }

    class Keerlistener implements  ActionListener {

        public void actionPerformed(ActionEvent e) {

            String s = tekstvak.getText();
            int input =Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak1.getText());
            int uitkomst = input * input2;
            tekstvak.setText("" + uitkomst);
            tekstvak1.setText("");
        }
    }

    class Minlistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String s = tekstvak.getText();
            int input =Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak1.getText());
            int uitkomst = input - input2;
            tekstvak.setText("" + uitkomst);
            tekstvak1.setText("");
        }
    }
}
