
package Aula2;

import java.util.Scanner;


public class exerc10Intervalo100A200 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        int valor;
        
        
        System.out.println("=========================================");
        System.out.println("DIGITE UM NÚMERO NO INTEVALO DE 100 A 200");
         System.out.println("=========================================");
         valor = teclado.nextInt();
         if (valor > 100 && valor < 200) {
             System.out.println("Você está no Intervalo!!");
         }else{
             System.out.println("Digite um Número dentro do Intervalo");
             
             
             
             
         }
             
         
         
         
        
        
    }
    
}
