/*
EJERCICIO 8

Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene.

*/
package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
    
        int num, cifras;
                
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"
                + " entre 0 y 99999"));                
        
        if(num > 99999 || num < 0){
            JOptionPane.showMessageDialog(null, "Numero incorrecto");
            return;
        }
        
        if(num >= 10000)
            cifras = 5;
        else if(num >= 1000)
            cifras = 4;
        else if(num >= 100)
            cifras = 3;
        else if(num >= 10)
            cifras = 2;
        else
            cifras = 1;
            
        JOptionPane.showMessageDialog(null, "Cantidad de cifras:" + cifras);
        
    }
    
}
