import java.applet.*;
import java.awt.Graphics;

	public class House extends Applet {

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
			 g.drawRect(50, 200, 100, 100);
			 g.drawRect(50, 260, 20, 40);
			 g.drawRect(80, 240, 20, 20);
			 g.drawRect(130, 240, 20, 20);
			 
		 }
		 
		 }