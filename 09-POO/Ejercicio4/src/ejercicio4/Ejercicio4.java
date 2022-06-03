/*
EJERCICIO 4

Contruir un programa para una competencia de atletismo, el programa debe gestionar
una serie de atletas cataracterizados por su numero de atleta, nombre y tiempo
de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrea.

*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static int indiceMasRapido(Corredor corredores[]) {
                
        int indice = 0, tiempo;
        
        tiempo = corredores[0].getTiempoCarrera();        
        
        for(int i = 1; i < corredores.length; i++) {
            if(corredores[i].getTiempoCarrera() < tiempo) {
                tiempo = corredores[i].getTiempoCarrera();
                indice = i;        
            }
        }
                       
        return indice;
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nCorredores, id, tiempoCarrera, indRapido;
        String nombre;
        
        System.out.print("Digite la cantidad de corredores: ");
        nCorredores = entrada.nextInt();
        
        Corredor[] corredores = new Corredor[nCorredores];
        
        for(int i = 0; i < nCorredores; i++) {
   
            
            System.out.println("\nIngrese los datos del corredor Nro. " + i);
            System.out.print("ID: ");
            id = entrada.nextInt();   
            entrada.nextLine();
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            
            System.out.print("Tiempo de carrera: ");     
            tiempoCarrera = entrada.nextInt();
            
            corredores[i] = new Corredor(id, nombre, tiempoCarrera);

        }
        
        indRapido = indiceMasRapido(corredores);                
        
        System.out.println("\nEl corredor mas rapido fue: ");
        System.out.println("ID: " + corredores[indRapido].getId());
        System.out.println("Nombre: " + corredores[indRapido].getNombre());
        System.out.println("Tiempo de carrera: " + corredores[indRapido].getTiempoCarrera());
    }    
}
