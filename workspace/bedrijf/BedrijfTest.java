

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BedrijfTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BedrijfTest
{
    private Bedrijf Argento;
    private afdeling ApplicatieOntwikkelaar;
    private afdeling Mediavormgeving;
    private Medewerkers Rifati;
    private Medewerkers Olaf;
    private afdeling HTML5;
    private Medewerkers John;

    
    
    
    
    

    
    
    
    

    
    
    
    

    /**
     * Default constructor for test class BedrijfTest
     */
    public BedrijfTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        Argento = new Bedrijf();
        ApplicatieOntwikkelaar = new afdeling("Applicatie Ontwikkelaar");
        Mediavormgeving = new afdeling("Mediavormgeving");
        Rifati = new Medewerkers("Rifati Musa Huseni", ApplicatieOntwikkelaar, "Man", 33000);
        Olaf = new Medewerkers("Olaf van de boer", Mediavormgeving, "Man", 42000);
        HTML5 = new afdeling("HTML5");
        John = new Medewerkers("John Wild", HTML5, "Man", 42000);
        Argento.voegtoe(ApplicatieOntwikkelaar);
        Argento.voegtoe(Mediavormgeving);
        Argento.voegtoe(HTML5);
        ApplicatieOntwikkelaar.print();
        Argento.print();
        Rifati.getAfdeling();
        ApplicatieOntwikkelaar.voegtoe(Rifati);
        Mediavormgeving.voegtoe(Olaf);
        HTML5.voegtoe(John);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
