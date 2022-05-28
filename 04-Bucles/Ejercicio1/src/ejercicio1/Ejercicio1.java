/*
EJERCICIO 1

Leer un numero y mostrar su cuadrado, repetir el proceso hasta
que se introduza un numero negativo.

 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
                
        System.out.println("Introduzca un entero positivo para evaluar"
                + " su cuadrado o un negativo para salir.");
        
        n = entrada.nextInt();
            
        while (n >= 0) {
            
            System.out.println("El cuadrado del numero ingresado es " + n * n);
            
            System.out.println("Introduzca un entero positivo para evaluar"
                + " su cuadrado o un negativo para salir.");
            n = entrada.nextInt();
        }

    }
    
}
