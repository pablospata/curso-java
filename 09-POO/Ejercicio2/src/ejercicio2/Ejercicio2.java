/*
 EJECICIO 2

Connstruir un programa que permita dirigir el movimiento de un objeto dentro de 
un tablero y actualice su posicion dentro del mismo.

Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada
movimiento el programa mostrara la nueva direccion elegida y las coordenadas de
situacion del objeto dentro del tablero.

*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tablero t1;
        int x, y, opcion, incremento = 0;
        
        System.out.print("Digite el valor inicial de X: ");
        x = entrada.nextInt();
        System.out.print("Digite el valor inicial de Y: ");
        y = entrada.nextInt();
        
        //Posicion inicial del objeto
        t1 = new Tablero(x, y);        
        
        do{
            System.out.println("\n\t .:MENU:. ");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia la DERECHA");
            System.out.println("4. Mover hacia la IZQUIERDA");
            System.out.println("5. Salir");   
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();
            
            if(opcion != 5 && opcion > 0 && opcion < 6){
                System.out.print("Digite la cantidad de espacios a mover: ");
                incremento = entrada.nextInt();                                        
            }    
            
            switch(opcion) {
                case 1: t1.moverArriba(incremento); break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento); break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5: break;
                default: System.out.println("Error, se equivoco de opcion de menu");                                        
            }
            
            System.out.println("\nPosicion Actual (X, Y): (" + t1.getX() + ", " + t1.getY() + ")");
        }
        while(opcion != 5);
          
        
    }
    
}
