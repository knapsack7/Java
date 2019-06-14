import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JAppletButtonExample extends JApplet implements ActionListener{
  private static final long serialVersionUID = 1L;
  int a,b;
  JLabel label;
  JTextField userInputA;
  JTextField userInputB;
  JButton submit;
  public void init(){
	label=new JLabel("THIS IS WONDERFUL");
	userInputA=new JTextField(5);
	userInputB=new JTextField(5);
	submit=new JButton("Submit");
	this.add(label);
	this.add(userInputA);
	this.add(userInputB);
	this.add(submit);
	submit.addActionListener(this);
	this.setLayout(new FlowLayout());
  }
  public void paint(Graphics g){
	  g.drawString("a = "+a+" b = "+b,100,80);
	  g.drawString("sum is :"+sum(a,b),100,100);
  }
  public void actionPerformed(ActionEvent ae){
	  a=Integer.parseInt(userInputA.getText());
	  b=Integer.parseInt(userInputB.getText());
	  repaint();
  }
  public int sum(int x,int y){
	  return x+y;
  }
}
