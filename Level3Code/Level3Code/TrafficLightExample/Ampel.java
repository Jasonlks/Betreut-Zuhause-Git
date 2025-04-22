package TrafficLightExample;


/**
 * Write a description of class Ampel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ampel
{
    // instance variables - replace the example below with your own
    private boolean _rotLeuchtet;
    private boolean _gelbLeuchtet;
    private boolean _gruenLeuchtet;
    private boolean _leuchtetRechtsRot;
    private boolean _leuchtetRechtsGelb;
    private boolean _leuchtetRechtsGruen;
    private boolean _leuchtetLinksRot;
    private boolean _leuchtetLinksGelb;
    private boolean _leuchtetLinksGruen;

    /**
     * Initialisiert eine neue Ampel auf die erste Phase (grün).
     */
    public Ampel()
    {
        _gruenLeuchtet = true;
        _leuchtetRechtsRot = true;
    }
    
    /**
     * Gibt an, ob die rote Lampe leuchtet.
     */
    public boolean leuchtetRot()
    {
        // unnötig kompliziert gelöst
        if (_rotLeuchtet == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Gibt an, ob die gelbe Lampe leuchtet.
     */
    public boolean leuchtetGelb()
    {
        // immer noch recht kompliziert
        if (_gelbLeuchtet)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Gibt an, ob die grüne Lampe leuchtet.
     */
    public boolean leuchtetGruen()
    {
        // keine unnötige Fallunterscheidung
        return _gruenLeuchtet;
    }
    
    /**
     * Schaltet die Ampel in die nächste Phase (grün -> gelb -> rot -> rot/gelb -> grün).
     */
    public void schalteWeiter()
    {
        if (_gruenLeuchtet)
        {
            _gelbLeuchtet = true;
            _gruenLeuchtet = false;
        }else if (_gelbLeuchtet && !_rotLeuchtet) 
        {
            _gelbLeuchtet = false;
            _rotLeuchtet = true;
        }else if (_rotLeuchtet && !_gelbLeuchtet){
            _gelbLeuchtet = true;
        }else {
            _rotLeuchtet = false;
            _gelbLeuchtet = false;
            _gruenLeuchtet = true;
        }
    }
    
    public boolean equals(Object obj, Object obj1){
        obj = obj1;
        if(obj.equals(obj1)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean lampenTest (Ampel ampel) {
            if (ampel instanceof Ampel) {
                return true;
            }
            return false;
    }
}