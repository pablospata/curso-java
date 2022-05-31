/*
Metodo Burbuja

Se revisa cada elemento de la lista con el siguiente y se van intercambiando
hasta que el este ordenado.

 */
package burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Burbuja {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, temp;
        
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
        
        //METODO BURBUJA
        for(int i = 0; i < nElementos - 1; i++) {
            
            for(int j = 0; j < nElementos - 1; j++) {
            
                if(arreglo[j] > arreglo[j+1]) {
                    
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            
            }
            
            System.out.println("\n\nArreglo VUELTA: "+i);
            for(int k = 0; k < nElementos; k++) {
                System.out.print(arreglo[k] + " ");
            }
        }
        
        System.out.println("\n\nArreglo ORDENADO: ");
        for(int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " ");
        
        }
        
        System.out.println("");
    }
    
}
