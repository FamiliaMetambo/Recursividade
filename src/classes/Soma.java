/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Mr. UAMBA
 * @author Mr. Jose Fumo
 * @author Mr. Moises Matsinhe
 * 
 */


public class Soma {
    
/*metodo para obter a soma de um numero*/
    public static int soma(int numero) {
     if(numero == 0)
         return 0;
     else
         System.out.println(numero);
         return (numero +soma(numero-1));
    }
    
    /*metodo para obter a factorial de um numero*/
     public static int factorial(int numero) {
     if(numero == 0)
         return 1;
     else
         System.out.println(numero);
         return (numero *factorial(numero-1));
    }
    
     
      /*metodo para obter a fibonacci de um numero*/
     public static int fibonacci(int numero) {
         //if((numero > 0){
        // throw.NumberFormatException(" o numero nao deve ser negativo");
     if(numero ==0 || numero == 1)
         return 1;
     
     
         System.out.println(numero);
         return (fibonacci(numero-1) *fibonacci(numero-2));
    
     }
    /* programa principal ou teste*/
    public static void main(String[] args) {
       // System.out.println(soma(10));
        //System.out.println(factorial(10));
        System.out.println(fibonacci(5));
    } 
}
