package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P15_Task01_Calculator_GUI {

  public static void main(String[] args) {
    Calculator obj = new Calculator();
  }
}

class Calculator extends JFrame {

  JTextField t1;
  JTextField t2;
  JLabel l;
  JButton b1, b2, b3, b4;

  public Calculator() {
    t1 = new JTextField(5);
    t2 = new JTextField(5);

    l = new JLabel("Result");

    b1 = new JButton("+");
    b2 = new JButton("-");
    b3 = new JButton("*");
    b4 = new JButton("//");

    add(t1);
    add(t2);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(l);

    ActionListener al = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        Integer result;

        if (e.getSource() == b1) {
          result = num1 + num2;
          l.setText(result.toString());
        }
        if (e.getSource() == b2) {
          result = num1 - num2;
          l.setText(result.toString());
        }

        if (e.getSource() == b3) {
          result = num1 * num2;
          l.setText(result.toString());
        }

        if (e.getSource() == b4) {
          result = num1 / num2;
          l.setText(result.toString());
        }
      }
    };
    b1.addActionListener(al);
    b2.addActionListener(al);
    b3.addActionListener(al);
    b4.addActionListener(al);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
  }
}
