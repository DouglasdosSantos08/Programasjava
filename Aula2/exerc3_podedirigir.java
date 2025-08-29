
package Aula2;

import java.util.Scanner;


public class exerc3_podedirigir {
    
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner(System.in);   
        
     int abilit;
     
        System.out.println("=====================");   
        System.out.println("VERIFICAO SE PODE DIRIGIR");
        System.out.println("=====================");
        System.out.println("Quantos Anos você tem?");
        System.out.println("=====================");
        abilit = teclado.nextInt();
        if (abilit >= 18) {
            System.out.println("Você pode dirigir e possuir CNH!!");
        }else{
            System.out.println("você não tem idade!");
            
            
            
        }
        
        
        
        
        
        
    }
    
}
