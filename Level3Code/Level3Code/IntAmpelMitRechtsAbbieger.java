
/**
 * Write a description of class IntAmpelMitRechtsAbbieger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntAmpelMitRechtsAbbieger extends IntStaticAmpel // Subklasse vererbt Superklasse
{
    // instance variables - replace the example below with your own
    protected static boolean leuchtetRechtsRot; // statisches Feld
    protected static boolean leuchtetRechtsGruen; 

    public IntAmpelMitRechtsAbbieger ( ){
        TrafficLightEnum apl2 = TrafficLightEnum.RECHTSROT;
    }
    
    /**
     * Gibt an, ob beim RechtsAbbiegen die rote Lampe leuchtet
     */
    public static boolean leuchtetRechtsRot( ) // statische Methode
    {
        if(_rotLeuchtet == true){
            leuchtetRechtsRot = true;
        } else {
            leuchtetRechtsRot = false;
        }
        return leuchtetRechtsRot;
    }
    
    /**
     * Gibt an, ob beim RechtsAbbiegen die gruene Lampe leuchtet
     */
    public static boolean leuchtetRechtsGruen( )
    {
        if (_rotLeuchtet == true || _gelbLeuchtet == true){
            leuchtetRechtsGruen = true;
        } else   {
            leuchtetRechtsGruen = false;
        }
        return leuchtetRechtsGruen;
    }
    
    @Override // Override Methode Beispiel
    public  void schalteWeiter ( ) {
        _gruenLeuchtet = _rotLeuchtet && _gelbLeuchtet;
        _rotLeuchtet = _rotLeuchtet ^ _gelbLeuchtet; 
        _gelbLeuchtet = !_gelbLeuchtet;
        leuchtetRechtsRot = leuchtetRechtsGruen;
        leuchtetRechtsGruen = leuchtetRechtsRot;
    }
}