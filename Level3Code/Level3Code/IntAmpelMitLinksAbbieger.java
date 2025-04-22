
/**
 * Write a description of class IntAmpelMitLinksAbbieger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class IntAmpelMitLinksAbbieger extends IntAmpel // Abstrakte Klasse extends Superklasse
{
    // instance variables - replace the example below with your own
    protected boolean leuchtetLinksRot;
    protected boolean leuchtetLinksGruen;

    public IntAmpelMitLinksAbbieger ( ){
        TrafficLightEnum apl3 = TrafficLightEnum.RECHTSROT;
    }
    
    /**
     * Gibt an, ob beim LinksAbbiegen die rote Lampe leuchtet
     */
    public abstract void leuchtetLinksRot( ); // abstrakte Methode

    /**
     * Gibt an, ob beim LinksAbbiegen die gruene Lampe leuchtet
     */
    public boolean leuchtetLinksGruen( )
    {
        if (_rotLeuchtet == true || _gelbLeuchtet == true){
            leuchtetLinksGruen = true;
        } else   {
            leuchtetLinksGruen = false;
        }
        return leuchtetLinksGruen;
    }
    
    @Override // Override Methode Beispiel
    public  void schalteWeiter ( ) {
        _gruenLeuchtet = _rotLeuchtet && _gelbLeuchtet;
        _rotLeuchtet = _rotLeuchtet ^ _gelbLeuchtet; 
        _gelbLeuchtet = !_gelbLeuchtet;
        leuchtetLinksRot = leuchtetLinksGruen;
        leuchtetLinksGruen = leuchtetLinksRot;
    }
}
