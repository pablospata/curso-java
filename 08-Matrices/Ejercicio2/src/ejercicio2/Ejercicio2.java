/*
EJERCICIO 2

Sumar 2 matrices

11.15 - 11.22

*/
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int matrizA[][] = {{0,1,2},{1,3,0},{2,0,5}};
        int matrizB[][] = {{3,8,1},{1,4,0},{1,0,5}};
        int matrizC[][] = new int[3][3];
                
        System.out.println("Matriz A:");        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }            
            System.out.println("");
        }
        
        System.out.println("\nMatriz B:");        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j] + " ");
            }            
            System.out.println("");
        }
        //SUMA DE MATRICES
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }                        
        }
        
        System.out.println("\nMatriz C (A + B:");        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrizC[i][j] + " ");
            }            
            System.out.println("");
        }
        
    }
    
}
