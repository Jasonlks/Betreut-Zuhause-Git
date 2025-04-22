import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class extrahiereUnikateMethodeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestKlasse
{
    
    /**
     * Default constructor for test class extrahiereUnikateMethodeTest
     */
    public TestKlasse()
    {
    }

    
    /**
     * Positive Tests extrahiereUnikate
     */
    @Test
    public void PositiveTestExtrahiereUnikate(){
        // Test case 1
        TestingKlasse extractor = new TestingKlasse();
        List<String> example1 = List.of("a", "b", "c", "d", "c", "b", "a");
        List<String> result1 = extractor.extrahiereUnikate(example1);
        assertEquals(List.of("d"), result1);
        System.out.println(result1);

        // Test case 2
        List<String> example2 = List.of("a", "b", "b", "c");
        List<String> result2 = extractor.extrahiereUnikate(example2);
        assertEquals(List.of("a", "c"), result2);
        System.out.println(result2);
        
        // Test case 3
        List<String> example3 = List.of("a", "b", "b", "a");
        List<String> result3 = extractor.extrahiereUnikate(example3);
        assertEquals(List.of(), result3);
        System.out.println(result3);
    }
    
       /**
     * Negative Tests extrahiereUnikate
     */
    @Test
    public void NegativeTestExtrahiereUnikate(){
        // Test case 1
        TestingKlasse extractor = new TestingKlasse();
        List<String> example4 = List.of("a", "b", "c", "d", "c", "b", "a");
        List<String> result4 = extractor.extrahiereUnikate(example4);
        assertNotEquals(List.of(), result4);
        System.out.println(result4);

        // Test case 2
        List<String> example5 = List.of("a", "b", "b", "c");
        List<String> result5 = extractor.extrahiereUnikate(example5);
        assertNotEquals(List.of("b"), result5);
        System.out.println(result5);
        
        // Test case 3
        List<String> example6 = List.of("a", "b", "b", "a");
        List<String> result6 = extractor.extrahiereUnikate(example6);
        assertNotEquals(List.of("a", "b"), result6);
        System.out.println(result6);
    }
    
     /**
     * Positive Statische Test, White Box Test
     */
    @Test
    public void PositiveNormaleAddTest(){
        TestingKlasse Calculator = new TestingKlasse();
        int result7 = Calculator.StaticAdd(2, 3);
        assertEquals(5, result7);
        System.out.println(result7);
    }
    
     /**
     * Negative Statische Test, White Box Test
     */
    @Test
    public void NegativeNormaleAddTest(){
        TestingKlasse Calculator = new TestingKlasse();
        int result8 = Calculator.StaticAdd(2, 3);
        assertNotEquals(-2, result8);
        System.out.println(result8);
    }
    
    /**
     * Overflow Statische Test 1a, White Box Test 1a
     */
    @Test
    public void OverflowAddTest(){
        TestingKlasse OverflowAddCalculator = new TestingKlasse();
        try{
            OverflowAddCalculator.StaticAdd(Integer.MAX_VALUE, 1);
            throw new ArithmeticException();
        } catch(ArithmeticException AE1){
            assertEquals("Integer overflow.", AE1.getMessage());
        }
    }
    
    /**
     * AssertThrows Overflow Statische Test 1b, White Box Test 1b
     */
    @Test
    public void AssertThrowsOverflowAddTest(){
        TestingKlasse OverflowAddCalculator = new TestingKlasse();
        assertThrows(ArithmeticException.class, () -> {
            OverflowAddCalculator.StaticAdd(Integer.MAX_VALUE,1);
            throw new ArithmeticException("Integer overflow.");
        });
    }
    
    /**
     * Underflow Statische Test 2a, White Box Test 2a
     */
    @Test
    public void UnderflowAddTest(){
        TestingKlasse UnderflowAddCalculator = new TestingKlasse();
        try{
            UnderflowAddCalculator.StaticAdd(Integer.MIN_VALUE, -1);
            throw new ArithmeticException();
        } catch(ArithmeticException AE2){
            assertEquals("Integer underflow.", AE2.getMessage());
        }
    }
    
    /**
     * AssertThrows Underflow Statische Test 2b, White Box Test 2b
     */
    @Test
    public void AssertThrowsUnderflowAddTest(){
        TestingKlasse UnderflowAddCalculator = new TestingKlasse();
        assertThrows(ArithmeticException.class, () -> {
            UnderflowAddCalculator.StaticAdd(Integer.MIN_VALUE,-1);
            throw new ArithmeticException("Integer underflow.");
        });
    }
    
    /**
     * Positive Black Box Test 1a: 2 Positive Zahlen
     */
    @Test
    public void PositiveBlackBoxAddTest1(){
        TestingKlasse BlackBoxCalculator = new TestingKlasse();
        int result9 = BlackBoxCalculator.BlackBoxTestWithAddition(1, 10);
        assertEquals(11, result9);
        System.out.println(result9);
    }
    
    /**
     * Negative Black Box Test 1b: 2 Positive Zahlen
     */
    @Test
    public void NegativeBlackBoxAddTest1(){
        TestingKlasse BlackBoxCalculator = new TestingKlasse();
        int result10 = BlackBoxCalculator.BlackBoxTestWithAddition(1, 10);
        assertNotEquals(0, result10);
        System.out.println(result10);
    }
    
    /**
     * Positive Black Box Test 2a: 2 Negative Zahlen
     */
    @Test
    public void PositiveBlackBoxAddTest2(){
        TestingKlasse BlackBoxCalculator = new TestingKlasse();
        int result11 = BlackBoxCalculator.BlackBoxTestWithAddition(-50,-100);
        assertEquals(-150, result11);
        System.out.println(result11);
    }
    
    /**
     * Negative Black Box Test 2b: 2 Negative Zahlen
     */
    @Test
    public void NegativeBlackBoxAddTest2(){
        TestingKlasse BlackBoxCalculator = new TestingKlasse();
        int result12 = BlackBoxCalculator.BlackBoxTestWithAddition(-50,-100);
        assertNotEquals(150, result12);
        System.out.println(result12);
    }
    
    /**
     * Black Box Test 3: links: negative, rechts: positive
     */
    @Test
    public void BlackBoxAddTest3(){
        TestingKlasse BlackBoxCalculator = new TestingKlasse();
        int result13 = BlackBoxCalculator.BlackBoxTestWithAddition(-50,5);
        assertEquals(-45, result13);
        System.out.println(result13);
    }
    
    /**
     * Black Box Test 4: links: positive, rechts: negative
     */
    @Test
    public void BlackBoxAddTest4(){
        TestingKlasse BlackBoxCalculator = new TestingKlasse();
        int result14 = BlackBoxCalculator.BlackBoxTestWithAddition(50,-100);
        assertEquals(-50, result14);
        System.out.println(result14);
    }
    
    /**
     * Positive SchreibTischTest 1a: Factorial 5
     */
    @Test
    public void PositiveSTTFactorial5(){
        TestingKlasse Fac5Calculator = new TestingKlasse();
        int result15 = Fac5Calculator.STTFactorial(5);
        assertEquals(120, result15);
        System.out.println(result15);
    }
    
    /**
     * Negative SchreibTischTest 1b: Factorial 5
     */
    @Test
    public void NegativeSTTFactorial5(){
        TestingKlasse Fac5Calculator = new TestingKlasse();
        int result16 = Fac5Calculator.STTFactorial(5);
        assertNotEquals(12, result16);
        System.out.println(result16);
    }
    
    /**
     * Positive SchreibTischTest 2a: Factorial 1
     */
    @Test
    public void PositiveSTTFactorial1(){
        TestingKlasse Fac1Calculator = new TestingKlasse();
        int result17 = Fac1Calculator.STTFactorial(1);
        assertEquals(1, result17);
        System.out.println(result17);
    }
    
    /**
     * Negative SchreibTischTest 2b: Factorial 1
     */
    @Test
    public void NegativeSTTFactorial1(){
        TestingKlasse Fac1Calculator = new TestingKlasse();
        int result18 = Fac1Calculator.STTFactorial(1);
        assertNotEquals(0, result18);
        System.out.println(result18);
    }
    
    /**
     * SchreibTischTest (STT) 3: Factorial 0
     */
    @Test
    public void STTFactorial0(){
        TestingKlasse Fac0Calculator = new TestingKlasse();
        int result19 = Fac0Calculator.STTFactorial(0);
        assertEquals(1, result19);
        System.out.println(result19);
    }
    
    /**
     * SchreibTischTest (STT) 4a: Negative Factorial Number With Try Catch (TC)
     */
    @Test
    public void TCSTTFactorialNegativeNumbers(){
        TestingKlasse FacNegCalculator = new TestingKlasse();
        try{
            FacNegCalculator.STTFactorial(-5);
            throw new IllegalArgumentException();
        } catch (Throwable IllegalArgumentException){
            System.out.println("You can not do Factorial to negative numbers.");
        }
    }
    
    /**
     * SchreibTischTest 4b: Negative Factorial Number With AssertThrows
     */
    @Test
    public void AssertThrowsSTTFactorialNegativeNumbers(){
        TestingKlasse FacNegCalculator = new TestingKlasse();
        assertThrows(IllegalArgumentException.class, () ->{
            FacNegCalculator.STTFactorial(-5);
            throw new IllegalArgumentException("You can not do Factorial to negative numbers.");
            });
        }
        
    /**
     * RegressionTest 1: Amount withdraw cash successfully
     */
    @Test
    public void WithdrawCashSuccessfully(){
        TestingKlasse AmountWithdrawn = new TestingKlasse("12345", (float) 500.00);
        float result20 = AmountWithdrawn.withdrawCash((float)300.00);
        assertEquals((float)300.00, result20, 0.1);
        System.out.println(result20);
        // 0.1 = max. cash one can take out is 500 - 0.1 = 499.99
    }
    
    /**
     * RegressionTest 2a: Amount withdraw cash unsuccessfully with Try Catch
     */
    @Test
    public void TCWithdrawCashUnsuccessfully(){
        TestingKlasse AmountWithdrawn = new TestingKlasse("12345", (float) 500.00);
        try{
        float result1 = AmountWithdrawn.withdrawCash((float) 1000.00);
        throw new IllegalArgumentException();
    } catch (Throwable IllegalArgumentException){
        System.out.println("Cash withdraw unsuccessful.");
    }
    }
    
    /**
     * RegressionTest 2b: Amount withdraw cash unsuccessfully with assertThrows
     * US = unsuccessful
     */
    @Test
    public void AssertThrowsWithdrawCashUnsuccessfully(){
        TestingKlasse AmountWithdrawnUS = new TestingKlasse("12345", (float) 500.00);
        assertThrows(IllegalArgumentException.class, () ->{
            AmountWithdrawnUS.withdrawCash((float) 1000.00);
            throw new IllegalArgumentException("Cash withdraw unsuccessful.");
        });
    }
    }
    

