import  java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
public class JList_GUI {
	public static void main(String []args) {
		JListGUI obj=new JListGUI();
	}
}
class JListGUI extends JFrame{
	JList list;
	JButton b;
	JLabel Label1;
	public JListGUI(){
		String week[]= {
				"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
		};
		list =new JList(week);
		b= new JButton("Submit");
		Label1=new JLabel("Choose a day from the list");
		add(list);
		add(b);
		add(Label1);
		
		//Event Handler
		ActionListener al=new ActionListener() {
			//Event Handling
			public void actionPerformed(ActionEvent e) { 
				String data="";
				if(list.getSelectedIndex()!=-1) {
					data="Day Selected: " + list.getSelectedValue();
					Label1.setText(data);;
					
				}
			}
		};
		b.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
