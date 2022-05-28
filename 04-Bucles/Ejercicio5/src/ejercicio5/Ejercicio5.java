/*
EJERCICIO 5

Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio
entre 0-100, y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun
sea mayor o menor con respecto a N.

El proceso termina cuando el usuario acierta y mostrar el numero de intentos.

Inicio 2:01
Fin 2:09

*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int aleatorio, n, cont = 1;
        String mensaje;
        
        aleatorio = (int)(Math.random()*100);
        
        System.out.println("Digite un numero");
        n = entrada.nextInt();                
        
        while(n != aleatorio) {            
            cont++;
            
            if(aleatorio > n)
                mensaje = "Es mayor";
            else
                mensaje = "Es menor";
            
            System.out.println(mensaje);
            
            System.out.println("Digite otro numero");            
            n = entrada.nextInt();
        }
        
        System.out.println("CORRECTO");
        System.out.println("El numero era: " + aleatorio);
        System.out.println("Numero de intentos: " + cont);
                            
    }
    
}

//Mejor podria ser con un Do-While
