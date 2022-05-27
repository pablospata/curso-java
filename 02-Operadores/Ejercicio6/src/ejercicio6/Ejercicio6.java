/*
EJERCICIO 6

Hacer un programa que calcule el cuadrado de una suma.

(a + b)^2 = a^2 + 2ab + b^2


*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double a, b,result;
      
        System.out.println("Ingrese 2 numeros: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        
        result = Math.pow(a + b, 2);
        
        System.out.println("\nEl resultado es "+result);
        
    }
    
}
