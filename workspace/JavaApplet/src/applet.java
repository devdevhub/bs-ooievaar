import java.awt.*;
import java.applet.*;

public class applet extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.drawString("Rifati", 50, 60 );
    g.setColor(Color.red);
    g.drawString("Musa Huseni", 50,70);
 }
}