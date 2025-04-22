import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

/**
 * Write a description of class Excpetions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Excpetions
{
    // instance variables - replace the example below with your own
    private static int count;
    
    /**
     * Constructor for objects of class Excpetions
     */
    public Excpetions()
    {
        // initialise instance variables
        
    }

    public int NullPointerException(){
        String s = null;
        int i = s.length();
        return i;
    }
    
    public int IllegalArgumentException(int age){
        if(age < 0){
            throw new IllegalArgumentException();
        } else {
            return age;
        }
    }
    
    public String IllegalStateException(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nirnay");
        list.add("Anu");
        list.add("Swara");
        list.add("Pavan");
        
        ListIterator<String> it = list.listIterator();
        it.remove();
        return list.get(0);
    }
    
    public int ArrayIndexOutOfBounceException(){
        int[] array = {1, 2, 3};
        int value = array[9];
        return value;
    }
    
    public int ArithmeticException(){
        int result = 10 / 0;
        return result;
    }
    
    public static void main(String args[]){
        sayHi();
    }
    
    public static void sayHi(){
        System.out.println(count);
        count++;
        sayHi();
    }

    public void OutOfMemoryError(){
       Object[] objects = new Object[2000];
       for(int i = 0; i < objects.length; i++){
           objects[i] = new Object[100000000];
       }
}
}
