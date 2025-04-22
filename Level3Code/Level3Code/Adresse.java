
/**
 * Write a description of class Adresse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adresse
{
    // instance variables - replace the example below with your own
    public String Straße;
    public String Ort;
    
    public Adresse ( ) {
        
    }
    
    public void umziehen (String neueStraße, String neuerOrt) {
        Straße = neueStraße;
        Ort = neuerOrt;
        System.out.println(neueStraße);
        System.out.println(neuerOrt);
        // Objekt kann geändert werden
    }
}
