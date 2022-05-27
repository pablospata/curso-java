/*
EJERCICIO 4

Una compania de venta de carros usados, paga a su personal de ventas un salario
de $1000 mensuales, mas un comision de $150 por cada carro vendido, mas el 5%
del valor de la venta por carro.

Cada mes el capturista de la empresa ingresa en la computadora los datos 
pertinentes.

Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.

*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int autosVendidos, salarioFijo = 1000, comisionFija = 150;
        double comisionVarible = 0.05, valorPromedio, valorTot, salarioMensual;
               
        System.out.println("Ingrese la cantidad de autos vendidos en el mes:");
        autosVendidos = entrada.nextInt();
        
        
        System.out.println("Ingrese el valor promedio:");
        valorPromedio = entrada.nextDouble();
        
        valorTot = autosVendidos*(valorPromedio);
        
        salarioMensual = salarioFijo + valorTot * comisionVarible + 
                         autosVendidos * comisionFija;
        
        System.out.println("\nEl salario mensual es: "+salarioMensual);
        
    }
    
}
