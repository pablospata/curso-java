/*
EJERCIO 16

Queremos desarrollar una aplicacion que nos ayude a gestionar las notas de un 
centro educativo.

Cada grupo (o clase) esta compuesto por 5 alumnos. Se pide leer las notas del
primer, segundo y tercer trimestrre de un grupo. 

Debemos mostrar al final: la nota media del alumno que se encuentra en la 
posicion N (N se lee por teclado)

*/
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        float primer[], segundo[], tercer[];
        float sumaPrimer = 0, sumaSegundo = 0, sumaTercer = 0, sumaAlumno = 0;
        float promedioPrimer, promedioSegundo, promedioTercer, promedioAlumno;
        int posicion;
        
        primer = new float[5];
        segundo = new float[5];
        tercer = new float[5];
        
        System.out.println("Digite las notas del primer trimestre: ");
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Alumno ["+i+"]: ");
            primer[i] = entrada.nextFloat();
            
            sumaPrimer += primer[i];
        }
        
        System.out.println("Digite las notas del segundo trimestre: ");
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Alumno ["+i+"]: ");
            segundo[i] = entrada.nextFloat();
            
            sumaSegundo += segundo[i];
        }
        
        System.out.println("Digite las notas del tercer trimestre: ");
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Alumno ["+i+"]: ");
            tercer[i] = entrada.nextFloat();
            
            sumaTercer += tercer[i];
        }
   
        //Sacamos los promedios
        promedioPrimer = sumaPrimer / 5;
        promedioSegundo = sumaSegundo / 5;
        promedioTercer = sumaTercer / 5;
        
        System.out.println("Digite la posicion del alumno para sacar el promedio");
        posicion = entrada.nextInt();
        
        //Sacamos el promedio de las notas del alumnos
        sumaAlumno = primer[posicion] + segundo[posicion] + tercer[posicion];
        promedioAlumno = sumaAlumno / 3;
        
        System.out.println("\nMostrando los datos requeridos");
        System.out.println("Promedio del Primer Trimestre: " + promedioPrimer);
        System.out.println("Promedio del Segundo Trimestre: " + promedioSegundo);
        System.out.println("Promedio del Tercer Trimestre: " + promedioTercer);
        System.out.println("Promedio del Alumno " + posicion + ": " + promedioAlumno);
             
    }
    
}