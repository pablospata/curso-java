/*
EJERCICIO 8 Disenar una aplicacion que declare una tabla de 10 elementos
enteros. Leer mediante teclado 8 numeros. Despues se debe pedir un numero y una
posicion, insertarlo en la posicion indicada, desplazando los que esten detras.

*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numero, posicion;
        
        for(int i = 0; i < 8; i++){
            
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        
        System.out.println("Digite una posicion: ");
        posicion = entrada.nextInt();
        
        for(int i = 9; i > posicion; i--){
            arreglo[i] = arreglo[i-1];
        
        }
        
        arreglo[posicion] = numero;
        
        System.out.println("\n\nArreglo:");
        
        for(int i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    
}
