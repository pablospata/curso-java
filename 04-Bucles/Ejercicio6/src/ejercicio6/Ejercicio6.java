/*
 EJERCICIO 6

Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros
introducidos.

 */
package ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {

        int n, sum = 0;
        
        do{
            
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca "                 
                    + "un entero"));
                    
            sum += n;
            
        } while(n != 0);
                                
        JOptionPane.showMessageDialog(null, "La suma es: " + sum );
    }
    
}

/*
Algunos de los siguientes ejercicios son parecidos o muy faciles, por eso no se 
hacen...
*/
