/*
EJERCICIO 4

Leer 10 numeros enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden: el primero, el ultimo, el segundo,
el penultimo, el tercero, etc.

*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numbers = new int[10];
        
        for(int i = 0; i < 10; i++) {
            
            System.out.print(i+". Digite un numero: ");
            numbers[i] = entrada.nextInt();
            
        }
        
        System.out.println("\nArreglo:");
        for(int i = 0; i < 10/2; i++) {
            System.out.println(numbers[i]);
            System.out.println(numbers[9-i]);
        }
        
    }
    
}
