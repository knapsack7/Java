import javax.swing.*;
import java.awt.event.*;

public class TextAreaDemo implements ActionListener{
	public JTextField tf1,tf2,tf3;
	public JButton b;
	public void go(){
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		b=new JButton("ALIGN");
		frame.setSize(500,500);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		JScrollPane scroll1=new JScrollPane(tf1);
		JScrollPane scroll2=new JScrollPane(tf2);
		JScrollPane scroll3=new JScrollPane(tf3);
		panel.add(scroll1);
		panel.add(scroll2);
		panel.add(scroll3);
		panel.add(b);
		b.addActionListener(this);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		TextAreaDemo tad=new TextAreaDemo();
		tad.go();
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b){
			tf1.setHorizontalAlignment(JTextField.RIGHT);
			tf2.setHorizontalAlignment(JTextField.LEFT);
			tf3.setHorizontalAlignment(JTextField.CENTER);
			}
	}
}