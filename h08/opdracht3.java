package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {


    TextField tekstvak;
    Button knopOK;

    String message;
    public void init() {
        setSize(400,400);

        tekstvak = new TextField("                         ");
        add(tekstvak);

        knopOK = new Button("OK");
        knopOK.addActionListener(new opdracht3.knoplistener());
        add(knopOK);










}

   0 {



    }
    }
