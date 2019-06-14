import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
class MyDrawPanel extends JPanel{
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
    	//g.setColor(Color.blue);
    	//g.fillRect(20,50,100,100);
    	//g2d.rotate(2.3);
    	//Image image=new ImageIcon("sud.jpg").getImage();
    	//g.drawImage(image,50,100,this);
    }
	public static void main(String[] args){
	MyDrawPanel mypanel=new MyDrawPanel();
	JFrame frame = new JFrame("Frame Sample");
	frame.add(mypanel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setVisible(true);
    }
}