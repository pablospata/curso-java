/*
EJERCICIO 4

En megaPlaza se hace un 20% de descuento a los clientes cuya compra supere los 
$300.

Calcular la cantidad que pagara cada persona por su compra.

*/
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

        double descuento = 1 - 0.2, cantComprada, total;
        
        cantComprada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese"
                + " la cantidad comprada"));
        
        if(cantComprada > 300)
            total = cantComprada * descuento;
        else
            total = cantComprada;
        
        JOptionPane.showMessageDialog(null, "Usted debe pagar: $"+total);
        
    }
    
}
