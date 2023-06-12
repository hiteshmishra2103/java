package jdbc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.CookieStore;

public class Mouse_Motion_listener extends MouseMotionAdapter {

  @Override
  public void mouseDragged(MouseEvent e) {
    Graphics g = f.getGraphics();
    g.setColor(Color.red);
    g.fillRect(e.getX(), e.getY(), 10, 10);
    f.repaint();
  }
}
