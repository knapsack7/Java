import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
class RandomColorCircle extends JPanel{
    private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g){
    	Graphics2D g2d=(Graphics2D) g;
    	int red=(int)(Math.random()*255);
    	int green=(int)(Math.random()*255);
    	int blue=(int)(Math.random()*255);
    	Color startColor=new Color(red,green,blue);
    	
    	red=(int)(Math.random()*255);
    	green=(int)(Math.random()*255);
    	blue=(int)(Math.random()*255);
    	Color endColor=new Color(red,green,blue);
    	
    	GradientPaint gradient=new GradientPaint(70,70,startColor,150,150,endColor);
    	g2d.setPaint(gradient);
    	g2d.fillOval(70, 70, 100, 100);
    }
	public static void main(String[] args){
	RandomColorCircle mypanel=new RandomColorCircle();
	JFrame frame = new JFrame("Frame Sample");
	frame.add(mypanel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setVisible(true);
    }
}