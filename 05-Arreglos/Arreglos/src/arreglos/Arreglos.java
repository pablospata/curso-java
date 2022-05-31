package arreglos;

/*
NOTAS sobre array:
Mismo tipo
Tamano se declara al inicio
Sintaxis:

Tipo_de_variable[] Nombre_del_array = new Tipo_de_variable[dimension]

- Ejemplos:
int[] edad = new int[4];
float[] estatura = new float[4];
boolean[] estado = new boolean[3];
String[] nombre = new String[2];

Tambien asignando directamente

int[] numeros = {5,7,9};

*/

public class Arreglos {

    public static void main(String[] args) {

        //Arreglo 1
        System.out.println("Arreglo 1");
        
        int[] numeros = new int[3];
        
        numeros[0] = 5;
        numeros[1] = 7;
        numeros[2] = 12;
        
        System.out.println(numeros[0]);
        
        //Arreglo 2
        System.out.println("\nArreglo 2");
        
        int[] numeros2 = {2,32,6};
        
        for(int i = 0; i < 3; i++)
            System.out.println(numeros2[i]);
        
        
    }
    
}