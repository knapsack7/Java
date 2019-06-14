import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ClickMeButton extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	Button button1,button2,button3;
	String str="";
	public void init() {
		button1 = new Button("Button 1");
		add(button1);
		button1.addActionListener(this);

		button2 = new Button("Button 2");
		add(button2);
		button2.addActionListener(this);
		
		button3 = new Button("Button 3");
		add(button3);
		button3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		str="";
		if (e.getSource() == button1) 
			str+="Button 1 was pressed";
		else if(e.getSource() == button2)
			str+="Button 2 was pressed";
		else
			str+="Button 3 was pressed";
		repaint();
    }
	public void paint(Graphics g){
		g.drawString(str, 250,250);
	}

}