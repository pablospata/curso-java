/*
EJERCICIO 3
Leer un numero e indicar si es par o impar.

El proceso se repetira hasta que se introduzca un 0.

Inicio 1:47
Fin 1:52

*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        String tipo;
        
        System.out.print("Introduzca un entero: ");
        n = entrada.nextInt();
        
        while(n != 0){
            
            if(n % 2 == 0)
                tipo = "Par";
            else
                tipo = "Impar";
            
            System.out.println("El numero ingresado es: "+ tipo);
            
            System.out.print("Introduzca otro entero: ");
            n = entrada.nextInt();
        
        }
        
    }
    
}
