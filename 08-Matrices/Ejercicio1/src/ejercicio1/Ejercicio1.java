/*
 EJERCICIO 1

Determinar si una matriz es o no simetrica
- nFilas == nColum
- Misma matriz si se cambia filas por columnas

*/
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        int matrizA[][] = {{0,1,2},{1,3,0},{2,0,5}};
        int matrizB[][] = {{3,8,1},{1,4,0},{1,0,5}};
        
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
        
        System.out.println("\nMatriz A. Transpuesta:");        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrizA[j][i] + " ");
            }            
            System.out.println("");
        }
        
        System.out.println("\nMatriz B. Transpuesta:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrizB[j][i] + " ");
            }            
            System.out.println("");
        }
                
        //Ver simetria
        boolean simetricaA = true, simetricaB = true;
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 && simetricaA; j++) {
                if(matrizA[i][j] != matrizA[j][i]) {
                    System.out.println("Matriz A no simetrica");
                    simetricaA = false;
                    break;
                }
            }                        
        }
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 && simetricaB; j++) {
                if(matrizB[i][j] != matrizB[j][i]) {
                    System.out.println("Matriz B no simetrica");
                    simetricaB = false;
                    break;
                }
            }                       
        }
        
        if(simetricaA)
            System.out.println("Matriz A es SIMETRICA");
        
        if(simetricaB)
            System.out.println("Matriz B es SIMETRICA");
    }
    
}
