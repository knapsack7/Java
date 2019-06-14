import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
public class Animation1 extends Applet implements KeyListener{
	private static final long serialVersionUID = 1L;
	Timer timer;
	int[] ball={15,15};
	int[] ball_vel={5,5};
	int ball_size=20;
	int refreshRate=100;
	int[] mouse={0,0};
	int size=200;
	int rect_left=5;
	int rect_top=5;
	int rect_right=rect_left+size;
	int rect_bottom=rect_top+size;
	int paddle_width=10;
	int paddle_height=40;
	int paddle_y=80;
	int left_gutter=rect_left+paddle_width;
	int right_gutter=rect_right-paddle_width;
	public void init(){
		setSize(300,300);
		timer=new Timer();
		addKeyListener(this);
		this.requestFocus();
		timer.schedule(new TimerTask(){
			public void run(){
				ballBounce();
				repaint();
			}
		},0,refreshRate);
	}
	public void ballBounce(){
		ball[0]=ball[0]+ball_vel[0];
		ball[1]=ball[1]+ball_vel[1];
		if(ball[0]<=left_gutter){
			if((ball[1]+ball_size/2>=paddle_y)&&(ball[1]-ball_size/2<=paddle_y+paddle_height)){
				ball_vel[0]=-ball_vel[0];
			}
			else{
				timer.cancel();
			}
		}
		if(ball[0]>=right_gutter-ball_size){
			ball_vel[0]=-ball_vel[0];
		}
		if(ball[1]>=rect_top){
			ball_vel[1]=-ball_vel[1];
		}
		if(ball[1]>=rect_bottom-ball_size){
			ball_vel[1]=-ball_vel[1];
		}
	}
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.drawRect(rect_left, rect_top, size, size);
		g.setColor(Color.MAGENTA);
		g.fillOval(ball[0], ball[1],ball_size,ball_size);
		g.setColor(Color.BLUE);
		g.drawLine(left_gutter,rect_top,left_gutter,right_gutter);
		g.drawLine(right_gutter,rect_top,right_gutter,rect_bottom);
		g.setColor(Color.GREEN);
		g.fillRect(rect_left,80,paddle_width,paddle_height);
	}
	@Override
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode()==KeyEvent.VK_W){
			if(paddle_y-5>=rect_top){
				paddle_y=paddle_y-5;
			}
		}
		if(ke.getKeyCode()==KeyEvent.VK_S){
			if(paddle_y+5<=rect_bottom-paddle_height){
				paddle_y=paddle_y+5;
			}
		}
	repaint();
	}
	@Override
	public void keyReleased(KeyEvent kr) {
		if(kr.getKeyCode()==KeyEvent.VK_W){
			if(paddle_y-5>=rect_top){
				paddle_y=paddle_y-5;
			}
		}
		if(kr.getKeyCode()==KeyEvent.VK_S){
			if(paddle_y-5<=rect_bottom-paddle_height){
				paddle_y=paddle_y+5;
			}
		}
	repaint();}
	@Override
	public void keyTyped(KeyEvent arg0) {
	}
	
}
