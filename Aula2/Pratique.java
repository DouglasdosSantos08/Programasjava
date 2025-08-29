
package Aula2;

import java.util.Scanner;


public class Pratique {
    
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner(System.in);
     
     double raiz1, raiz2, potencia;
     int num1, num2, div, soma, sub, multi;
    
     
      System.out.println("============================");
        System.out.println("digite um numero inteiro");
         System.out.println("============================");
        num1 = teclado.nextInt();
        System.out.println("============================");
        System.out.println("Digite outro numero inteiro");
         System.out.println("============================");
         num2 = teclado.nextInt();
        
         System.out.println("====================");
         System.out.println("SEUS RESULTADOS SÃO");
         System.out.println("====================");
          System.out.println("-------------------------------------------");
         System.out.println("Seu resultado da soma é de "+ (num1 + num2));
         System.out.println("-------------------------------------------");
         System.out.println("Seu resultado da subtração é de "+ (num1 - num2));
          System.out.println("-------------------------------------------");
         System.out.println("Seu resultado da Multiplicação é de "+ (num1 * num2));
          System.out.println("-------------------------------------------");
         System.out.println("Seu resultado da divisão é de "+ (num1 / num2));
          System.out.println("-------------------------------------------");
           System.out.println("O resultado da sua raiz quadrada e de "+ (Math.sqrt(num1))); 
            System.out.println("-------------------------------------------");
           System.out.println("O resultado da sua raiz quadrada e de "+ (Math.sqrt(num2))); 
            System.out.println("-------------------------------------------");
           System.out.println("o resultado da sua potência e de "+ (Math.pow(num1, num2)));
            System.out.println("-------------------------------------------");
        
        
        
        
        
    }
    
    
}
