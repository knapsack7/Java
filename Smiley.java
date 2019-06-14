import java.awt.*;
import java.applet.*;
/*<applet code = "Smiley.class" width = "300" height = "300">
</applet>*/

public class Smiley extends Applet{
    private static final long serialVersionUID = 1L;

		public void paint(Graphics g){
               
                Font f = new Font("Helvetica", Font.BOLD,30);
                g.setFont(f);
                g.drawString("Keep Smiling!!!", 50, 30);
                g.drawOval(60, 60, 200, 200);
                g.fillOval(90, 120, 50, 20);
                g.fillOval(190, 120, 50, 20);
                g.fillOval(155,180,20,20);
                g.drawLine(165, 125, 165, 175);
                g.drawArc(110, 130, 95, 95, 0, -180);
        }
}