import java.util.*;
import org.junit.jupiter.api.Test;

/**
 * Write a description of class Level2Code here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level2Code
{
    // instance variables - replace the example below with your own
    public int Martikelnummer;
    public String name;
    public String city;
    public String color;
    private int speed;
    
    /**
     * Constructor for objects of class Level2Code
     */
    public Level2Code()
    {
       
    }

    /**
     * Constructor for objects of class Level2Code
     */
    public Level2Code(int Martikelnummer, String name, String city)
    {
        this.Martikelnummer = Martikelnummer;
        this.name = name;
        this.city = city;
       
    }


        /**
     * Constructor for objects of class Level2Code
     */
    public Level2Code(String color, int speed)
    {
        this.color = color;
        this.speed = speed;
       
    }
    
    /**
     * Fallunterscheidung mit if
     */
    public int Fallunterscheidung(int x, int y)
    {
        int max;
        x = 5;
        y = 10;
        if (x > y){
            max = x;
        } else {
            max = y;
        }
        return max;
    }
    
    /**
     * Wiederholung
     */
    public int Wiederholung(int x, int y)
    {
        int max;
        int count = 0;
        x = 5;
        y = 10;
        while(y > x){
            max = y;
            count ++;
            y --;
        }
        return count;
    }
    
    /**
     * Switch case
     */
    public void tageProMonat(int monat, int jahr)
    {
        int tage;
        switch (monat){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tage = 31;
                break;
            
            case 4:
            case 6:
            case 9:
            case 11:
                tage = 30;
                break;
                
            case 2:
            if(jahr % 4 == 0){
                 tage = 29; // leap year
            } else {
                tage = 28;
            }
            break;
            
        default:
            tage = -1;
            
        System.out.println("Monat" + monat + "im Jahr" + jahr
                            + "hat" + tage + "Tage.");
    }
    }
    
    /**
     * Do while Schleife
     */
    public void DoWhileSchleife()
    {
        String password = "123456";
        do {
            System.out.println("Password: ");
        }
        while (!password.equals("123456"));
        System.out.println("Access granted");
    }
    
    /**
     * For Schleife, Zählschleife mit ASCII
     */
    public int ForSchleife(int i)
    {
        for (char c = 32; c < 127; c++){
            i = c;
            System.out.print(c + ": " + Integer.toHexString(i) + "\t");
            if (i % 8 == 7){
                System.out.println();
            }
        }
        return i;
    }
    
    /**
     * While Schleife
     */
    public int WhileSchleife()
    {
        int summe = 0;
        int a = 1;
        int b = 10;
        
        while (a <= b){
            summe = summe + 1;
            a++;
        }
        return summe;
    }
    
    /**
     * Schleife mit Continue
     */
    public int SchleifeMitContinue()
    {
       int i = 0;
        while (i <= 10){
            if (i % 2 == 1){
                i++;
                continue;
                        }
        }
       i++;
       return i;
    }

    
    /**
     * Schleife ohne Continue
     */
    public int SchleifeOhneContinue()
    {
        int i = 0; 
         while (i <= 10){
            if (i % 2 == 0){
                i++;
                    }
        }
        i++;
        return i;
    }
    
    /**
     * Schleife mit break
     */
    public int SchleifeMitBreak()
    {
        int i;   
        for(i = 0; i <= 10; i++){
            while(i % 2 == 1){
                System.out.println(i);
                break;
               }
           }
           return i;
    }
    
    /**
     * Schleife ohne break
     */
    public int SchleifeOhneBreak()
    {
        int i = 0;   
        for(i = 0; i <= 10; ++i){
            while(i % 2 == 0){
                i++;
                System.out.println(i);
               }
           }
           return i;
    }
    
    /**
     * Strings
     */
    public String FirstWithString()
    {
        String s = "Hallo";
        s = new String ("Hallo");
        s += " Zusammen";
        return s;
    }

    /**
     * Strings vergleichen
     */
    
public String CompareStrings(){
    String a = "Hallo";
    String b;
    String result = "null";
    b = a;
        
    if(a == b){
        result = "This is the wrong way to compare Strings.";
     }
        
    if(a.equals(b)){
        result = "This is the correct way to compare Strings.";
        }
    return result;
    }
    
    /**
     * Strings charAt Methode
     */
    public int charAtMethode(){
        int counter = 0;
        String s = "Hello";
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'l'){
                counter ++;
            }
    }
    return counter;
 }
 
   /**
     * Strings length Methode
     */
    public int Stringlength(){
    String s = "Hello";
    return s.length();
 }
 
    /**
     * Strings subString 1
     */
    public String subStringMethode1(){
    String s = "Hello";
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == 'l'){
            s.substring(2);
        }
 }
    return s.substring(2);
}

 /**
     * Strings subString 2
     */
    public String subStringMethode2(){
    String s = "Hello";
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == 'l'){
            s.substring(2 , 5);
        }
 }
    return s.substring(2 , 5);
}

 /**
     * Strings indexOf Methode
     */
    public int indexOfMethode(){
    String s = "Hello";
    return s.indexOf('e');
}

/**
     * Strings toString Methode
     */ 
    public String toString(int Martikelnummer, String name, 
                           String city){
        return Martikelnummer + " " + name + " " + city;
}
    public String toStringMethode(int Martikelnummer, 
                                  String name, String city){
        Level2Code s1 = new Level2Code(101, "John", "Hamburg");
        return s1. toString();
}

/**
     * StringBuilder append Strings
     */
    public StringBuilder append(String s){
        s = "Hello";
        StringBuilder sb = new StringBuilder();
        System.out.println(s);
        s = "Hey There!";
        sb.append(s);
        return sb;
}

