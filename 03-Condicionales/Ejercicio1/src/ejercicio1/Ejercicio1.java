/*
EJERCICIO 1

Hacer un programa que lea un numero y meustre si el numero es multiplo de 10.

*/
package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
    
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"
                + " entero"));
        
        String men = (dato % 10 == 0) ? "SI" : "NO";
        
        
        JOptionPane.showMessageDialog(null, "El numero "+dato+" "+men+" es multiplo"
                    + " de 10.");               
                            
    }
    
}
