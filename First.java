import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class First extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JTextArea text;
	public void go(){
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton button=new JButton("click Me");
	    button.addActionListener(this);
	    text=new JTextArea(10,20);
		text.setLineWrap(true);
		
		JScrollPane scroller=new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
 	
		panel.add(scroller);
		
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.CENTER,button);
		
		frame.setSize(350,300);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		First f=new First();
		f.go();
	}
	public void actionPerformed(ActionEvent arg0) {
		text.append("Button CLicked \n");		
	}
}