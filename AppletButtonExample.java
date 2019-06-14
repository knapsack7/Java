import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AppletButtonExample extends Applet implements ActionListener{
  private static final long serialVersionUID = 1L;
  int a,b;
  TextField userInputA;
  TextField userInputB;
  Button submit;
  public void init(){
	userInputA=new TextField("Enter 1st number",25);
	userInputB=new TextField("Enter 2nd number",25);
	submit=new Button("Submit");
	add(userInputA);
	add(userInputB);
	add(submit);
	submit.addActionListener(this);
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
