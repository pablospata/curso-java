/*
EJERCICIO 3

Guillermo tiene N doalres. Luis tiene la mitad de lo que posee Guillermo. Juan
tiene la mitad de lo que poseen Luis y Guillermo juntos. 

Hacer un programma que calcule e imprima la cantidad de dinero que tienen entre
los tres.

*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double guillermo, luis, juan, total;
        
        System.out.print("Ingrese la cantidad Guillermo: ");
        guillermo = entrada.nextDouble();
        
        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = guillermo+luis+juan;
        
        System.out.println("\nGuillermo tiene: "+guillermo);
        System.out.println("Luis tiene: "+luis);
        System.out.println("Juan tiene: "+juan);
        
        System.out.println("\nEn total los 3 tienen: "+total);
    }
    
}
