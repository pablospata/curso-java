/*
EJERCICIO 1

Construir un programa que calcule el area y el perimetro de un cuadrilatero dada
la longitud de sus dos lados.

Los valores de la longitud deberan introducirse por linea de ordenes. Si es un
cuadrado, solo se proporcionara la longitud de un de los lados al constructor.

*/
package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Cuadrilatero c1;
        float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite un lado:"));       
        float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite otro lado:"));
        
        if(lado1 == lado2)
            c1 = new Cuadrilatero(lado1);
        else
            c1 = new Cuadrilatero(lado1, lado2);
        
        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("El area es: " + c1.getArea());
    }
    
}
