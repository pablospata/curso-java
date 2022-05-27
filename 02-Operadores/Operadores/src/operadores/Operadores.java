//Operadores Aritmeticos
package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, suma, resta, mult, div, resto;
        
        System.out.print("Digite 2 numeros: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La division es: "+div);
        System.out.println("El resto es: "+resto);                                           
        
        suma += 10;
        
        System.out.println("La suma aumentada 10 es:" + suma);
                       
    }
    
}

/*
Otros temas que se ven simples:
- Incremento y decremento, como prefijo y sufijo



*/