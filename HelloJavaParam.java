import java.awt.Graphics;
import javax.swing.JApplet;
public class HelloJavaParam extends JApplet{
   private static final long serialVersionUID = 1L;
   String str;
   public void init(){
	   str=getParameter("string");
	   if(str==null)
		   str=" Java";
	   str="Hello"+str;
   }
  public void paint(Graphics g){
	  g.drawString(str, 10, 100);
  }
}
