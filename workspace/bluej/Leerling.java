
/**
 * Write a description of class Leerling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leerling
{
   //attributen
    private String naam;
    private String klas;
    private String geslacht;
    private int nummer;
    private Datum geboortedatum;
   //constructor
   
    public Leerling(String naam, String klas, String geslacht, int nummer, Datum geboortedatum) {
      this.naam = naam;
      this.klas = klas;
      this.geslacht = geslacht;
      this.nummer = nummer;
      this.geboortedatum = geboortedatum;
    }
    //methoden
    public String getNaam() {
        return naam;
    }
    public void setNaam( String naam ) {
      this.naam = naam;   
    }
    public String getKlas() {
        return klas;
    }
    public void setKlas( String klas ) {
      this.klas = klas;  
    }
    public String getgeslacht() {
        return geslacht;
    }
    public void setgeslacht( String geslacht ) {
      this.geslacht = geslacht;  
    }
    public int getnummer() {
        return salaris;
    }
    public void setnummer( int nummer ) {
      this.nummer = nummer;  
    }
    public String toString()  {
     return naam + ", " +  klas + geslacht +", "+nummer +", ";
     
    }
       
}
