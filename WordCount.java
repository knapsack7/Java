import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WordCount extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JLabel lb1, lb2;
	JTextArea ta;
	JButton b;
	JButton pad, text;

	WordCount() {
		super("Char Word Count Tool - JTP");
		lb1 = new JLabel("Characters: ");
		lb1.setBounds(50, 50, 100, 20);
		lb2 = new JLabel("Words: ");
		lb2.setBounds(50, 80, 100, 20);

		ta = new JTextArea();
		ta.setBounds(50, 110, 300, 200);

		b = new JButton("click");
		b.setBounds(50, 320, 80, 30);
		b.addActionListener(this);

		pad = new JButton("Pad Color");
		pad.setBounds(140, 320, 110, 30);
		pad.addActionListener(this);

		text = new JButton("Text Color");
		text.setBounds(260, 320, 110, 30);
		text.addActionListener(this);

		add(lb1);
		add(lb2);
		add(ta);
		add(b);
		add(pad);
		add(text);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			String text = ta.getText();
			int ch=0;
			String words[] = text.split("\\s");
			for(String i:words)
				ch += i.length();
			lb1.setText("Characters: " +ch );
			lb2.setText("Words: " + words.length);
		} else if (e.getSource() == pad) {
			Color c = JColorChooser.showDialog(this, "Choose Color",
					Color.BLACK);
			ta.setBackground(c);
		} else if (e.getSource() == text) {
			Color c = JColorChooser.showDialog(this, "Choose Color",
					Color.BLACK);
			ta.setForeground(c);
		}
	}

	public static void main(String[] args) {
		new WordCount();
	}
}