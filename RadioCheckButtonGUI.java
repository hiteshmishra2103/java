import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RadioCheckButtonGUI {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    RadioAndCheck obj = new RadioAndCheck();
  }
}

class RadioAndCheck extends JFrame {

  JTextField t1;
  JRadioButton r1;
  JRadioButton r2;

  JCheckBox c1;
  JCheckBox c2;
  JButton b1;
  JLabel l;

  public RadioAndCheck() {
    t1 = new JTextField(15);

    r1 = new JRadioButton("Male");
    r2 = new JRadioButton("Female");
    c1 = new JCheckBox("Dancer");
    c2 = new JCheckBox("Singer");
    b1 = new JButton("Submit");
    l = new JLabel("Greetings");
    add(t1);
    add(r1);
    add(r2);
    add(c1);
    add(c2);
    add(b1);
    add(l);
    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    ActionListener al = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        if (r1.isSelected()) {
          name = "Mr. " + name;
        }
        if (r2.isSelected()) {
          name = "Ms. " + name;
        }
        if (c1.isSelected()) {
          name = name + " is a dancer";
        }
        if (c2.isSelected()) {
          name = name + " is a singer";
        }
        l.setText(name);
      }
    };

    b1.addActionListener(al);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
