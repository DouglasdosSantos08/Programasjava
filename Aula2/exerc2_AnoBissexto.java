
package Aula2;

import java.util.Scanner;


public class exerc2_AnoBissexto {
    
    public static void main(String[] args) {
        
  Scanner teclado = new Scanner (System.in);
  
   int ano;
  
  System.out.println("==========================");      
  System.out.println("");      
  System.out.println("IDENTIFICAÇÃO DE ANO BISSEXTO");
        System.out.println("");
  System.out.println("=======================");
  ano = teclado.nextInt();
        System.out.println (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);       
  
  boolean bissexto;
  
  
        
    }
    
}
