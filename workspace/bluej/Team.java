
/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public class Team{
   //Twee teamleden
   private String naam;
   private Leerling lid1;
   private Leerling lid2;
   private int score;
   
   //Constructor
   public Team(String naam, Leerling lid1, Leerling lid2) {
        this.naam = naam;
        this.lid1 = lid1;
        this.lid2 = lid2;
        score = 0;
    }
    
    
    public void print() {
      System.out.println("Indeling van \""+naam+"\":");
      System.out.println(  lid1.toString() );
      System.out.println(  lid2.toString() );
      System.out.println( "------------"  );
    }
     public int getScore() {
        return score;
    }
    
    public int setScore(int score) {
    	this.score = score;
    	return score;
    }
    
    public int addScore() {
        score++;
        return score;
    }
}
       
       
       