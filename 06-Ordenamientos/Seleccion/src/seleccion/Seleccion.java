/*
Ordenamiento por Seleccion

*/
package seleccion;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Seleccion {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, min, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la "
                + "cantidad de elementos del arreglo"));
        
        arreglo = new int[nElementos];
        
        for(int i = 0; i < nElementos; i++) {
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
            
        }
        
        System.out.println("\nArreglo ORIGINAL: ");
        for(int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " ");
        
        }
        
        //ORDENAMIENTO POR SELECCION
        for(int i = 0; i < nElementos; i++) {
            
            min = i;
            
            for(int j = i + 1; j < nElementos; j++) {
             
                if(arreglo[j] < arreglo[min]) {
                    
                    min = j;
                    
                }
                
            }
            
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;

        }
        
        System.out.println("\n\nArreglo ORDENADO: ");
        for(int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " ");
        
        }
        
        System.out.println(""); 
    }
    
}
