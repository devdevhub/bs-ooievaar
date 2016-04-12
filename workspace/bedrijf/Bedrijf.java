
/**
 * Write a description of class Bedrijf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

   import java.util.*;
   
 public class Bedrijf{
     private ArrayList<afdeling> lijst;
     
     public Bedrijf() {
     lijst = new ArrayList<afdeling>();
    }
    
    public void voegtoe( afdeling lid ) {
     lijst.add(lid);
    }
    public void print() {
        
        int totaal = 0;
        
        System.out.println( "Afdelingen:" );
        for(afdeling afdeling : lijst ) {
            System.out.println( "Afdeling: "+afdeling.toString() );
                
            }
            
            System.out.println("-------------------------------");
        
        
        for(afdeling afdeling : lijst ) {
        int afdelingtotaal = 0;
            System.out.println( "Afdeling: "+afdeling.toString() );
            for( Medewerkers medewerkers : afdeling.getMedewerkers()){
                System.out.println( "Medewerkers: "+medewerkers.toString() );
          totaal += medewerkers.getsalaris();
          afdelingtotaal += medewerkers.getsalaris();
                
            }
            System.out.println( "totaal salaris : "+ afdelingtotaal );
            System.out.println("-------------------------------");
        }
            System.out.println( "totaal salaris : "+ totaal );
    }
    
    
     public void printmedewerkers() {
        int totaal = 0;
        
      System.out.println( "Medewerkers:" );
      for(afdeling afdeling : lijst ) {
          for( Medewerkers lid : afdeling.getMedewerkers()){
              System.out.println( "Naam: "+lid.getNaam() );
              System.out.println( "Afdeling: "+lid.getAfdeling() );
              System.out.println( "Geslacht: "+lid.getgeslacht() );
              System.out.println( "salaris : "+ lid.getsalaris() );
              totaal += lid.getsalaris();
            }
        }
       
        System.out.println( "totaal salaris : "+ totaal );
        System.out.println("-------------------------------");
    }

}
        