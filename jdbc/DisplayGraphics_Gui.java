package jdbc;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
//-------------------Robot Head-----------------------//
import java.sql.Connection;
import javax.swing.JFrame;

public class DisplayGraphics_Gui extends Canvas {

  public static void main(String[] args) {
    DisplayGraphics_Gui d = new DisplayGraphics_Gui();
    JFrame f = new JFrame();
  }

  public void paint(Graphics grap) {
    grap.drawOval(120, 60, 30, 30);
    grap.drawOval(290, 60, 30, 30);
    
    setForeground(Color.red);

    
  }
}
