package TrafficLightExample;


/**
 * Write a description of class IntAmpelMitLinksAbbieger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class IntAmpelMitLinksAbbieger extends IntAmpel
{
    // instance variables - replace the example below with your own
    protected boolean leuchtetLinksRot;
    protected boolean leuchtetLinksGruen;

    public IntAmpelMitLinksAbbieger ( ){
        Ampelphase apl3 = Ampelphase.LINKSROT;
    }
    
    /**
     * Gibt an, ob beim RechtsAbbiegen die rote Lampe leuchtet
     */
    public abstract void leuchtetLinksRot( ); // abstrakte Methode
    
    /**
     * Gibt an, ob die gruene Lampe leuchtet.
     */
    public boolean leuchtetLinksGruen( )
    {
        if (_gelbLeuchtet){
            leuchtetLinksGruen = true;
        } else   {
            leuchtetLinksGruen = false;
        }
        return leuchtetLinksGruen;
    }
    
    @Override
    public void schalteWeiter ( ) {
        _gruenLeuchtet = _rotLeuchtet && _gelbLeuchtet;
        _rotLeuchtet = _rotLeuchtet^_gelbLeuchtet;
        _gelbLeuchtet = !_gelbLeuchtet;
        leuchtetLinksRot = leuchtetLinksGruen;
        leuchtetLinksGruen = leuchtetLinksRot;
    }
}
