
package Aula2;

import java.util.Scanner;


public class exerc9_Aprovado_frêquencia {

    public static void main(String[] args) {
        
  Scanner teclado = new Scanner(System.in);      
        
   String nome;
   double media, freq;
        
        System.out.println("========================");
        System.out.println("Informe o Nome do Aluno");
        System.out.println("========================");
        nome = teclado.nextLine();
        System.out.println("========================");
        System.out.println("Informe sua nota");
        System.out.println("========================");
        media = teclado.nextDouble();
        System.out.println("======================");
        System.out.println("Informe Sua Frequência");
        System.out.println("======================");
 freq = teclado.nextDouble();
 if (media >= 60 && freq >= 75) {
     System.out.println("Você passou de ano!! "+nome);
 }else{
     System.out.println("você reprovou!!" +nome);
     
     
     
     
 }
        
        
        
        
        
    }

    
}
