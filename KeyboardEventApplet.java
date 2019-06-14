import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEventApplet extends Applet implements KeyListener {
	private static final long serialVersionUID = 1L;
	char ch;
	String str = "";

	public void init() {
		addKeyListener(this);
		requestFocus();
	}

	public void keyTyped(KeyEvent kt) {
		ch = kt.getKeyChar();
		str += String.valueOf(ch);
		repaint();
	}

	public void keyReleased(KeyEvent kr) {
		showStatus("Key on the keyboard is released");
	}

	public void keyPressed(KeyEvent kp) {
		showStatus("Key on the keyboard is pressed");
	}

	Font f1 = new Font("Courier New", Font.BOLD, 20);

	public void paint(Graphics g) {
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("This Applet Sense the up/down motion of keys...", 20, 120);
		g.drawString(str + " is Pressed ", 20, 100);
	}
}