/**
     * StringBuilder append char
     */
    public StringBuilder append (char c){
        c = 'a';
        StringBuilder SB = new StringBuilder();
        System.out.println(c);
        c = 'T';
        SB.append(c);
        return SB;
}

/**
     * Rekursionbeispiel 1: Fakultätberechnung
     */
    public int FakultätRekusivBerechnung (int p){
        if (p != 0){
            p = p * FakultätRekusivBerechnung(p - 1);
        } else {
            p = 1;
        }
        return p;
}

/**
     * Rekursionbeispiel 2: FakultätberechnungMitForSchleife
     */
    public int FakultätRekusivBerechnungMitFor (int n){
        int result = 1;
        for(int i = 0; i <= n; i++){
            result *= i;
        }
        return result;
}

/**
    * Rekursionbeispiel 3: Substring und charAt
    */
    public boolean suche(String s, char c){
        s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(s.length() == 0 || s == null){
            return false;
        } else if (s.charAt(0) == c){
            return true;
        }
        String rest = s.substring(1);
        return suche (rest, c);
    }

 /**
     * Rekursionbeispiel 4: Zeichen in String doppelt 
     * vorkommen
     */
    public boolean doppelte(String s){
    if ("".equals(s)){
            return true;
    } 
    char anfang = s.charAt(0);
    String rest = s.substring(1);
    int i = rest.indexOf(anfang);
    if (i < 0){
        return false;
    }
    rest = rest.substring(0, i) + rest.substring(i + 1); 
    // entfernen doppelten Character aus Rest
    return doppelte (rest);
    }   
    
    /**
     * Stackbeispiel
     */
     public void bar (Level2Code l){
         int i = 42;
         i = l.foo(i);
     }
    public int foo(int p){
         int x = 1;
         return x + p;
    }
     
     /**
     * Class Scopes
     */
    public void drive (boolean fourWheel){
     
    }  
    public String toString(){
        return "This is a" + " " + color + " " + "car driving at" 
                + " " + speed + "kph.";
    }
    
    /**
     * Method Scopes
     */
    public String driveAgain (boolean fourWheel){
         String tires = "wide";
         return tires;
    }  
    public String paint(String newColor, String oldColor){
        return newColor;
    }

    /**
     * Block Scopes
     */
    public int changeTires(){
        int numTires = 4;
        int changedTires = 0;
        for(int i = 0; i < numTires; i++){
            changedTires += 1;
        }
        return changedTires;
    }
    
    /**
     * For Schleife Scopes
     */
    
    public int FakultätMitForSchleife(){
        int sum = 0;
        int fact = 1;
        int sufa;
        for (int i = 0; i <= 10; i++){
            sum += i;
            fact *= i;
        }
        sufa = sum + fact;
        return sufa;
    }
    
    /**
     * Try catch ArrayIndexOutOfBounceException
     */
    
    public void TCArrayOutOfBounceException(){
        try {
            String[] pets = {"dogs", "cats", "hamster", "goldfish"};
            System.out.println(pets[4]);
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException AIOBE) {
            System.out.println("ArrayIndexOutOfBounce occured");
        }
    }
    
    /**
     * Try catch IllegalArgumentException
     */
    
    public void TCIllegalArgumentException(){
        int age = 0;
        age = 0;
        try {
            if (age <= 0) {
                age = age - 1;
                throw new IllegalArgumentException();
            }
        } catch (Throwable IllegalArgumentException) {
            System.out.println("This is an invalid age");
        }
    }
    
    /**
     * Try catch IllegalStateException
     */
    
    public void TCIllegalStateException(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        try {
            Iterator<String> it = list.iterator();
            it.remove();
            throw new IllegalStateException();
        } catch (Throwable IllegalStateException) {
            System.out.println("IllegalStateException occured");
        }
    }
    
     /**
     * Try catch IndexOutOfBounceException
     */
    
    public void TCIndexOutOfBounceException(){
        try {
            ArrayList<String> list = new ArrayList<>();
            list.get(0);
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException IOOBE) {
            System.out.println("IndexOutOfBounce occured");
        }
    }
    
    /**
     * Try catch NullPointerException
     */
    public void TCNullPointerException(){
        try {
            String s = null;
            int sz = s.length();
            System.out.println(sz);
            throw new NullPointerException();
        } catch (NullPointerException NPE) {
            System.out.println("NullPointerException occured");
        }
    }
    
    /**
     * Try catch OutOfMoemoryError
     */
    public void OutOfMoemoryError(){
        try {
            List<String> list1 = new ArrayList<>();
            Integer[] array = new Integer[1000 * 1000 * 1000];
            throw new OutOfMemoryError();
        } catch (OutOfMemoryError OOME) {
            System.out.println("OutOfMemoryError occured");
        }
    }
    
    /**
     * Try catch StackOverflowError
     */
    
    private static void SayHi(){
        SayHi();
    }   
    public void TCStackOverflowError(){
        try {
            SayHi();
            System.out.println("Hi");
            throw new StackOverflowError();
        } catch(StackOverflowError SOE){
            SOE.printStackTrace();
            System.out.println("StackOverflowError occured");
    }
    }
    
    /**
     * Finally Block with Try Catch
     */
    
    public void TCFinallyBlock(){
    try{
        int i = 5;
    } catch (Throwable IllegalArgumentException){
            System.out.println("float numbers cannot be converted to int");
        }
    finally{
            System.out.println("You finally understood Exceptions and Error Handling in Java.");
    }
    }
}
