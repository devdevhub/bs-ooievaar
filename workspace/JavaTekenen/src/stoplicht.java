import java.awt.*;
import java.applet.*;

public class stoplicht extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
  }

  public void paint(Graphics g) {
	  g.setColor(Color.black);
	  g.fillRect(100, 100, 100, 300);
	  g.setColor(Color.red);
	  g.fillOval(100, 100, 100, 100);
	  g.setColor(Color.yellow);
	  g.fillOval(100, 200, 100, 100);
	  g.setColor(Color.green);
	  g.fillOval(100, 300, 100, 100);
  }
   


}
