package TrafficLightExample;

/**
 * Eine Bmpel besteht aus drei Lampen in den Farben rot, gelb und grün.
 * Sie durchläuft periodisch vier Phasen: grün, gelb, rot, rot/gelb.
 * In den ersten drei Phasen leuchtet also nur jeweils eine Lampe,
 * während in der vierten Phase zwei Lampen gleichzeitig leuchten.
 * Der Zustand der einzelnen Lampen kann abgefragt werden,
 * und die Ampel kann in die nächste Phase geschaltet werden.
 * Die Schaltung geschieht explizit durch einen Methodenaufruf
 * (und nicht etwa durch einen automatischen Timer).
 * 
 * @author Fredrik Winkler
 * @version 2022
 */
class Bmpel
{
    private int _phase;

    /**
     * Initialisiert eine neue Bmpel auf die erste Phase (grün).
     */
    public Bmpel()
    {
        _phase = 0;
    }

    /**
     * Schaltet die Bmpel in die nächste Phase (gruen (0) -> gelb (1) -> rot (2)-> rot/gelb (3) -> gruen (0)).
     */
    public void schalteWeiter()
    {
        _phase = (_phase + 1) % 4;
    }
    
    /**
     * Gibt an, ob die rote Lampe leuchtet.
     */
    public boolean leuchtetRot()
    {
        // Todo: hier das richtige Ergebnis liefern
        return _phase==2 || _phase==3;
    }
    
    /**
     * Gibt an, ob die gelbe Lampe leuchtet.
     */
    public boolean leuchtetGelb()
    {
        // Todo: hier das richtige Ergebnis liefern
        return _phase==1 || _phase==3;
    }
    
    /**
     * Gibt an, ob die grüne Lampe leuchtet.
     */
    public boolean leuchtetGruen()
    {
        return _phase == 0;
    }
    
    public boolean lampenTest (Bmpel ampel) {
            if (ampel instanceof Bmpel) {
                return true;
            }
            return false;
    }
}
