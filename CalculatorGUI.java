import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorGUI {

  public static void main(String[] args) {
    Calculator obj = new Calculator();
  }
}

class Calculator extends JFrame {

  JTextField t1;
  JTextField t2;
  JTextField t3;
  JLabel l;
  JButton b;
  JButton c;
  JButton d;
  JButton f;

  public Calculator() {
    t1 = new JTextField(20);

    t2 = new JTextField(20);
    l = new JLabel("Result");
    b = new JButton("+");
    c = new JButton("-");
    d = new JButton("*");
    f = new JButton("\\");
    t3 = new JTextField(20);
    add(t1);
    add(t2);
    add(b);
    add(c);
    add(d);
    add(f);
    add(l);
    add(t3);
    ActionListener al = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        if (e.getSource() == b) {
            Integer sum = null;
          sum = num1 + num2;
        } else if (e.getSource() == c) {
          sum = num1 - num2;
        } else if (e.getSource() == d) {
          sum = num1 * num2;
        } else if (e.getSource() == f) {
          sum = num1 / num2;
        }
        t3.setText(sum.toString());
      }
    };
    c.addActionListener(al);
    d.addActionListener(al);
    f.addActionListener(al);
    b.addActionListener(al);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
