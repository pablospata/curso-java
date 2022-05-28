/*
 EJERCICIO 4

Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se 
han introducido

 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, cont = 0;
        
        System.out.println("Digite un numero:");
        n = entrada.nextInt();
        
        
        while(n >= 0){
            cont++;
            
            System.out.println("Digite otro numero:");
            n = entrada.nextInt();
        }
        
        System.out.println("Ha insertado "+ cont + " numeros positivos");
                    
    }
    
}