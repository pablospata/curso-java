/*
EJERCICIO 4

Crear una matriz de identidad de 7x7

*/
package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {

        int[][] matriz = new int[7][7];
        
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++) {
                if(i == j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }
        
        System.out.println("Matriz de identidad");
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }        
    }
    
}

/*
Resto de ejercicios similares...
*/
