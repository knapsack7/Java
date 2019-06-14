import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
public class ButtonDemo extends Applet implements ActionListener{
   private static final long serialVersionUID = 1L;
   Button yes;
   Button no;
   Button maybe;
   String msg="";
   public void init(){
	   yes=new Button("Yes");
	   no=new Button("No");
	   maybe=new Button("MayBe");
	   add(yes);
	   add(no);
	   add(maybe);
	   yes.addActionListener(this);
	   no.addActionListener(this);
	   maybe.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
   String str=e.getActionCommand();
   if(str.equals("Yes"))
	   msg="You Pressed YES Key";
   else if(str.equals("No"))
	   msg="You Pressed NO Key";
   else
	   msg="You Pressed Undefined Key";
   repaint();
   }
   public void paint(Graphics g){
	   Image image=new ImageIcon("2016021047.jpg").getImage();
	   g.drawImage(image,75,75,125,75,75,125,125,125,this);
	   g.drawString(msg,20,200);
   }
}
