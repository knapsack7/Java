import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class CircleCHangingColor implements ActionListener{
    JFrame frame;
    public static void main(String[] args){
      CircleCHangingColor gui=new CircleCHangingColor();
      gui.go();
	}
    public void go(){
       frame=new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
       JButton button=new JButton("Change colors");
       button.addActionListener(this);
    	
       MyDraw drawPanel=new MyDraw();
      
       frame.getContentPane().add(BorderLayout.SOUTH,button);
       frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
       
       frame.setSize(300,300);
       frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
    	frame.repaint();
    }
}
class MyDraw extends JPanel{
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
}

