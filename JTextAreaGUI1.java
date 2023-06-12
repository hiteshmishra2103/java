import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JTextAreaGUI1 {

  public static void main(String[] args) {
    InputTextGUI obj = new InputTextGUI();
  }
}

class InputTextGUI extends JFrame {

  JTextArea tal;
  JLabel l;
  JButton b1;

  InputTextGUI() {
    tal = new JTextArea(5, 30);
    b1 = new JButton("Submit");
    l = new JLabel("Greetings");
    add(tal);
    add(b1);
    add(l);
    ActionListener al = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String text = tal.getText();
        l.setText(text);
      }
    };
    b1.addActionListener(al);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
