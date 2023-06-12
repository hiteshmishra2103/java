package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class JScrolBar {

  public static void main(String[] args) {
    JScrollBar_GUI obj = new JScrollBar_GUI();
  }
}

class JScrollBar_GUI extends JFrame {

  JScrollBar js;

  JScrollBar_GUI() {
    js = new JScrollBar();
    add(js);

    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 10000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
