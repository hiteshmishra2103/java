import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DisplayGraphicsGUI extends Canvas {

  public static void main(String[] args) {
    DisplayGraphicsGUI o = new DisplayGraphicsGUI();
    JFrame f = new JFrame();
    f.add(o);
    f.setSize(500, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void paint(Graphics grap) {
    // grap.drawOval(25, 140, 40, 70);
    // grap.drawLine(10, 20, 100, 200);
    setForeground(Color.RED);
    grap.fillOval(110, 70, 40, 40);
    grap.fillOval(290, 70, 40, 40);
    grap.fillOval(170, 70, 30, 30);
    grap.fillOval(240, 70, 30, 30);
    // grap.drawArc(100, 20, 140, 150, 180, 60);
    grap.drawArc(195, 100, 50, 50, 0, -180);
    grap.drawRect(150, 40, 140, 120);
  }
}
