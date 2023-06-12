import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		AddNumbers obj =new AddNumbers();
	}

}
class AddNumbers extends JFrame{
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JLabel l;
	JButton b;
	public AddNumbers() {
		t1= new JTextField(20);
		
		t2=new JTextField(20);
		l=new JLabel("Result");
		b=new JButton("OK");
		t3=new JTextField(20);
		add(t1);
		add(t2);
		add(b);
		add(l);
		add(t3);
		ActionListener al=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				
				Integer sum=num1+num2;
				//We can't make the sum as int as we need to pass the string in the set text section so we are using integer wrapper class and hence we get the tostring functionality 
				t3.setText(sum.toString());
				
			}
		};
		b.addActionListener(al);//When b button(OK) is clicked then the Action Listener will be initiated
		setLayout(new FlowLayout());//It will set all the contents of the layout in a sequential manner or else it will require manual interference to make the output more convenient
		setVisible(true);//This will show your GUI if set true or else it will not show your gui screen
		setSize(600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// This will close the system when the gui is being exit or else if we don't use this then even after cutting the gui system the application will still will be open
	}
}
