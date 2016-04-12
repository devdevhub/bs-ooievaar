import java.awt.*;
import java.applet.*;

public class Flag extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public void init() {
}


  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.red);
    g.fillRect(20, 20, 100, 30);
    g.setColor(Color.black);
    g.drawRect(20, 50, 100, 30);
    g.setColor(Color.blue);
    g.fillRect(20, 80, 100, 30);
    g.setColor(Color.black);
    g.fillRect(120, 20, 20, 150);
 
  }}
  