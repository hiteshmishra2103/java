package jdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SampleClass_4h {

  class Calculator extends JFrame {

    public Calculator() {
      t1 = new JTextField(5);
      t2 = new JTextField(5);

      l = new JLabel("Result");

      b1 = new JButton("+");
      b2 = new JButton("-");
      b3 = new JButton("*");
      b4 = new JButton("/");

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
      setSize(200, 200);
      setDefaultCloseOperation(ABORT);
    }
  }
}
