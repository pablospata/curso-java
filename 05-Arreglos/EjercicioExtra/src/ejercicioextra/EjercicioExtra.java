/*
EJERCICIO EXTRA

Con un conjunto de numeros y un numero objetivo, devolver el los indices de los
numeros que suman el numero objetivo.

Condicion no usar mas de un bucle.

 */
package ejercicioextra;

public class EjercicioExtra {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int targetNumber = 13;
        int[] indices = new int[2];
        
        
        //Llenado del array
        for(int i = 0; i < 10; i++){
            
            numeros[i] = i+1;
        }

        //Con 2 bucles
        for(int i = 0; i < 10; i++){
            
            for(int j = 0; j < 10; j++) {
                
                if(numeros[i] + numeros[j] == targetNumber && i != j) {
                    indices[0] = i;
                    indices[1] = j;
                    
                }                    
            
            }
        }
        
        //Con 1 bucles. Ver HasMap...                                    
        System.out.println("Indice Num1: "+indices[0] + ". Valor: "+ numeros[indices[0]]);
        System.out.println("Indice Num2: "+indices[1] + ". Valor: "+ numeros[indices[1]]);
    }
    
}
