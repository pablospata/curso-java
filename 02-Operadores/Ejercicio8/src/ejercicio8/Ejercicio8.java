/*
EJERCICIO 8

Construir un programa que calcule y muestre por pantalla las raices de la 
ecuacion de segundo grado de coeficientes reales.

*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double a,b,c, x_pos, x_neg;
        
        System.out.print("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        
        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        
        System.out.print("Ingrese el valor de c: ");
        c = entrada.nextDouble();
        
        x_pos = ((-1) * b + Math.sqrt(Math.pow(b,2) - 4 * a * c) / (2 * a));
                
        x_neg = ((-1) * b - Math.sqrt(Math.pow(b,2) - 4 * a * c) / (2 * a));
             
        System.out.println("Los valores de la ecuacion son:");
        System.out.println(x_pos);
        System.out.println(x_neg);
                        
    }
    
}
