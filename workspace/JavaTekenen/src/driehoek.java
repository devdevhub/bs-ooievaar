import java.applet.*;
import java.awt.Graphics;

	public class driehoek extends Applet {

	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public void init() {
	}
		 public void paint(Graphics g) {
	
			 int[] xPoints = {100,50,150};
			 int[] yPoints = {100,200,200};
			 g.drawPolygon(xPoints, yPoints, 3);
		 }
}
