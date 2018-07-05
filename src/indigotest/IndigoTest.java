
package indigotest;

import java.util.Scanner;

/**
 *
 * @author francisco_saldana
 */
public class IndigoTest {

    
    public static void main(String[] args) {

        IndigoTest test = new IndigoTest();
        test.getLargestProduct();
        test.getPalindromeProduct();
        
        
        
                
        
    }
    
    public void getLargestProduct(){
        int t,k,n;
        int maxProducts[], nk[],digitsNumber[];
        String inputAux;
        Scanner input = new Scanner (System.in);
        Operations operations = new Operations();
        System.out.println("*************************************************");
        System.out.println("1. Largest product in a series");
        System.out.println("*************************************************");
        try{
            do{
                System.out.println("Introduzca T: ");
                inputAux = input.nextLine();
                t = Integer.parseInt(inputAux);
                
            }while (t < 1 || t > 100);
            
            maxProducts = new int [t];
            for(int i = 0; i < t; i++){
                
                System.out.println("Introduzca N & K: ");
                inputAux = input.nextLine();
                nk = operations.stringToNumbers(inputAux);
                n = nk[0];
                k = nk[1];
                if(n < k || n > 1000 ){
                    System.out.println(" N debe ser mayor igual a K y menor igual que 1000");
                    break;
                }
                if(k < 1 || k > 7){
                    System.out.println(" K debe ser mayor igual a 1 y menor igual que 7");
                    break;
                }
                
                System.out.println("Introduzca el numero: ");
                inputAux = input.nextLine();
                if(inputAux.length() != n){
                    System.out.println("El numero debe tener N digitos");
                    break;
                }
                else{
                    digitsNumber = operations.numberToArray(inputAux);
                
                    maxProducts[i] = operations.maxProduct(n, k, digitsNumber);
                }
                

            }
            System.out.println("-----------------------------");
            System.out.println("Salida ");
            for (int result: maxProducts){
                System.out.println(result);
            }
        
        } catch(NumberFormatException ex){
            System.out.println("*****Error: Introduzca valores numericos******* ");
            
        }
        
        
    }
    
    public void getPalindromeProduct(){
        int t,n;
        int palindromes[]; 
        
        Operations operations = new Operations();
        Scanner input = new Scanner (System.in);
        System.out.println("*************************************************");
        System.out.println("2. Largest palindrome product");
        System.out.println("*************************************************");
        do{
                System.out.println("Introduzca T: ");
                t = input.nextInt();
                
        }while (t < 1 || t > 100);
        palindromes = new int [t];
        for (int i = 0; i < t; i++) {
            System.out.println("Introduzca N: ");
            n = input.nextInt();
            if(n >= 1000000){
                System.out.println("N deber ser menor a 1000000");
                break;
                        
            }
            else{
                palindromes[i] = operations.palindromeProduct(n);
            }
            
               
        }
        System.out.println("-----------------------------");
        System.out.println("Salida ");
        for (int result: palindromes){
            System.out.println(result);
        }
        
    }
    
}
