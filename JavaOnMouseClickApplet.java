import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;
public class JavaOnMouseClickApplet extends JApplet implements MouseListener,MouseMotionListener{
  private static final long serialVersionUID = 1L;
  int x,y; 
  public void init(){
	  addMouseListener(this);
  }
  public void paint(Graphics g){
	  g.drawString("Java at "+x+" "+y,x,y);
  }
  public void mouseClicked(MouseEvent me){
	x=me.getX();
	y=me.getY();
	repaint();
  }
  public void mousePressed(MouseEvent me){}
  public void mouseReleased(MouseEvent mr){}
  public void mouseEntered(MouseEvent mr){}
  public void mouseExited(MouseEvent mr){}
  public void mouseDragged(MouseEvent mr){}
  public void mouseMoved(MouseEvent mr){}
}
