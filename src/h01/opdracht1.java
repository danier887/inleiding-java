package h01;


import java.awt.*;

public class opdracht1 {
    
    //een (lege) methode die de Applet initialiseert
    public void danier() {

    }

    public void init() {
        setBackground(Color.yellow);
    }

    private void setBackground(Color yellow) {
    }


    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("hallo ik ben danier barghouty", 50, 60);
    }
}

