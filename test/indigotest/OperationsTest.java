
package indigotest;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author francisco_saldana
 */
public class OperationsTest {
    
  
    @Test
    public void testMaxProduct() {
        int n = 10;
        int k = 5;
        int[] digitsNumber = {3,6,7,5,3,5,6,2,9,1} ;
        Operations operacion = new Operations();
        int expResult = 3150;
        int result = operacion.maxProduct(n, k, digitsNumber);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testPalindromeProduct() {
        int n = 101110;
        Operations operacion = new Operations();
        int expResult = 101101;
        int result = operacion.palindromeProduct(n);
        assertEquals(expResult, result);
        
    }
   
    @Test
    public void testStringToNumbers() {
        String numbers = "12 34";
        Operations operacion = new Operations();
        int[] expResult = {12,34};
        int[] result = operacion.stringToNumbers(numbers);
        assertArrayEquals(expResult, result);
        
    }

    
    @Test
    public void testNumberToArray() {
        String number = "12345";
        Operations operacion = new Operations();
        int[] expResult = {1,2,3,4,5};
        int[] result = operacion.numberToArray(number);
        assertArrayEquals(expResult, result);
        
    }
    
}
