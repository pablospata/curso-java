
package holamundo;

import java.util.Scanner;

public class HolaMundo {    
    public static void main(String[] args) {        
        System.out.println("Hola Mundo");
        System.out.println("Curso Java");//Con sout y Tab    
        
        final int numero = 10;//Las constante van con final
        
        System.out.println(numero);
        
        /*
        Para la entrada de datos usar Scanner
        */
        
        int numero2;
        float numero3;
        
        Scanner entrada = new Scanner(System.in);
               
        System.out.println("Digite un numero: ");
        numero2 = entrada.nextInt();
        
        System.out.println("El numero ingresado fue " + numero2);
        
        System.out.println("Digite un numero decimal: ");
        numero3 = entrada.nextFloat();
        
        System.out.println("El numero ingresado fue " + numero3);
        //Para la entrada de float y double usar coma y no punto
        
        String cadena;
        
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        
        
        char letra;
        System.out.println("Digite un caracter: ");
        letra = entrada.next().charAt(0);
        
        
        
        
    }       
}

/*
Datos Primitivos

byte     8      128
short   16      32768
int     32      214
long    64

float ej: decimal = 3.45f
double ej: decimal = 3.45f

char caracter = 'a'

bool decision


Datos No Primitivos


Integer numero = 10
String palabra = "Esto es un String"

Estos tienen metodos...
En string usar comillas dobles y en caracter comillas simples



*/

/*
*/

/*
*/

