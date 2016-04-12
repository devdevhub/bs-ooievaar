   import java.util.*;
public class afdeling{
   //Twee teamleden
   private ArrayList<Medewerkers> lijst;
   private String naam;
   
   
   //Constructor
   public afdeling(String naam) {
        lijst = new ArrayList<Medewerkers>();
        this.naam = naam;
        
    }
    
   public void voegtoe( Medewerkers lid){
      lijst.add( lid ); 
    }
    
    public void print() {
        int totaal = 0;
        
      System.out.println( "Medewerkers:" );
      for(Medewerkers lid : lijst ) {
          System.out.println( "Naam: "+lid.getNaam() );
          System.out.println( "Afdeling: "+lid.getAfdeling() );
          System.out.println( "Geslacht: "+lid.getgeslacht() );
          System.out.println( "salaris : "+ lid.getsalaris() );
          totaal += lid.getsalaris();
        }
       
        System.out.println( "totaal salaris : "+ totaal );
        System.out.println("-------------------------------");
    }
    
    public String getNaam() {
        return naam;
    }
     public String toString()  {
     return naam + ",";
     
    }
    public ArrayList<Medewerkers> getMedewerkers() {
        return lijst;
    }
}
        
        
