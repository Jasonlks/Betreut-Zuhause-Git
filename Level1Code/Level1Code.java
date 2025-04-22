
/**
 * Write a description of class Level1Code here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level1Code
{
    // instance variables - replace the example below with your own

    private int saldo;
    private String name;
    
    /**
     * constructor for objects of class Level1Code
     */
    public Level1Code (int anfangssaldo)
    {
        saldo = anfangssaldo;
    }

    /**
     * class definition, veränderte Methode
     */
    // 
    public void einzahlen (int betrag)
    {
        saldo = saldo + betrag;
        System.out.println(saldo);
    }

    /**
     * Objekte erzeugen
     */
    public Level1Code eroffneKonto (){
        Level1Code konto;
        konto = new Level1Code(0);
        return konto;
    }
    
    /**
     * Funktion, If Else Statement, Blöcke
     */
    public int MaxValue (int a, int b){
        a = 5;
        b = 10;
        int max;
        if(a > b){
            max = a;
        } else {
            max = b;
        }
        return max;
    }
    
    /**
     * private Hilfsmethode
     */
    public int abheben (int saldo, int abhebensaldo){
        int neuerSaldo;
        if (saldo < abhebensaldo){
            return 0;
        } else {
            neuerSaldo = saldo - abhebensaldo;
        }
        saldo = neuerSaldo;
        return saldo;
    }
    
    /**
     * formale Parameter und Argumente
     */
    public String holeKonto (String iban){
        iban = "123456";
        return iban;
    }
    
    /**
     * lokale Variablen
     */
    public double DreieckArea (double a, double b, double c){
        double s;
        s = (a + b + c);
        
        double fSquare;
        fSquare = s * (s - a) * (s - b) * (s - c);
        
        double f;
        f = Math.sqrt(fSquare);
        
        return f;
    }
    
    /**
     * sondierende Methode
     */
    
    public int gibSaldo(){
        return saldo;
    }
    
    /**
     * Getter
     */
    public String getName(){
        return name;
    }
    
    /**
     * Setter, Referenztyp (String)
     */
    public void setName(String name){
        this.name = name;
        System.out.println(this.name);
    }
    
    /**
     * Typkompatibilität
     */
    public int antwort(){
        int antwort;
        antwort = 52;
        return antwort;
    }
    
    /**
     * Zuweisung
     */
    public boolean Zuweisung(boolean a, boolean b){
        a = false;
        b = true;
        
        if(a = b){
            return true;
        }
        return false;
    }
    
    /**
     * Ausdrücke
     */
    public boolean Ausdruck(boolean a, boolean b){
        a = false;
        b = true;
        
        if( a == b){
            return true;
        }
        return false;
    }
    
    public int Ausdruck(int c, int d){
        int e;
        c = 9;
        d = 15;
        
        e = c *= d;
        return e;
    }
    
    public String Ausdruck(String a){
        a = "Hello";
        a += "World!";
        return a;
    }
    
    /**
     * einige primitive Typen
     */
    public short Division(){
        short a = 20 / 6;
        return a;
    }
    
    public byte Modulo(){
        byte t = 20 % 6;
        return t;
    }
    
    public float DivisionMitNachKommazahlen(){
        float z = (float) 20 / 6;
        return z;
    }
    
    /**
     * boolesche Algebra
     */
    public boolean UndOperation(){
        boolean hungrig = true;
        boolean durstig = false;
        
        if(hungrig && durstig){
            return true;
        }
        return false;
    }

    public boolean OderOperation(){
        boolean hungrig = true;
        boolean durstig = false;
        
        if(hungrig || durstig){
            return true;
        }
        return false;
    }
    
     public boolean XOROperation(){
        boolean hungrig = true;
        boolean durstig = false;
        
        if(hungrig ^ durstig){
            return true;
        }
        return false;
    }
    
     public boolean DMR1(){
        boolean hungrig = true;
        boolean durstig = false;
        // !h && !d
        if(!(hungrig || durstig)){ 
            return true;
        }
        return false;
    }
    
        public boolean DMR2(){
        boolean hungrig = true;
        boolean durstig = false;
        // !h || !d
        if(!(hungrig && durstig)){
            return true;
        }
        return false;
    }
    
    /**
     * einige automatische Typumwandlungen
     * byte > short / char > int > long 
     * float > double
     */
    
    public double autoTypumwandlung(){
        double d = 5;
        return d;
    }
    
    public int automatischeTypumwandlung(){
        int i = 'a';
        return i;
    }
    
    public double autoTyp(){
        double d = 3 + '4' + 3.1415f;
        return d;
    }
    
    /**
     * einige explizite Typumwandlungen
     * long > float
     * double > float
     * long > int > char / short > byte
     */
    
    public int explTypumwandlung(){
        double q = 5;
        int i = (int) q;
        return i;
    }
    
    public byte expliziteTypumwandlung(){
        float f = 5.25f;
        byte b = (byte) f;
        return b;
    }
    
    public float explTyp(){
        double d = 3 + '4' + 3.1415f;
        float f = (float) d;
        return f;
    }
    
    /**
     * Bitweise Operationen
     */
    public void BitOrAndXor(){
        short s = 3 | 5;
        short t = 3 & 5;
        short o = 3 ^ 5;
        System.out.println (s);
        System.out.println (t);
        System.out.println (o);
    }
    
    public byte AriLeftShift(){
        byte b = 2 << 4;
        return b;
    }
    
    public byte AriRightShift(){
        byte p = 64 >> 2;
        return p;
    }
    
    public int LogRightShift(){
        int p = -42 >>> 53;
        return p;
    }
    
    public int EinerKompl(){
        int i = ~ 0;
        return i;
    }
    
    /**
     * Unicode
     */
    public void Unicode(){
        char c1 = 65;
        char c2 = 'A';
        char c3 = '\u0041';
        char c4 = 'B' - 1;
        System.out.println (c1);
        System.out.println (c2);
        System.out.println (c3);
        System.out.println (c4);
    }
    
    /**
     * Klassen für Typen
     */
    public Level1Code (){
        int tag;
        int monat;
        int jahr;
        Level1Code datum;
    }
    
    /**
     * Endlossschleifen
     */
    public void Endlossschleifen(int a){
        a = 5;
        if(true || a < 0 || false && a < 0){
            System.out.println("Das ist eine Endlosschleife");
        }
        
        }
    }
