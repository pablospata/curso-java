/*
EJERCICIO 13

Cajero automatico

*/
package ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {
    
    public static void main(String[] args) {

        final int saldo_inicial = 1000;
        int opcion, ingreso, saldoActual;
                
        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "Bienvenido a su Cajero Automatico. \n\n"
                        + "Por favor ingrese una opcion:\n"
                        + "1. Ingresar dinero a la cuenta\n"
                        + "2. Retirar dinero de la cuenta\n"
                        + "3. Salir"));
        
        switch(opcion) {
            case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog("Dig"
                    + "ite la cantidad a ingresar"));
                    saldoActual = saldo_inicial + ingreso;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta:\n"+
                            saldoActual);
                    break;
            case 2: ingreso = Integer.parseInt(JOptionPane.showInputDialog("Dig"
                    + "ite la cantidad a retirar"));
            
                    if(ingreso > saldo_inicial){
                        JOptionPane.showMessageDialog(null, "Error. No puede retirar "
                                + "mas de lo que tiene en saldo");
                    }
                    else{
                    saldoActual = saldo_inicial - ingreso;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta:\n"+
                            saldoActual);
                    }
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Gracias por utilizar"
                    + " el Cajero Automatico");
                    break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
    }
    
}
