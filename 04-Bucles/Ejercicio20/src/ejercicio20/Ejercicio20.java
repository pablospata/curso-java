/*
EJERCICIO 20

Pedir un numero N, introducir N sueldos y mostrar el sueldo maximo.

*/
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, sueldo, sueldoMax = 0;
        
        System.out.print("Ingrese la cantidad de sueldos: ");
        n = entrada.nextInt();
        
        for(int i = 1; i <= n; i++){

            System.out.println("Ingrese el sueldo Nro. "+ i);            
            sueldo = entrada.nextInt();
            
            if(sueldo > sueldoMax)
                sueldoMax = sueldo;
                
        }
        
        System.out.println("El sueldo maximo es: ");
        System.out.println(sueldoMax);
    }
    
}
