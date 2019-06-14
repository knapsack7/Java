import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
public class UserInputApplet extends JApplet implements ActionListener{
  private static final long serialVersionUID = 1L;
  TextField text1,text2;
  public void init(){
	  text1=new TextField(8);
	  text2=new TextField(8);
	  add(text1);
	  add(text2);
	  text1.setText("0");
	  text2.setText("0");
  }
  public void paint(Graphics g){
	  int x=0,y=0,z=0;
	  String s1,s2,s;
	  g.drawString("Enter a number in each box:",10,50);
	  try{
		  s1=text1.getText();
		  x=Integer.parseInt(s1);
		  s2=text2.getText();
		  y=Integer.parseInt(s2);
	  }
	  catch(Exception e){}
	  z=x+y;
	  s=String.valueOf(z);
	  g.drawString("THE SUM IS ",10,75);
	  g.drawString(s,100,75);
  }
  public boolean action(Event event,Object object){
	  repaint();
	  return true;
  }
  @Override
  public void actionPerformed(ActionEvent Ae) {	
  }
}
