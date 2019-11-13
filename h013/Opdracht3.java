package h013;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {


    Button rodemuur;
    Button betonnenmuur;

    public void init() {
        rodemuur = new Button("");
        rodemuur.addActionListener(new muurknoplistener());
        add(rodemuur);
        betonnenmuur = new Button("");
        betonnenmuur.addActionListener(new betonknoplistener());
        add(betonnenmuur);

    }

    class muurknoplistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekenRodemMuur(getGraphics(),50,50,40,20);

        }
    }
    class betonknoplistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            tekenBetonenMuur(getGraphics(),50,50,60,40);
        }
    }


    public void paint(Graphics g) {

    }

    void tekenRodemMuur (Graphics g, int y, int x, int width, int height){

        for (int i = 0; i < 12; i++) {
            x=20;
            for (int j = 0; j < 12; j++) {
                g.setColor(Color.red);
                g.fillRect(x,y,width,height);
                g.setColor(Color.black);
                g.drawRect(x,y,width,height);
                x += width;

            }
            y += height;
        }
    }
    void tekenBetonenMuur(Graphics g, int x, int y, int width2, int height2){

        for (int i = 0; i < 6; i++) {
            x=20;
            for (int j = 0; j < 8; j++) {
                g.setColor(Color.gray);
                g.fillRect(x,y,height2,width2);
                g.setColor(Color.black);
                g.drawRect(x,y,height2,width2);
                x+= width2;


            }
            y += height2;
        }
    }

}
