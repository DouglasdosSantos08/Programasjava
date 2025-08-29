
package Aula2;

import java.util.Scanner;


public class exerc5_verificarEntre10e20 {
    
    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
      
      
      
      int num1;
      
        System.out.println("===================================");
        System.out.println("Verificação de número entre 10 a 20");
        System.out.println("===================================");
        num1 = teclado.nextInt();
        
        if (num1 > 10 && num1 < 20) {
            System.out.println("o numero informado está entre 10 e 20");
        }else{
            System.out.println("Seu número não está entre o intervalo!");
        }
        
  
        
        
    }
    
}
