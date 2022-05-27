/*
EJERCICIO 2

Hacer un programa que calcule e imprima el salario semanal de un empleado a 
partir de de sus horas semanales trabajas y de su salario por hora.

*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);        
        double salario_hora, horas, salario_total;
               
        System.out.println("Ingrese la cantidad de horas trabajadas");
        horas = entrada.nextDouble();
        
        
        System.out.println("Ingrese el salario por hora");
        salario_hora = entrada.nextDouble();
        
        salario_total = salario_hora * horas;
        
        System.out.println("El salario total:\n"+salario_total);
        
    }
    
}
