/*
EJERCICIO 7

Construir un programa que, dado un numero total de hroas, devuelve el numero
de semanas, dias y horas equivalentes.

Por ejemplo dado 1000 horas, debe mostrar 5 semanas, 6 dias y 16 horas.

*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int horasTotal, semanas, dias, horas;
        
        System.out.print("Ingrese el numero de horas: ");
        horasTotal = entrada.nextInt();
        
        semanas = horasTotal / 168;
        dias = horasTotal % 168 / 24;
        horas = horasTotal % 168 % 24;
        
        System.out.println("\nEl equivalentes es:");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);                
        
    }
    
}

/*
Al hacerlo con int se trunca los numeros
*/