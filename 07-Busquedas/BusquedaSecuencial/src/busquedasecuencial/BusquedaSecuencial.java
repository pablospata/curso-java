/*
Busqueda Secuencial

*/
package busquedasecuencial;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

    public static void main(String[] args) {

        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean bandera = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato "
                + "que desea buscar:"));
        
        //BUSQUEDA SECUENCIAL
        for(int i = 0; i < 5 && !bandera; i++) {
            
            if(arreglo[i] == dato)
            {
                JOptionPane.showMessageDialog(null, "Dato encontrado "
                        + "en la posicion " + i);
                bandera = true;
            }
        }
        
        if(!bandera)        
            JOptionPane.showMessageDialog(null, "Dato NO encontrado");        
                            
    }
    
}
