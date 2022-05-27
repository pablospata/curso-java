//Clase Math
package clasemath;

import java.util.Scanner;

public class ClaseMath {

    
    public static void main(String[] args) {
        
        double raiz = Math.sqrt(9);
        double base = 2, exponente = 8;
        
        double resultado = Math.pow(base, exponente);
        
        System.out.println(raiz);
        System.out.println(resultado);
        
        double numero = 4.56;
        long result1  = Math.round(numero);
        
        System.out.println(result1);   
        
        double aleatorio = Math.random();
        
        System.out.println(aleatorio);   
        
    }
    
}
