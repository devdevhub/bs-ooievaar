import java.awt.*;
import java.applet.*;

public class elips extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.blue); 
    g.setColor(Color.yellow);
    g.fillArc(20, 20, 100, 50, 90, 135);
  }
}