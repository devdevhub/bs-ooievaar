import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Show extends Applet {


public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {  
	  g.setColor(Color.blue);
    g.drawString("Rifat ", 50, 60 );
    g.setColor(Color.red);
    g.drawString("Musa Huseni", 50, 70);    
  }
}