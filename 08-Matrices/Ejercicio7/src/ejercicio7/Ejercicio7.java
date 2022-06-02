/*
EJERCICIO 7

Crear una matriz "Marco" de tamano 5x5: todos sus elementos deben ser 0 salvo
los de los bordes que deben ser 1. Mostrarla.

*/
package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {

        int n = 5;
        int[][] matriz = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }
        
        System.out.println("Matriz marco de " + n + "x" + n + ":");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }    
}
