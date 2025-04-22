
/**
 * Write a description of class IntStaticAmpel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntStaticAmpel implements TrafficLightInterface
{
    // instance variables - replace the example below with your own
    protected static boolean _rotLeuchtet;
    protected static boolean _gelbLeuchtet;
    protected static boolean _gruenLeuchtet;

    /**
     * Constructor for objects of class IntStaticAmpel
     */
    public IntStaticAmpel()
    {
        _rotLeuchtet = false;
        _gelbLeuchtet = false;
        _gruenLeuchtet = true;
    }

    // Diese Klasse muss für jede Operation des Interfaces eine entsprechende Methode anbieten.
    // Der Compiler prüft die Einhaltung des Interfaces
    
    /**
     * Gibt an, ob die rote Lampe leuchtet.
     */
    public boolean leuchtetRot( )
    {
        return _rotLeuchtet;
    }
    
    /**
     * Gibt an, ob die gelbe Lampe leuchtet.
     */
    public boolean leuchtetGelb( )
    {
        return _gelbLeuchtet;
    }
    
    /**
     * Gibt an, ob die gruene Lampe leuchtet.
     */
    public boolean leuchtetGruen( )
    {
        return _gruenLeuchtet;
    }
    
    public void schalteWeiter ( ) {
        _gruenLeuchtet = _rotLeuchtet && _gelbLeuchtet;
        _rotLeuchtet = _rotLeuchtet^_gelbLeuchtet;
        _gelbLeuchtet = !_gelbLeuchtet;
        // public void schalteWeiter = dynamische Bindun
    }
    
    public boolean lampenTest (IntStaticAmpel ampel) {
            if (ampel instanceof IntStaticAmpel) {
                IntStaticAmpel ampel1 = (IntStaticAmpel) ampel; // Typcasting: Op. des dynmatischen Typs werden aufgerufen
                return true;
            }
            return false;
            // Typtests mit instanceof, wo LHS: Name der Variable, RHS: Name der Klasse
    }
}
