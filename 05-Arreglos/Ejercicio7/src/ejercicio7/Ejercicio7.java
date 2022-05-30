/*
EJERCICIO 7

Leer por teclado una serie de 10 numeros. La aplicacion debe indicarnos si
los numeros estan ordenados de forma creciente, decreciente o si estan 
desordenados.

*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean ord_crec = true, ord_decre = true, desordenados = false;
        
        for(int i = 0; i < 10; i++) {
            
            System.out.print((i+1)+". Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
            
        }
                        
        for(int i = 1; i < 10; i++) {
        
            if(numeros[i] < numeros[i-1])
                ord_crec = false;
            
            if(numeros[i] > numeros[i-1])
                ord_decre = false;                
        }
        
        if(!ord_crec && !ord_decre)
            desordenados = true;
        
        System.out.println("Creciente: " + ord_crec);
        System.out.println("Decreciente: " + ord_decre);
        System.out.println("Desordenados: " + desordenados);
        
    }
    
}
