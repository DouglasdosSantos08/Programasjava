
package Aula2;

import java.util.Scanner;


public class exerc8_MultiploDe3Ou7 {
    
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    
    int num;
    
        System.out.println("=================================");
        System.out.println("INFORME UM MULTIPLO DE 3 OU DE 7");
        System.out.println("=================================");
        num = teclado.nextInt();
       if (num % 3 == 0 || num % 7 == 0) {
            System.out.println("O número é múltiplo de 3 ou de 7.");
        } else {
            System.out.println("O número NÃO é múltiplo de 3 nem de 7.");
        }
    
    
        
        
    }
    
}
