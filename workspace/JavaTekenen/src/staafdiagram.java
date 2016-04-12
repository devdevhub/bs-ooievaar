
	import java.awt.*;
	import java.applet.*;

	public class staafdiagram extends Applet {

	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public void init() {
	  }

	  public void paint(Graphics g) {
		  g.fillRect(120, 20, 5, 100);
		  g.drawLine(120, 120, 270, 120);
		  g.setColor(Color.red);
		    g.fillRect(140, 80, 20, 40);
		    g.setColor(Color.blue);
		    g.fillRect(170, 40, 20, 80);
		    g.setColor(Color.green);
		    g.fillRect(200, 20, 20, 100);
		 
	  }
	  
	}

