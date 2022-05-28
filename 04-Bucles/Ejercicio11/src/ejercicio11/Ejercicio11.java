/*
EJERCICIO 11

Hacer un programa que muestre el producto de los 10 primeros numeros pares.


*/
package ejercicio11;

public class Ejercicio11 {

    public static void main(String[] args) {

        long i = 2, prod = 1;
        
        //for()
        
        while(i <= 20){
            
            if(i % 2 == 0)
                prod *= i;
            
            i++;
        }       
        
        System.out.println("Resultado: " + prod);
        
    }
    
}
