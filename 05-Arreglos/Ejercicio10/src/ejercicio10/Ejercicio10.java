/*
EJERCICIO 10

Crear un programa que lea por teclado una tabla de 10 numeros enteros y 
desplace N posiciones en el arreglo (N es digitado por el usuario)

*/

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int n_posiciones;
        
        for(int i = 0; i < 10; i++) {
        
            System.out.print(i + ". Digite un numero: ");
            numeros[i] = entrada.nextInt();
            
        }        
        
        System.out.println("\n\nArreglo original:");
        
        for(int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("\n\nElija desplazamiento:");
        n_posiciones = entrada.nextInt();
        
        int temp;
        
        for(int vuelta = 0; vuelta < n_posiciones; vuelta++) {
         
            temp = numeros[9];
            for(int i = 8; i >= 0; i--) {

                numeros[i+1] = numeros[i];
            }

            numeros[0] = temp;             
        }
        
        System.out.println("\n\nArreglo desplazado:");
        
        for(int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
   
    }
    
}

// El resto de ejercicios son similares...