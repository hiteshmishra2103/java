import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseMotionListener extends MouseMotionAdapter {

  Frame f;

  MouseMotionListener() {
    f = new Frame("Mouse Motion Adapter");
    // Register frame with some listener
    f.addMouseMotionListener(this);
    f.setSize(300, 700);
    f.setLayout(null);
    f.setVisible(true);
    f.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          f.dispose();
        }
      }
    );
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    Graphics g = f.getGraphics();
    g.setColor(Color.RED);
    g.fillRect(e.getX(), e.getY(), 3, 2);
  }

  public static void main(String[] args) {
    new MouseMotionListener();
  }
}
