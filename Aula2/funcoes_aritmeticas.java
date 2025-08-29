
package Aula2;

import java.util.Scanner;


public class funcoes_aritmeticas {
    
    public static void main(String[] args) {
        
   
   
   
   //Valor Absoluto
   //     int a = Math.abs(-50);
   //     System.out.println(a);
   
   
   //exponencial
   // double a = Math.pow(9,5);
   // System.out.println(a);
   
   //raiz quadrada
    // double a = Math.sqrt(81);
   // System.out.println(a);
     
      //graus para radianos
   //   double a = Math.toRadians(90);
   //     System.out.println(a); */
   
   //conversor de seno
  Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um Angulo: ");
        double angulo = teclado.nextDouble();
        double s = Math.sin(Math.toRadians(angulo));
        System.out.println("o seno de "+angulo+ " é igual a "+s);

                
                
        
        
        
    }
    
}
