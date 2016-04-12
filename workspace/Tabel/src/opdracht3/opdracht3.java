package opdracht3;


import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Button Fris; 
  Button Bier; 
  Button Wijn; 
  Button Koffie; 
  Button BinDist;
  Button BuitDist;
  Button gemiddelde;
  Label label;
  String tekst;
  Button eindebestelling;
  double fris;
  double bier;
  double wijn;
  double koffie;
  double bindust;
  double buitdust;
  double totaal;
  double geld;
  double dagomzet;
  double gemmidelde;
  double aantal;
  double bestellingen;
 
    public void init() {
     setSize(1920, 953);
     Bier = new Button();
     KnopListener1 kl1 = new KnopListener1();
     Bier.addActionListener(kl1);
        Bier.setLabel( "Bier € 2.25" );
        
        BinDist = new Button();
        KnopListener2 kl2 = new KnopListener2();
        BinDist.addActionListener(kl2);
        
        BinDist.setLabel("BinDist € 2.75");
        Wijn = new Button();
        KnopListener3 kl3 = new KnopListener3();
        Wijn.addActionListener(kl3);
        Wijn.setLabel( "Wijn € 2.50" );
        
        Koffie = new Button();
        KnopListener6 kl6 = new KnopListener6();
        Koffie.addActionListener(kl6);
        
        Koffie.setLabel("Koffie € 1.75");
        Fris = new Button();
        KnopListener4 kl4 = new KnopListener4();
        Fris.addActionListener(kl4);
        Fris.setLabel("Fris € 2.00");
        BuitDist = new Button();
        KnopListener5 kl5 = new KnopListener5();
        BuitDist.addActionListener(kl5);
        
        BuitDist.setLabel("BuitDist € 3.50");
        tekst = new String("");
        eindebestelling = new Button("volgende bestelling");
        KnopListener7 kl7 = new KnopListener7();
        eindebestelling.addActionListener(kl7);
        add(Fris);
        add(Bier);
        add(Wijn);
        add(Koffie);
        add(BinDist);
        add(BuitDist);
        add(eindebestelling);
       fris = 2.00;
        koffie = 1.75;
        wijn = 2.50;
        bier = 2.25;
        bindust = 2.75;
        buitdust = 3.50;
        geld = 0.00;
        dagomzet = 0.00;
        gemmidelde = 0;
        aantal= 0;
        bestellingen =0;
        
       
        
       


    }

    public void paint(Graphics g) {
     g.drawString("te betalen bedrag:"+(String.format("%.2f", Double.valueOf(geld))), 100, 160);
     g.drawString("dagomzet:"+(String.format("%.2f", Double.valueOf(dagomzet))), 100, 200);
     g.drawString("het gemiddelde van alle bestellingen:"+ (String.format("%.2f", Double.valueOf(gemmidelde))), 100, 240);
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
         geld = geld+bier;
         aantal++;
         dagomzet = dagomzet+2.25;
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
         geld = geld+bindust;
         aantal++;
         dagomzet = dagomzet+2.75;
            repaint();
        }
}
    class KnopListener3 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
         geld = geld+wijn;
         aantal++;
         dagomzet = dagomzet+2.50;
            repaint();
}
    }
    class KnopListener4 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
         geld = geld+fris;
         aantal++;
         dagomzet = dagomzet+2.00;
            repaint();
}
    }
    class KnopListener5 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
         geld = geld+buitdust;
         aantal++;
         dagomzet = dagomzet+3.50;
            repaint();
}
    }
    class KnopListener6 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
         geld = geld+koffie;
         aantal++;
         dagomzet = dagomzet+1.75;
            repaint();
}
    }
    class KnopListener7 implements ActionListener{
     public void actionPerformed(ActionEvent e){
      geld = totaal;
      gemmidelde = dagomzet/bestellingen;
      aantal = 0;
      bestellingen++;
      repaint();
        
     }
    }



}