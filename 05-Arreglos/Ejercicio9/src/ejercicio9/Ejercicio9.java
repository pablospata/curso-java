/*
EJERCICIO 9

Crear un programa que lea por teclado una tabla de 10 numeros enteros y la
desplace una posicion hacia abajo: el primero pasa a ser el segundo, el 
segundo pasa a ser el tercero y asi sucesivamente. El ultimo pasa a ser el
primero.

*/
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for(int i = 0; i < 10; i++) {
        
            System.out.print(i + ". Digite un numero: ");
            numeros[i] = entrada.nextInt();
            
        }        
        
        int temp = numeros[9];
        for(int i = 8; i >= 0; i--) {
         
            numeros[i+1] = numeros[i];
            
        }
      
        numeros[0] = temp;
        
        System.out.println("\n\nArreglo:");
        
        for(int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
    }
    
}
