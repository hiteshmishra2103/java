import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorGUI2 {
  public static void main(String[] args) {
    Calculator obj = new Calculator();
  }
}

class Calculator extends JFrame {

  JTextField t1;
  JTextField t2;
  JTextField t3;
  JButton b1;
  JButton b2;
  JButton b3;
  JButton b4;
  JLabel l;

  public Calculator() {
    t1 = new JTextField(20);
    t2 = new JTextField(20);
    t3 = new JTextField(20);
    l = new JLabel("Result");
    b1 = new JButton("+");
    b2 = new JButton("-");
    b3 = new JButton("*");
    b4 = new JButton("/");
    add(t1);
    add(t2);
    add(l);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(t3);
    ActionListener al = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        Integer sum = null;
        if (e.getSource() == b1) {
          sum = num1 + num2;
        } else if (e.getSource() == b2) {
          sum = num1 - num2;
        } else if (e.getSource() == b3) {
          sum = num1 * num2;
        } else if (e.getSource() == b4) {
          sum = num1 / num2;
        }
        t3.setText(sum.toString());
      }
    };
    b1.addActionListener(al);
    b2.addActionListener(al);
    b3.addActionListener(al);
    b4.addActionListener(al);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 500);
  }
}
