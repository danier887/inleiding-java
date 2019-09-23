package h04;

      import java.applet.Applet;
      import java.awt.*;

public class opdracht1 extends Applet {


    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50, 100, 100, 100);
        g.drawLine(50, 100, 75, 75);
        g.drawLine(75, 75, 100, 100);

    }

}



