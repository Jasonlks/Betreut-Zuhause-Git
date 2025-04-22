package TrafficLightExample;


/**
 * Write a description of class IntAmpelMitRechtsAbbieger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntAmpelMitRechtsAbbieger extends IntAmpel
{
    // instance variables - replace the example below with your own
    protected boolean leuchtetRechtsRot;
    protected boolean leuchtetRechtsGelb;
    protected boolean leuchtetRechtsGruen;

    public IntAmpelMitRechtsAbbieger ( ){
        Ampelphase apl2 = Ampelphase.RECHTSROT;
    }
    
    /**
     * Gibt an, ob beim RechtsAbbiegen die rote Lampe leuchtet
     */
    public boolean leuchtetRechtsRot( )
    {
        if(_rotLeuchtet){
            leuchtetRechtsRot = true;
        } else {
            leuchtetRechtsRot = false;
        }
        return leuchtetRechtsRot;
    }
    
    /**
     * Gibt an, ob beim RechtsAbbiegen die gelbe Lampe leuchtet
     */
    public boolean leuchtetRechtsGelb( )
    {
        if(_rotLeuchtet || _gelbLeuchtet){
            leuchtetRechtsGelb= true;
        } else {
            leuchtetRechtsGelb = false;
        }
        return leuchtetRechtsGelb;
    }
    
    /**
     * Gibt an, ob beim RechtsAbbiegen die gruene Lampe leuchtet
     */
    public boolean leuchtetRechtsGruen( )
    {
        if (_gelbLeuchtet){
            leuchtetRechtsGruen = true;
        } else   {
            leuchtetRechtsGruen = false;
        }
        return leuchtetRechtsGruen;
    }
    
    @Override
    public void schalteWeiter ( ) {
        _gruenLeuchtet = _rotLeuchtet && _gelbLeuchtet;
        _rotLeuchtet = _rotLeuchtet^_gelbLeuchtet;
        _gelbLeuchtet = !_gelbLeuchtet;
        leuchtetRechtsRot = leuchtetRechtsGelb;
        leuchtetRechtsGelb = leuchtetRechtsGruen;
        leuchtetRechtsGruen = leuchtetRechtsRot;
    }
}
