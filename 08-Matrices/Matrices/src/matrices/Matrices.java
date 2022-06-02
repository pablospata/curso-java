/*
Matrices

*/
package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }            
            System.out.println("");
        }
        
        int matriz2[][], nFilas, nColum;
        
        System.out.print("Digite el numero de filas: ");
        nFilas = entrada.nextInt();
        System.out.print("Digite el numero de columnas: ");
        nColum = entrada.nextInt();
        
        matriz2 = new int[nFilas][nColum];
        
        for(int i = 0; i < nFilas; i++) {
            for(int j = 0; j < nColum; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }            
        System.out.println("\nLa Matriz 2 es: ");
        
        for(int i = 0; i < nFilas; i++) {
            for(int j = 0; j < nColum; j++) {
                System.out.print(matriz2[i][j] + " ");
            }            
            System.out.println("");
        }        
    }    
}
