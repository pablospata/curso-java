/*
Ordenamiento por Insercion 

*/
package insercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Insercion {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, pos, aux;
        
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
        
        //ORDENAMIENTO POR INSERCION
        for(int i = 1; i < nElementos; i++) {
            
            pos = i;
            aux = arreglo[i];
            
            while(pos > 0 && arreglo[pos-1] > aux) {
                
                arreglo[pos] = arreglo[pos-1];
                pos--;
                
            }
            
            arreglo[pos] = aux;
            
        }
        
        System.out.println("\n\nArreglo ORDENADO: ");
        for(int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " ");
        
        }
        
        System.out.println(""); 
    }
    
}
