import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBox {

  public static void main(String[] args) {
    JComboBoxClass obj = new JComboBoxClass();
  }
}

class JComboBoxClass extends JFrame {

  JComboBox jbox;
  JButton b;
  JLabel Label1;

  public JComboBoxClass() {
    String week[] = {
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
      "Sunday",
    };
    jbox = new JComboBox<>(week);
    b = new JButton("Submit");
    Label1 = new JLabel("Choose a day from the list");
    add(jbox);
    add(b);
    add(Label1);

    //Event Handler
    ActionListener al = new ActionListener() {
      //Event Handling
      public void actionPerformed(ActionEvent e) {
        String data = "";
        if (jbox.getSelectedIndex() != -1) {
          data = "Day Selected: " + jbox.getSelectedItem();
          Label1.setText(data);
        }
      }
    };
    b.addActionListener(al);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
