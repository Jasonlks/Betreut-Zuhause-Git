
/**
 * Write a description of class IntAmpel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntAmpel implements TrafficLightInterface
{
    // instance variables - replace the example below with your own
    protected  boolean _rotLeuchtet;
    protected  boolean _gelbLeuchtet;
    protected  boolean _gruenLeuchtet;

    /**
     * Constructor for objects of class IntAmpel
     */
    public IntAmpel()
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
    
    public boolean lampenTest (IntAmpel ampel) {
        if (ampel instanceof IntAmpel) {
            IntAmpel ampel1 = (IntAmpel) ampel; 
            // Typcasting: Op. des dynmatischen Typs aufrufen
            return true;
            }
        return false;
        // Typtests mit instanceof, 
         // wo LHS: Name der Variable, RHS: Name der Klasse
    }
}
