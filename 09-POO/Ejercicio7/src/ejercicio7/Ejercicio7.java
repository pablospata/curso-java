/*
EJERCICIO 7

Hacer un programa sencillo para realizar gestiones en un banco para lo cual 
tendremos 2 clases (Cliente y Cuenta).

Considerar que un cliente se caracteriza por su nombre, apellido y DNI. El cliente
puede consultar saldo, asi como ingresar y retirar dinero de sus cuentas. Ademas
cada cuenta se caracteriza por un numero de cuenta y un saldo.

*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static int buscarNroCuenta(Cuenta cuentas[], int n) {
        int i =  0, indice = 0;
        boolean encontrado = false;
        
        while(i < cuentas.length && !encontrado) {
            if(cuentas[i].getNroCuenta() == n) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        
        if(!encontrado)
            indice = -1;
            
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido;
        int dni, numeroCuenta, nCuentas, opcion, indiceCuenta;
        float saldo, cantidad;
        Cuenta cuentas[];
        Cliente cliente;
        
        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el apellido del cliente: ");
        apellido = entrada.nextLine();
        System.out.print("Digite el DNI del cliente: ");
        dni = entrada.nextInt();
        System.out.print("Digite cuantas cuentas tiene el cliente: ");
        nCuentas = entrada.nextInt();
        
        
        cuentas = new Cuenta[nCuentas];
        
        for(int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite los datos para la cuenta " + i);
            System.out.print("Digite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de cuenta: ");
            saldo = entrada.nextFloat();
            
            cuentas[i] = new Cuenta(numeroCuenta, saldo);   
        }
        
        cliente = new Cliente(nombre, apellido, dni, cuentas);
    
        do {
            System.out.println("\t .:MENU:. ");
            System.out.println("1. Ingresar dinero en la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar dinero de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Digite la opcion del menu: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1: System.out.print("Digite el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNroCuenta(cuentas, numeroCuenta);
                        
                        if(indiceCuenta == -1)
                            System.out.println("\nEl numero de cuenta ingresado no existe.");
                        else {
                            System.out.print("\nDigite la cantidad de dinero a ingresar en la cuenta: ");
                            cantidad = entrada.nextFloat();
                            
                            cliente.ingresarDinero(indiceCuenta, cantidad);
                            System.out.println("\nIngreso realizado correctamente.");
                            System.out.println("Saldo disponible: " + cliente.consultarSaldo(indiceCuenta));                                                       
                        }
                        break;
                case 2: System.out.print("Digite el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNroCuenta(cuentas, numeroCuenta);
                        
                        if(indiceCuenta == -1)
                            System.out.println("\nEl numero de cuenta ingresado no existe.");
                        else {
                            System.out.print("\nDigite la cantidad de dinero a retirar en la cuenta: ");
                            cantidad = entrada.nextFloat();
                            
                            if(cantidad > cliente.consultarSaldo(indiceCuenta)) {
                                System.out.println("Saldo insuficiente");
                            }                       
                            else {                            
                                cliente.retirarDinero(indiceCuenta, cantidad);
                                System.out.println("\nRetiro realizado correctamente.");
                                System.out.println("Saldo disponible: " + cliente.consultarSaldo(indiceCuenta));                                                     
                            } 
                        }
                        break;
                case 3: System.out.print("Digite el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNroCuenta(cuentas, numeroCuenta);
                        
                        if(indiceCuenta == -1)
                            System.out.println("\nEl numero de cuenta ingresado no existe.");
                        else 
                            System.out.println("Saldo disponible: " + cliente.consultarSaldo(indiceCuenta));
                        break;
                case 4: break;
                default: System.out.println("Error, opcion no valida.");
            }
            
            System.out.println("");
            
        } while(opcion != 4);
    
    }
    
}
