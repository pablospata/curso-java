/*
EJERCICIO 1

Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden
introducido.

*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[5];
        
        for(int i = 0; i < 5; i++) {
            
            System.out.println("Introduzca el numero "+(i+1));
            arreglo[i] = entrada.nextInt();
            
        }
        
        System.out.println("Los numeros introducidos son:");
        
        for(int i = 0; i < 5; i++) {
            
            System.out.print(arreglo[i]+" ");
            
        }
       
        System.out.println("");
    }
    
}
