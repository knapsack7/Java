import javax.swing.JButton;
import javax.swing.JFrame;

public class Aisehi {
	public static void main(String[] args) {
		JFrame f = new JFrame("GridLayout");
//		f.setLayout(new FlowLayout());
		f.setSize(500,500);
		int num=1;
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				JButton jb=new JButton(String.valueOf(num));
				jb.setBounds(100 * k, 100 * i, 100, 100);
				f.add(jb);
				num++;
			}
		}
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}