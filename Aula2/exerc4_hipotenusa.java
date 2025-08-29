
package Aula2;

import java.util.Scanner;


public class exerc4_hipotenusa {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        
        double cateto1, cateto2;
        
        System.out.println("=================");
        System.out.println("Digite o Primeiro Cateto");
        System.out.println("=================");
        cateto1 = teclado.nextDouble();
        System.out.println("=================");
        System.out.println("Digite o Segundo Cateto");
        System.out.println("=================");
         cateto2 = teclado.nextDouble();
         
         double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
       
        System.out.println("Seu resultado da sua Hipotenusa é de "+ (hipotenusa));
        
        
        
        
        
    }
    
}
