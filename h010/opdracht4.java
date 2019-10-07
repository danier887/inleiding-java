package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht4 extends Applet {

    TextField tekstvakmaand, tekstvakjaar;
    int maand;
    int jaartal;
    String s,j, tekst ,tekst2;

    public void init() {

        setSize(400,400
        );
        tekstvakmaand = new TextField(20);
        tekstvakmaand.addActionListener(new tekstlistener());
        add(tekstvakmaand);

        tekstvakjaar = new TextField(20);
        tekstvakjaar.addActionListener(new tekstlistener());
        add(tekstvakjaar);
    }


    public void paint(Graphics g) {

        g.drawString("maand", 30, 60);
        g.drawString("jaar",200,80);



        g.drawString(tekst,50,100);
        g.drawString(tekst2,50,140);
    }

    class tekstlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {




                j = tekstvakjaar.getText();
                String userinputString = tekstvakjaar.getText();
                jaartal = Integer.parseInt(userinputString);


                s = tekstvakmaand.getText();
                String userinputString2 = tekstvakmaand.getText();
                maand = Integer.parseInt(userinputString2);


            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0))){
                tekst2 = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst2 = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();

                switch (maand) {
                    case 1:
                        tekst = "januari heeft 31 dagen";
                        break;
                    case 2:
                        tekst = "februari heeft 28 dagen";
                        break;
                    case 3:
                        tekst = "maart heeft 31 dagen";
                        break;
                    case 4:
                        tekst = "april heeft 30 dagen ";
                        break;
                    case 5:
                        tekst = "mei heeft 31 dagen";
                        break;
                    case 6:
                        tekst = " juni heeft 30 dagen";
                        break;
                    case 7:
                        tekst = "juli heeft 31 dagen";
                        break;
                    case 8:
                        tekst = "augustus heeft 31 dagen";
                        break;
                    case 9:
                        tekst = "september heeft 30 dagen";
                        break;
                    case 10:
                        tekst = "oktober heeft 31 dagen";
                        break;
                    case 11:
                        tekst = "november heeft 30 dagen";
                        break;
                    case 12:
                        tekst = "december heeft 31 dagen ";

                    default:

                }
                repaint();
            }
        }
    }


