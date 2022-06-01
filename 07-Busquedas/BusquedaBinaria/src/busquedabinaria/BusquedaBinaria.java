/*
Busqueda binaria 

*/
package busquedabinaria;

import javax.swing.JOptionPane;

public class BusquedaBinaria {

    public static void main(String[] args) {

        int arreglo[] = {1,2,3,4,5,6,7,8,9,10};
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a "
                + "buscar"));
        
        //BUSQUEDA BINARIA
        int inf, sup, mitad, i;
        boolean bandera = false;
        
        inf = 0;
        sup = 10;
        i = 0;
        
        mitad = (inf + sup) / 2;
        while(inf <= sup && i < 5) {
         
            if(arreglo[mitad] == dato) {                    
                bandera = true;
                break;                
            }
            if(arreglo[mitad] > dato) {
                sup = mitad;
                mitad = (inf + sup) / 2;
            }
            if(arreglo[mitad] < dato) {
                inf = mitad;
                mitad = (inf + sup) / 2;
            }
        
        }
        
        if(bandera)
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en "
                    + "la posicion: " + mitad);
                
    }
    
}
