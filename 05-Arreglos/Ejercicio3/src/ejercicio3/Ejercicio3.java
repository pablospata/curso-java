/*
EJERCICIO 3

Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar
la media de los numeros, positivos, la media de los negativos y contar el numero
de ceros.

*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        float mediaPositivos = 0, mediaNegativos = 0;
        int cantCeros = 0, cantPositivos = 0, cantNegativos = 0, sumaPositivos = 0, 
                sumaNegativos = 0;
        
        for(int i = 0; i < 5; i++) {
            
            System.out.print("Digite un numero para la posicion "+i+": ");
            numeros[i] = entrada.nextInt();
            
            if(numeros[i] > 0){
                cantPositivos++;
                sumaPositivos += numeros[i];
            }
            else if (numeros[i] < 0){
                cantNegativos++;
                sumaNegativos += numeros[i];
            }
            else {
                cantCeros++;            
            }                           
            
            
        }
        
        if(cantPositivos != 0)
            mediaPositivos = sumaPositivos / cantPositivos;
            
        if(cantNegativos != 0)
            mediaNegativos = sumaNegativos / cantNegativos;           
     
        System.out.println("Media de Positivos: "+mediaPositivos);
        System.out.println("Media de Negativos: "+mediaNegativos);
        System.out.println("Cantidad de Ceros: "+cantCeros);
    }
    
            
    
}
