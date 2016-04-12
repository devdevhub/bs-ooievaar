
public class Medewerkers
{
   //attributen
    private String naam;
    private afdeling afdeling;
    private String geslacht;
    private double salaris;
   
   //constructor
   
    public Medewerkers(String naam, afdeling afdeling, String geslacht, double salaris) {
      this.naam = naam;
      this.afdeling = afdeling;
      this.geslacht = geslacht;
      this.salaris = salaris;
      
    }
    //methoden
    public String getNaam() {
        return naam;
    }
    public void setNaam( String naam ) {
      this.naam = naam;   
    }
    public String getAfdeling() {
        return afdeling.toString();
    }
    public void setAfdeling( afdeling afdeling ) {
      this.afdeling = afdeling;  
    }
    public String getgeslacht() {
        return geslacht;
    }
    public void setgeslacht( String geslacht ) {
      this.geslacht = geslacht;  
    }
    public double getsalaris() {
        return salaris;
    }
    public void setsalaris( double salaris ) {
      this.salaris = salaris;  
    }
    public String toString()  {
     return naam + ", " +  afdeling +", " + geslacht +", "+ salaris +", ";
     
    }
       
}
