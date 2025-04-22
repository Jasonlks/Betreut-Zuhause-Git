import java.util.*;

/**
 * Write a description of class extrahiereUnikateMethode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestingKlasse
{
    // instance variables - replace the example below with your own
    private String accountNumber;
    private float balance;

    /**
     * Constructor for objects of class extrahiereUnikateMethode
     */
    
    public TestingKlasse()
    {
    }
    
    public TestingKlasse(String accountNumber, float balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Bekommt eine Liste mit Woertern und liefert die Unikate darin,
     * also die Woerter, die nur genau einmal in der Liste vorkommen. <br>
     * Beispiel: [ "a", "b", "c", "d", "c", "b", "a" ] liefert [ "d" ] <br>
     * Beispiel: [ "a", "b", "b", "c" ] liefert [ "a", "c" ] <br>
     * Die Reihenfolge in der Ergebnisliste muss nicht gleich der Reihenfolge
     * der Unikate in der Parameterliste sein. <br>
     * Die Parameter-Liste darf nicht veraendert werden!
     * @param woerter eine Liste mit Woertern
     * @return eine Liste mit den Unikaten aus der Parameterliste
     */
    public List<String> extrahiereUnikate(List<String> wörter)
    {
        Set<String> wordSet = new TreeSet<>();
        for (String wort : wörter) {
            if (!wordSet.add(wort)) {
                // Duplicate word, already present in the set
                wordSet.remove(wort);  // Remove it to maintain uniqueness
            }
        }
        return new ArrayList<>(wordSet);
    }
    
    /**
     * Statische Test 1, White Box Test 1
     */
    public int StaticAdd(int a, int b)
    {
        if(a > 0 && b > Integer.MAX_VALUE - a){
            throw new ArithmeticException("Integer overflow.");
        } else if(a < 0 && b < Integer.MIN_VALUE - a){
            throw new ArithmeticException("Integer underflow.");
        }
        return a + b;
    }
    
    /**
     * Black Box Test with Addition
     */
    public int BlackBoxTestWithAddition(int x, int z)
    {
        return x + z;
    }
    
    /**
     * SchreibtischTest 1
     */
    public int STTFactorial(int j)
    {
        if( j < 0){
          throw new IllegalArgumentException();
        }  
        
        if(j > 1){
            j = j * STTFactorial(j - 1);
        }
        
        if(j == 0 || j == 1){
            j = 1;
        } 
        return j;
    }
    
    /**
     * Getter for accountNumber
     */
    public String getAccountNumber(){
        return accountNumber;
    }
    
    /**
     * Getter for balance
     */
    public float getBalance(){
        return balance;
    }

    public float withdrawCash(float amount){
    if (amount <= 0 && balance < amount){
        throw new IllegalArgumentException("Withdraw unsuccessful.");
    }
    
    if (amount > 0 && balance >= amount){
            balance = balance - amount;
            System.out.println("Withdraw successful. Remaining balance: " + balance);
    }
    return amount;
    }
}

