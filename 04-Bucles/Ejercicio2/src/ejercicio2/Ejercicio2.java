/*
EJERCICIO 2
Leer un numero e indicar si es positivo o negativo.

El proceso se repetira hasta que se introduzca un 0.

Inicio 1:40
Fin 1:45
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        String signo;
        
        System.out.print("Introduzca un entero: ");
        n = entrada.nextInt();
        
        while(n != 0){
            
            if(n > 0)
                signo = "Positivo";
            else
                signo = "Negativo";
            
            System.out.println("El numero ingresado es: "+ signo);
            
            System.out.print("Introduzca otro entero: ");
            n = entrada.nextInt();
            
        }
            
    }
    
}
