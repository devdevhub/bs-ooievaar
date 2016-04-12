import java.awt.*;
import java.applet.*;

public class dobblesteen extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
  }

  public void paint(Graphics g) {
	  g.setColor(Color.black);
	  g.fillRect(100, 100, 100, 100);
	  g.setColor(Color.white);
	  g.fillArc(120, 120, 20, 20, 20, 360);
	  g.setColor(Color.white);
	  g.fillArc(160, 120, 20, 20, 20, 360);
	  g.setColor(Color.white);
	  g.fillArc(160, 160, 20, 20, 20, 360);
	  g.setColor(Color.white);
	  g.fillArc(120, 160, 20, 20, 20, 360);
  }
  
  }
   