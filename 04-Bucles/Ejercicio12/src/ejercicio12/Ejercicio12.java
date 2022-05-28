/*
EJERCICIO 12

Pedir un numero y calcular su factorial.

*/
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        int n;
        
        System.out.println("Ingrese un entero: ");
        n = entrada.nextInt();
        
        for(int i = n; i >= 1; i--)
            factorial *= i;
        
        System.out.println("Factorial: " + factorial);
    }
    
}
