/*
EJERCICIO 1

Hacer un programa que calcule e imprima la suma de tres calificaciones

*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double cal1, cal2, cal3, suma;
        
        System.out.println("Ingrese la primer calificacion: ");
        cal1 = entrada.nextDouble();
        
        System.out.println("Ingrese la segunda calificacion: ");
        cal2 = entrada.nextDouble();
        
        System.out.println("Ingrese la tercer calificacion: ");
        cal3 = entrada.nextDouble();
        
        suma = cal1 + cal2 + cal3;
        
        System.out.println("La suma de calificaciones es: " + suma);
        
    }       
    
}
