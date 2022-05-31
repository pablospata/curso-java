/*
EJERCICIO 5

Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera 
de la forma: el 1ro de A, el 1ro de B, el 2do de A, el 2do de B, etc.

*/
package ejercicio5;

public class Ejercicio5 {
    
    public static void main(String[] args) {

        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20];
        
        //Cambio en el ejer. se llenan automaticamente las tablas
        
        for(int i = 0; i < 10; i++) {
        
            tablaA[i] = i;
            tablaB[i] = i + 10;            
            
        }
        
        
        for(int i = 0, j = 0; i < 10; i++) {
            
            tablaC[j++] = tablaA[i];
            tablaC[j++] = tablaB[i];
        
        }  
        
        System.out.println("Tabla 'A':");
        
        for(int i = 0; i < 10; i++) {
            System.out.print(tablaA[i] + " ");
        }
        
        System.out.println("\n\nTabla 'B':");
        
        for(int i = 0; i < 10; i++) {
            System.out.print(tablaB[i] + " ");
        }
        
        System.out.println("\n\nTabla 'C':");
        
        for(int i = 0; i < 20; i++) {
            System.out.print(tablaC[i] + " ");
        }

    }
    
}
