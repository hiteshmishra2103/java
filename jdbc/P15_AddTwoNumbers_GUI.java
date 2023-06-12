package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P15_AddTwoNumbers_GUI{

  public static void main(String[] args) {
    AddNumbers obj = new AddNumbers();
  }
}

class AddNumbers extends JFrame {

  JTextField t1;
  JTextField t2;
  JLabel l;
  JButton b;

  public AddNumbers() {
    t1 = new JTextField(5);
    t2 = new JTextField(5);
    l = new JLabel("Result");
    b = new JButton("+");
    add(t1);
    add(t2);
    add(b);
    add(l);
    ActionListener al = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        Integer result = num1 + num2;

        l.setText("=" + result.toString());
      }
    };

    b.addActionListener(al);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
  }
}
