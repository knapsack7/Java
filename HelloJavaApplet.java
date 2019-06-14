import java.awt.Graphics;
import javax.swing.JApplet;
public class HelloJavaApplet extends JApplet{
    private static final long serialVersionUID = 1L;
    public void paint(Graphics g){
    	g.drawString("Hello Java",50,100);
    }
}
