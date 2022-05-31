/*
EJERCICIO 6

Leer los datos correspondientes a dos tablas de 12 elementos numericos, y 
mezclarlos en una tercera de la forma:  3 de la tabla A, 3 de la B, otros 3 de
A, otros 3 de B, etc.

*/
package ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) {       
        
        int[] tablaA = new int[12];
        int[] tablaB = new int[12];
        int[] tablaC = new int[24];
        
        //Cambio en el ejer. se llenan automaticamente las tablas
        
        for(int i = 0; i < 12; i++) {
        
            tablaA[i] = i + 1;
            tablaB[i] = i + 12 + 1;                        
        }
        
        
        for(int i = 0, j = 0; i < 12; i += 3) {
            
            tablaC[j++] = tablaA[i];
            tablaC[j++] = tablaA[i+1];
            tablaC[j++] = tablaA[i+2];
            tablaC[j++] = tablaB[i];
            tablaC[j++] = tablaB[i+1];
            tablaC[j++] = tablaB[i+2];
        
        }  
        
        System.out.println("Tabla 'A':");
        
        for(int i = 0; i < 12; i++) {
            System.out.print(tablaA[i] + " ");
        }
        
        System.out.println("\n\nTabla 'B':");
        
        for(int i = 0; i < 12; i++) {
            System.out.print(tablaB[i] + " ");
        }
        
        System.out.println("\n\nTabla 'C':");
        
        for(int i = 0; i < 24; i++) {
            System.out.print(tablaC[i] + " ");
        }
        
        System.out.println("\n");
    }
    
}
