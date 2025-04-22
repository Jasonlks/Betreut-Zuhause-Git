
/**
 * Write a description of class LevelCode1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Level3Code1 extends Level3Code
{
    private String SuperString;
    
    public Level3Code1 ( ) {
        super("Hello");
    }
    
    public String getSuperString ( ) {
        return SuperString;
    }

    @Override
    public String hello ( ) {
        return "Hi There";
    }
    
    @Override
    public String hi ( ) {
        return "hi" + " " + super.hi ( );
    }
    
    /**
     * statischer Zugriff über Klassenname von außen
     */
    public void ZugriffüberKlassenname2 ( ) {
        double Würfel3 = Level3Code.GibZufallzahl (1, 1000); 
        System.out.println (Würfel3);
    }
    }
