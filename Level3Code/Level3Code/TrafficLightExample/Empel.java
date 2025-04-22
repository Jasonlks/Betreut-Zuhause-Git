package TrafficLightExample;


/**
 * Write a description of class Empel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Empel
{
    // instance variables - replace the example below with your own

    private Ampelphase apl;
    
    public Empel ( ) 
    {
        apl = Ampelphase.GRUEN;
    }
    
    /**
     * Gibt an, ob die rote Lampe leuchtet.
     */
    public boolean leuchtetRot( )
    {
        return apl == Ampelphase.ROT || apl == Ampelphase.ROT_GELB;
    }
    
    /**
     * Gibt an, ob die gelbe Lampe leuchtet.
     */
    public boolean leuchtetGelb( )
    {
        return apl == Ampelphase.GELB || apl == Ampelphase.ROT_GELB;
    }
    
    /**
     * Gibt an, ob die gruene Lampe leuchtet.
     */
    public boolean leuchtetGruen( )
    {
        return apl == Ampelphase.GRUEN;
    }
    
    public void schalteWeiter ( ) {
        if (apl == Ampelphase.GRUEN)
        {
            apl = Ampelphase.GELB;
        }else if (apl == Ampelphase.GELB) 
        {
            apl = Ampelphase.ROT;
        }else if (apl == Ampelphase.ROT){
            apl = Ampelphase.ROT_GELB;
        } else if (apl == Ampelphase.ROT_GELB){
            apl = Ampelphase.GRUEN;
    }
    }

    public boolean lampenTest (Empel ampel) {
            if (ampel instanceof Empel) {
                return true;
            }
            return false;
    }
    
}
