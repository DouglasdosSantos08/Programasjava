
package Aula2;

import java.util.Scanner;


public class exerc6_MaiordeDoisNumeros {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
int num1, num2;

System.out.println("========================");        
System.out.println("Digite o Primeiro Número");
System.out.println("========================");
num1 = teclado.nextInt();
System.out.println("========================");        
System.out.println("Digite o Segundo Número");
System.out.println("========================");
num2 = teclado.nextInt();
if (num1 > num2) {
    System.out.println("O número "+num1+ " é maior que o segundo ");
}else if (num2 > num1) {
    System.out.println("O Numero "+num2+ " é maior que o Primeiro ");
    
    
}
        
       

        
        
        

    }
    
}
