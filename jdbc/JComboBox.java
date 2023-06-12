package jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBoxClass extends JFrame {

  JComboBox jbox;
  JButton b;
  JLabel label1;

  public JComboBoxClass() {
    //String array to store weekdays
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

    label1 = new JLabel("Choose a day from the list");

    add(jbox);
    add(b);
    add(label1);

    //Event Handler

    ActionListener al = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String data = "";
        if (jbox.getSelectedIndex() != -1) {
          data = "Day selected: " + jbox.getSelectedItem();
          label1.setText(data);
        }
      }
    };
    b.addActionListener(al);
  }
}

public class JComboBox {

  public static void main(String[] args) {
    JComboBox obj = new JComboBoxClass();
  }
}
