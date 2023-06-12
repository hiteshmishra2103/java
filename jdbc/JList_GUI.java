package jdbc;

import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



class ListGUI JFrame{
    JFrame list;
    JButton b;
    JLabel label1;

    ListGUI(){
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

          list=new JList<>(week);
          b=new JButton("Submit");
          label1 = new JLabel("Choose a day from the list");

    add(jbox);
    add(b);
    add(label1);

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
setLayout(new FlowLayout());
setVisible(true);
setSize(400,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class JList_GUI {
public static void main(String[] args) {
    ListGUI obj=new ListGUI();
}
}
