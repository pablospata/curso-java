/*
EJERCICIO 3

Construr un programa que dada una serie de vehilculos caracterizados por su
marca, modelo y precio, imprima las propiedades del vehiculo mas barato.

Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y 
crear una clase que represente a cada uno de ellos.

*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static int indiceCocheBarato(Coche coches[]) {
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        
        for(int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
    
        return indice;
    }    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nVehiculos, precio, indiceBarato;
        String marca, modelo;
        
        System.out.print("Digite la cantidad de Vehiculos: ");
        nVehiculos = entrada.nextInt();
        
        Coche[] arrayVehiculos = new Coche[nVehiculos];
        
        for(int i = 0; i < nVehiculos; i++) {
            
            entrada.nextLine();
            System.out.println("\nDigite los datos del Vehiculo " + i);
            
            System.out.print("Marca: ");
            marca = entrada.nextLine();
            
            System.out.print("Modelo: ");
            modelo = entrada.nextLine();
            
            System.out.print("Precio: ");
            precio = entrada.nextInt();
            arrayVehiculos[i] = new Coche(marca, modelo, precio);
        }
        
        indiceBarato = indiceCocheBarato(arrayVehiculos);
                        
        System.out.println("\nEl coche mas barato es:");
        System.out.println(arrayVehiculos[indiceBarato].getMarca());
        System.out.println(arrayVehiculos[indiceBarato].getModelo());
        System.out.println(arrayVehiculos[indiceBarato].getPrecio());
    }
    
}
