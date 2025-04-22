import java.util.*;
/**
 * Write a description of class Level3Code here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Level3Code
{
    // instance variables - replace the example below with your ow
    private String name;
    private int age;
    private final String KONTONUMMER = "12345";
    private double saldo;
    private static double anfangssaldo = 1000.00;
    private static int max;
    private static int zähler = 1;
    private int Kontonummer;
    private static final int ANSWER = 42;
    private int value = 3;
    
      /**
     * Constructor for Instanz - Zähler
     */
    public Level3Code ( ) {
        Kontonummer = Level3Code.zähler;
        Level3Code.zähler++;
    }
    
    /**
     * Constructor for Super String
     */
    
    public Level3Code (String s) {
        System.out.println (s);
    }
    
    /**
     * Return Super String
     */
    public String ReturnString (String s) {
        return s;
    }
    
        /**
     * Constructor for initializing String name and int age
     */
    public Level3Code(String name, int age)
    {
        this.name = name;
        this.age = age;
        // Constructor with String name and int age as parameters
    }

     /**
     * Cereals enum example with constructor
     */
    
    public enum Cereals1
    {
        CAPTAIN_CRUNCH(50), 
        FROOT_LOOPS(70),
        REESES_PUFFS(100),
        COCOA_PUFFS(65);
        
        final int LevelOfDeliciousness;
        
        Cereals1(int LevelOfDeliciousness){
            this.LevelOfDeliciousness = LevelOfDeliciousness;
        }
        
    }
    
    /**
     * example of returning int LevelOfDeliciousness 
     */
    public int CerealLevelOfDeliciousness()
    {
        return Cereals1.COCOA_PUFFS.LevelOfDeliciousness;
    }
    
    /**
     * example of returning an ordinal from cereal enum
     */
    public final int ordinal(){
        Cereals CAPTAIN_CRUNCH = Cereals.CAPTAIN_CRUNCH;
        Cereals FROOT_LOOPS = Cereals.FROOT_LOOPS;
        Cereals REESES_PUFFS = Cereals.REESES_PUFFS;
        Cereals COCOA_PUFFS = Cereals.COCOA_PUFFS;
        
        return COCOA_PUFFS.ordinal();
        
        // returns index according to enum name given
    }

     /**
     * switch case mit cereal Enum
     */
    public void consume(Cereals c){
        switch(c){
            case CAPTAIN_CRUNCH:
                System.out.println("CAPTAIN CRUNCH");
                break;
            case FROOT_LOOPS:
                System.out.println("FROOT LOOPS");
                break;
            case REESES_PUFFS:
                System.out.println("REESES PUFFS");
                break;
            case COCOA_PUFFS:
                System.out.println("COCOA PUFFS");
                break;
                // Cereals input = Cereals.Name of Cereal Enum
        }
    }
    
     /**
     * getter or returning cereal name
     */
    public final String name(String name){
        return name;
        // returns name of Cereal enum
    }
    
     /**
     * return value of specific cereal
     */
    public Cereals getValueOf(){
       Cereals value = Cereals.valueOf("FROOT_LOOPS");
       return value;
    }
    
    /**
     * return cereal value with array position
     */
    
    public static Cereals1 [] values ( ) {
        for (Cereals1 c1 : Cereals1.values ( ) ){
            System.out.println(c1);
    }
        return Cereals1.values ( );
    }
    
    /**
     * print out cereal value with array position
     */
    public void toStringCereals1 ( ){
        Cereals1 [] c = values ( );
        for (int i = 0; i < c.length; i ++ ) {
            System.out.println("Position" + " " + i + " : " + c[i]);
        }
    }
    
    /**
     * returning cereals according to input
     */
    
    public Cereals returnCereals(Cereals l){
        switch(l){
            case CAPTAIN_CRUNCH:
                return l.CAPTAIN_CRUNCH;
            case FROOT_LOOPS:
                return l.FROOT_LOOPS;
            case REESES_PUFFS:
                return l.REESES_PUFFS;
            case COCOA_PUFFS:
                return l.COCOA_PUFFS;
                // Cereals input = Cereals.Name of Cereal Enum
        }
        throw new IllegalStateException("Cereals unknown");
    }
    
     /**
     * String name encapsulation example
     */
    
    public String getName ( ) {
        return name;
        // getter for name
    }
    
     /**
     * int age encapsulation example
     */
    public int getAge ( ) {
        return age;
        // getter for age
    }
    
    /**
     * Method Overriding Beispiel 1 Teil 1
     */
    public String hello ( ) {
        return "Hello World";
    }
    
    /**
     * Method Overiding Beispiel 1 Teil 2
     */
    public String OverrideMethod  ( ) {
        Level3Code obj1 = new Level3Code1 ( );
        return obj1.hello( );
        // Signature from superclass and subclass must be the same
    }
    
    /**
     * Method Overiding Beispiel 2 Mit Super Teil 1
     */
    public String hi ( ) {
        return "there";
    }
    
    /**
     * Method Overiding Beispiel 2 Mit Super Teil 2
     */
    
    public String OverrideMethodWithSuper ( ) {
        Level3Code obj2 = new Level3Code1 ( );
        return obj2.hi ( );
    }
    
    /**
     * Object toString Methode Beispiel Teil 1
     */
    
    @Override
    public String toString ( ) {
        return "Konto" + KONTONUMMER + " : " + saldo;
    }

    /**
     * Object toString Methode Beispiel Teil 2
     */
    public void überweisen () {
        final String quelle = "12345";
        final String ziel = "67890";
        double QuelleAbheben = 499.99;
        double ZielEinzahlen = 600.50;
        double QuelleBetrag = anfangssaldo - QuelleAbheben;
        double ZielBetrag = anfangssaldo + ZielEinzahlen; 
        // einfache Zugriff auf static anfangssaldo
    }
    
    /**
     * Object toString Methode Beispiel Teil 3
     */
    public String ZielBetrag () {
        final String ziel = "67890";
        double ZielEinzahlen = 600.50;
        double ZielBetrag = this.anfangssaldo + ZielEinzahlen; 
        // nicht empfohlender static Zugriff auf anfangssaldo mit this
        return "Konto" + ziel + " : " + ZielBetrag;
    }
    
    /**
     * Object toString Methode Beispiel Teil 4
     */
    public String QuelleBetrag () {
        final String quelle = "12345";
        double QuelleAbheben = 499.99;
        double QuelleBetrag = Level3Code.anfangssaldo - QuelleAbheben; 
        // statischer Zugriff mit Klassenname
        return "Konto" + quelle + " : " + QuelleBetrag;
    }
    // statische lokale Variablen nicht möglich
    
    /**
     * Initialisierung statische Variablen
     */
    public int MaxValue ( ) {
        int a = 5;
        int b = 9;
        if ( a > b ) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
    
    /**
     * statische Variablen Beispiel als Instanz - Zähler
     */
    public int getKontonummer ( ) {
        return Kontonummer;
    }
    
    /**
     * statischer Zugriff innerhalb einer Klasse Methode
     */
    public static double GibZufallzahl (int min, int max) {
        return (Math.random ( ) * max ) + min;
    }
    
    /**
     * statisch einfacher Zugriff Beispiel 
     */
    public void EinfachStatischZugriff ( ) {
        double Würfel1 = GibZufallzahl (1 , 1000); 
        System.out.println (Würfel1);
    }
    
    /**
     * statischer Zugriff über Klassenname
     */
    public void ZugriffüberKlassenname1 ( ) {
        double Würfel2 = Level3Code.GibZufallzahl (1, 1000); 
        System.out.println (Würfel2);
    }
    
    /**
     * Main Methode
     */
    public static void main (String args []) {
        System.out.println("This is the main method");
    }
    
    /**
     * Beispiel für Klassenkonstante
     */
    public int getAnswer ( ) {
        return ANSWER;
    }
    
    /**
     * Method Overloading Beispiel 1 Teil 1
     */
    public void message ( ) {
        System.out.println("Hello");
    }
    
    /**
     * Method Overloading Beispiel 1 Teil 2
     */
    public void message (String name) {
        System.out.println("Hello" + " " + name);
    }
    
    /**
     * Parameter verdecken Beispiel
     */
    public int VerdeckenParameter (int value) {
        return value;
    }
    
    /**
     * default Double Array Beispiel 1 mit Länge und gibt alle Elemente zurück
     */
    public double [ ] intArrayBeispiel1 ( ) {
        double [ ] doubleArray1 = new double [6]; // specify length with new
        for (double element: doubleArray1){
            System.out.println(element);
        }
        return doubleArray1;
    }
    
    /**
     * Int Array Beispiel 2 und Länge des Arrays zurückgeben
     */
    public int intArrayBeispiel2 ( ) {
        int [ ] intArray2 = new int [6]; 
        System.out.println (intArray2.length);
        return intArray2.length;
    }
    
    /**
     * Selbst definierte Int Array Beispiel 3 und gibt alle Elemente mit For each Schleife
     */
    public int [ ] intArrayBeispiel3 ( ) {
        int [ ] intArray3 = {2, 22, 38, 19, 5, 205};
        for (int element: intArray3){
        System.out.println (element);
    }
    return intArray3;
    }
    
    /**
     * Clone int [ ] Beispiel mit Object.clone ( ) 
     */
    public int [ ] clone () {
        int [ ] intArray4 = {2, 22, 38, 19, 5, 205};
        int [ ] ClonedIntArray4 = intArray4.clone ( );
        System.out.println(Arrays.toString(ClonedIntArray4));
        return intArray4.clone ( ) ;
    }
    
    /**
     * default String Array Beispiel 1 mit Länge und gibt alle Elemente zurück
     */
    public String [ ] StringArrayBeispiel1 ( ) {
        String [ ] StringArray1 = new String [9];
        for (String element: StringArray1){
            System.out.println(element);
        }
        return StringArray1;
    }
    
    /**
     * String Array Beispiel 2 und Länge des Arrays zurückgeben
     */
    public int StringArrayBeispiel2 ( ) {
        String [ ] StringArray2 = new String [9];
        System.out.println (StringArray2.length);
        return StringArray2.length;
    }
    
    /**
     * String Array Beispiel 3 und alle Elemente zurückgeben
     */
    public String [] StringArrayBeispiel3 ( ) {
        String [ ] StringArray3 = {"Red", "Orange", "Yellow", "Green", "Light Green", 
                                  "Blue", "Purple", "Black", "White"};
        for (String element: StringArray3){
        System.out.println (element);
    }
    return StringArray3;
    }
    
    /**
     * String Array Beispiel 4 und alle Elemente zurückgeben mit For Schleifen
     */
    public void StringArrayBeispiel4 ( ) {
        String [ ] StringArray4 = {"Red", "Orange", "Yellow", "Green", "Light Green", 
                                  "Blue", "Purple", "Black", "White"};
        for (int i = 0; i < StringArray4.length; i++){
        System.out.println (StringArray4[i]);
    }
    }
    
    /**
     * Clone String [ ] Beispiel mit Arrays.copyOf ( ... ) 
     */
    public String [ ] arrayCopyOf ( ) {
        String [ ] StringArray5 = {"Red", "Orange", "Yellow", "Green", "Light Green", 
                                                           "Blue", "Purple", "Black", "White"};
        String [ ] CopyStringArray5 = Arrays.copyOf(StringArray5, StringArray5.length);
        System.out.println(Arrays.toString(CopyStringArray5));
        return CopyStringArray5;
    }
    
    /**
     * Angabe von Werten außerhalb von Zuweisungen Teil 1
     */
    
    public void f (int [ ] a){
    }
    
    /**
     * Angabe von Werten außerhalb von Zuweisungen Teil 2
     */
    public void client ( ) {
        f(new int [ ] {1, 2, 3});
    }
    
    /**
     * Zugriff auf Array Elemente
     */
    public void clientZugriff ( ) {
       int [ ] intArray4 = {2, 22, 38, 19, 5, 205};
       int answer = intArray4[4];
       System.out.println(answer);
    }
    
    /**
     * minimaler Wert finden
     */
    public int min (int [ ] values1) {
        if(values1 == null || values1.length == 0){
            throw new IllegalArgumentException ("Array can't be empty");
        }
        int minValue = Integer.MAX_VALUE;
        for (int value : values1) {
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println(minValue);
        return minValue;
    }
    
    /**
     * maximaler Wert finden
     */
    public int max (int [ ] values2) {
        if(values2 == null || values2.length == 0){
            throw new IllegalArgumentException ("Array can't be empty");
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i < values2.length; i++) {
            if (values2 [i] > maxValue) {
                maxValue = values2[i];
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }
    
    /**
     * Zuweisungen mit Arrays
     */
    public void ref1 ( ) {
        String [ ] values = {"rechts", "links"};
        String [ ] english = values;
        english [0] = "right";
        System.out.println(values[0]);
    }
    
    /**
     * Clone String [ ] Beispiel mit System.arraycopy( )
     */
    public void ref2 ( ) {
        String [ ] values = {"rechts", "links"};
        String [ ] english = new String [values.length];
        System.arraycopy(values, 0, english, 0, values.length);
        english [0] = "right";
        System.out.println(english[0]);
    }
    
        /**
     * 2D ArrayBeispiel 1
     */
    public int [][] TwoDArray1 ( ) {
        int [] [] TwoDArray = new int [2][2];
        TwoDArray[0][0] = 0;
        TwoDArray[0][1] = 1;
        TwoDArray[1][0] = 1;
        TwoDArray[1][1] = 0;
        for (int [] row : TwoDArray){
            for (int element : row){
            System.out.println (element);
    }
    }
        return TwoDArray;
    }
    
        /**
     * 2D ArrayBeispiel 2
     */
    public int [][] TwoDArray2 ( ) {
        int [] [] TwoDArray2 = new int [2][];
        for (int row = 0; row < TwoDArray2.length; row ++ ){
            TwoDArray2[row] = new int[5];
            for (int col = 0; col < TwoDArray2[row].length; col ++){
                System.out.println(TwoDArray2[row][col] + " " );
            }
        }
        return TwoDArray2;
    }
    
        /**
     * 2D Arrayerzeugen Beispiel 1
     */
    public String [][] GamesTwoDArray3 ( ) {
        String [] [] GamesTwoDArray = { {"OMSI", "Cities Skylines 2", 
                                         "Transport Fever 2", "Sim City",
                                         "SIMS", "Fortnite", "Minecraft",
                                         "League of Legends", "Call of Duty"} };
        for (String [] row: GamesTwoDArray) {
            for (String game : row){
            System.out.println(game + " ");
        }
    }
    return GamesTwoDArray;
    }
    
       /**
     * 2D Array zugreifen
     */
    public int [][] matrix ( ) {
        int[][] matrix = new int[5][5];
        for(int x = 0; x < matrix.length; x++){
            int [] spalte = matrix[x];
            for(int y = 0; y < spalte.length; y++){
                matrix[x][y] = x + y * spalte.length;
            }
        }
        return matrix;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true; 
        if(obj == null || getClass() != obj.getClass())
            return false;
            Level3Code L3C = (Level3Code) obj;
            return age == L3C.age && Objects.equals(name, L3C.name);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}