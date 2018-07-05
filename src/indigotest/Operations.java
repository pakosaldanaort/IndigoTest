
package indigotest;

import java.util.Scanner;

/**
 *
 * @author francisco_saldana
 */
public class Operations {
    
  
    
    public int maxProduct( int n, int k, int[] digitsNumber){
        int max = 0,acumulator;     
        for (int i = 0; i + k <=n; i++) {
            acumulator = 1;
            for (int j = 0; j < k; j++) {

                acumulator *= digitsNumber[i + j];

            }
            max = Math.max(max, acumulator);



        }
        return max;
    }
    
    public int palindromeProduct(int n){
        int max,mult,aux,multReverse=0;
        max = 0;
        for (int i = 100; i < 1000; i++) {
            
            for (int j = 100; j < 1000; j++) {
                mult = i * j;
                multReverse = 0;
                if(mult < n ){
                    aux = mult;
                    
                    while(aux != 0)
                    {
                        multReverse = multReverse * 10;
                        multReverse = multReverse + aux%10;
                        aux = aux/10;
                    }
                    
                    
                    if(mult == multReverse ){
                        max = Math.max(max,multReverse);

                    }
                }  
            }   
        }
        return max;
    }
    
    
    
    public int[] stringToNumbers(String numbers){
        String number[] = numbers.split(" ");
        int finalNumbers[] = new int [2];
        finalNumbers[0] = Integer.parseInt(number[0]);
        finalNumbers[1] = Integer.parseInt(number[1]);
        return finalNumbers;
    }
    
    public int[] numberToArray(String number){
        int digits[] = new int [number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] =  number.charAt(i) - '0';
            
        }
        return digits;
    }
    
    
    
    
}
