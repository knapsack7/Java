import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {
	public void go() {
		JFrame frame = new JFrame("Partition of Frame");
		JButton east = new JButton("EAST");
		JButton west = new JButton("WEST");
		JButton north = new JButton("NORTH");
		JButton south = new JButton("SOUTH");
		JButton center = new JButton("CENTER");

		frame.add(BorderLayout.EAST, east);
		frame.add(BorderLayout.WEST, west);
		frame.add(BorderLayout.NORTH, north);
		frame.add(BorderLayout.SOUTH, south);
		frame.add(BorderLayout.CENTER, center);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayoutExample bl = new BorderLayoutExample();
		bl.go();
	}
}
