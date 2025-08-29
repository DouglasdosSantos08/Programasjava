
package Aula2;

import java.util.Scanner;

public class TriangulosExemplo {
    public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        double lado1 = sc.nextDouble();

         System.out.println("Digite o segundo lado: ");
        double lado2 = sc.nextDouble();
        
         System.out.println("Digite o terceiro lado: ");
        double lado3 = sc.nextDouble();
        
        boolean tri = (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1);
        boolean eq = (lado1 == lado2) && (lado2 == lado3);
        boolean esca = (lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3);
        boolean iso = (lado1 == lado2 && lado1 != lado3)||  (lado1 == lado3 && lado1 != lado2)|(lado2 == lado3 && lado2 != lado1);
                    
                    
                    
        
        
        
        System.out.println("Pode formar um TRIÂNGULO? "+tri);
        System.out.println("Pode formar um TRIÂNGULO EQUILATERO? "+eq);
        System.out.println("Pode formar um TRIÂNGULO ESCALENO? "+esca);
         System.out.println("Pode formar um TRIÂNGULO ESCALENO? "+iso);
        
        
        }
            
        }



        
        
        

    

