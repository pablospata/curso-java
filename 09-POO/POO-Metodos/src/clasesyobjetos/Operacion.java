package clasesyobjetos;

import javax.swing.JOptionPane;

public class Operacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos    
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
    }
    
    public void hacerOperaciones() {
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;        
    }
    
    public void mostrarResultados() {
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion " + multiplicacion);
        System.out.println("Division " + division);
    }        
}
