import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
public class Mouse_Events extends JApplet implements MouseListener,MouseMotionListener{
  private static final long serialVersionUID = 1L;
    int x,y;
    String event;
    public void init(){
	addMouseListener(this);
	addMouseMotionListener(this);
    }
    public void paint(Graphics e){
    	e.drawString("Mouse is "+event+" at "+x+","+y,x,y);
    	e.fillOval(x, y, 20, 20);
    }
    public void update(Graphics g){
    	paint(g);
    }
    public void mousePressed(MouseEvent mp){
    	x=mp.getX();y=mp.getY();
    	event="Pressed";
    	repaint();
    }
    public void mouseReleased(MouseEvent mr){
	x=mr.getX();y=mr.getY();
	event="Released";
	repaint();
    }
    public void mouseClicked(MouseEvent mc){
	x=mc.getX();y=mc.getY();
	event="Released";
	repaint();
    }
    public void mouseEntered(MouseEvent me){
	showStatus("Mouse Entered Applet Area");
    }
    public void mouseExited(MouseEvent me){
	showStatus("Mouse Exited Applet Area");
    }
    public void mouseDragged(MouseEvent md){
	x=md.getX();y=md.getY();
	event="Dragging";
	repaint();
    }
    public void mouseMoved(MouseEvent mm){
	x=mm.getX();y=mm.getY();
	event="Moving";
	repaint();
    }
}
