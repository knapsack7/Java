import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimationSimple {
	int x = 70;
	int y = 70;

	public static void main(String[] args) {
		AnimationSimple gui = new AnimationSimple();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);

		for (int i = 0; i < 130; i++) {
			x++;
			y++;

			drawPanel.repaint();

			try {
				Thread.sleep(50);
			} catch (Exception ex) {
			}
		}
	}

	class MyDrawPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}
}