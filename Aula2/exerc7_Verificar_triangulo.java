
package Aula2;

import java.util.Scanner;


public class exerc7_Verificar_triangulo {
    
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner(System.in);
     
     int lado1, lado2, lado3;
 
System.out.println("Verifique se pode formar um triângulo - cada lado deve ser menor que a soma dos outros dois."); 
     
System.out.println("=======================");      
System.out.println("Informe o Primeiro Lado"); 
System.out.println("======================="); 
lado1 = teclado.nextInt();

System.out.println("=======================");      
System.out.println("Informe o Segundo Lado"); 
System.out.println("=======================");  
lado2 = teclado.nextInt();

System.out.println("=======================");      
System.out.println("Informe o Terceiro Lado"); 
System.out.println("=======================");
lado3 = teclado.nextInt();

if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Os Lados podem Formar um Triângulo"); 
        
    }else{
    System.out.println("Os Lados Não Podem Formar um Triângulo");
}
    
    
    
    
    



        
        
    }
    
}
