package TrafficLightExample;


/**
 * Write a description of class IntAmpel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class IntAmpel implements AmpelInterface
{
    // instance variables - replace the example below with your own
    protected boolean _rotLeuchtet;
    protected boolean _gelbLeuchtet;
    protected boolean _gruenLeuchtet;
    
    public IntAmpel ( ) 
    {
        _rotLeuchtet = false;
        _gelbLeuchtet = false;
        _gruenLeuchtet = true;
    }
    
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
    }
    
    public boolean lampenTest (IntAmpel ampel) {
            if (ampel instanceof IntAmpel) {
                return true;
            }
            return false;
    }
}
