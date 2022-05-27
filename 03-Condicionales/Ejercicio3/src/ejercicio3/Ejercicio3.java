/*
 EJERCICIO 3

Hacer un programa que lea un caracter por tecladoi y compruebe si es una letra
mayuscula.

 */
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
    
        char letra;                
        
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        
        if(letra < 'a') {
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra es minuscula");
        }
                
    }
    
}


/*
Tambien se puede usar el metodo:
Character.isUpperCase()

*/