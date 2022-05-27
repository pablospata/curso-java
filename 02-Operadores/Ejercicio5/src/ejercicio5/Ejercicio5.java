/*
EJERCICIO 5

La calificacion final de un estudiante de Informatica se calcula con base a las
calificaciones de cuatro aspectos de rendimiento academico: participacion, 
primer examen parcial, segundo examen parcial y examen final.

Sabiendo que las calificaciones anterores entran a la calificacion final con 
ponderaciones del 10%, 25% 25% y 40%, hacer un programa que calcule e imprima
la calificacion final obtenida por un estudiante.

*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double participacion, nota1, nota2, examenfinal, notafinal;       
        
        System.out.println("Ingrese la nota por particicacion: ");
        participacion = entrada.nextDouble();
        
        System.out.println("Ingrese la nota Parcial 1: ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Ingrese la nota Parcial 2: ");
        nota2 = entrada.nextDouble();
        
        System.out.println("Ingrese la nota Examen Final: ");
        examenfinal = entrada.nextDouble();
        
        notafinal = participacion*0.1+nota1*0.25+nota2*0.25+examenfinal*0.4;
        
        System.out.println("La calificacion final es: "+notafinal);
        
    }    
}
