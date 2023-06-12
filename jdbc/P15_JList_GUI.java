package jdbc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

public class P15_JList_GUI {

  public static void main(String[] args) {
    ListGUI obj = new ListGUI();
  }
}

class ListGUI extends JFrame {

  JList list;
  JButton b;

  JLabel label1;

  public ListGUI() {
    String week[] = {
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thrusday",
      "Friday",
      "Saturday",
      "Sunday",
    };

    list = new JList<>(week);
    b = new JButton("Submit");
    label1 = new JLabel("Choose a day from the list");
    add(list);
    add(b);
    add(label1);
    ActionListener al = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String data = " ";
        if (list.getSelectedIndex() != -1) {
          data = "Day Selected: " + list.getSelectedValue();
          label1.setText(data);
        }
      }
    };
    b.addActionListener(al);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
  }
}
