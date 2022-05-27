/*
EJERCICIO 2

Pedir 2 numeros y decir cual es el mauor o si son iguales.

 */
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
    
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num2"));
        
        String men;
        
        if(num1 > num2) {
            JOptionPane.showMessageDialog(null, "El num1 es mayor");
        }
        else if(num2 > num1){
            JOptionPane.showMessageDialog(null, "El num2 es mayor");
        }
        else{
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");        
        }        
        
    }
    
}
