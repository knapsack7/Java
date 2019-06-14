import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GettingIPAddress {
	static JTextField tf;
	static JLabel l;
	static JButton b;

	public static void gui() {
		JFrame frame = new JFrame();
		tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		l = new JLabel();
		l.setBounds(50, 100, 350, 20);
		b = new JButton("Find IP");
		b.setBounds(50, 150, 95, 30);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				try {
					String host = tf.getText();
					String ip = java.net.InetAddress.getByName(host).getHostAddress();
					l.setText("IP of " + host + " is:\n " + ip);
				} catch (Exception ex) {
					System.out.println(ex);
				}

			}
		});
		frame.add(b);
		frame.add(tf);
		frame.add(l);
		frame.setSize(800, 800);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is: " + ip);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		gui();
	}
}