package equipofutbol;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Persona futbolista1 = new Futbolista(9, "Delantero", "Gonzalo", "Higuain", 29);
    static Persona futbolista2 = new Futbolista(21, "Delantero", "Paulo", "Dybala", 23);
    static Persona entrenador = new Entrenador("Defensiva", "Massimiliano", "Allegri", 49);
    static Persona medico = new Medico("Licenciado en Fisioterapia", 20, "Alex", "Marroni", 55);
    static Scanner entrada = new Scanner(System.in);
        
    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);
        
        menu();
    }
    
    public static void menu() {
        int opcion;
        
        do {
            System.out.println("\t .:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de Futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();            
        
            switch(opcion) {
                case 1: System.out.println("");
                        viajarEquipo();
                        break;
                case 2: System.out.println("");
                        entrenarEquipo();
                        break;
                case 3: System.out.println("");
                        partidoFutbol();
                        break;                        
                case 4: System.out.println("");
                        planificarEntrenamiento();
                        break;
                case 5: System.out.println("");
                        darEntrevista();
                        break;
                case 6: System.out.println("");
                        curarLesion();
                        break;
                case 7: break;
                default: System.out.println("Error, opcion incorrecta");
                        break;
            }        
            System.out.println("");
        } while(opcion != 7);               
    } 
    
    public static void viajarEquipo() {        
        for(Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " -> ");
            equipo.viajar();
        }
    }
    
    public static void entrenarEquipo() {        
        for(Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " -> ");
            equipo.entrenamiento();
        }       
    }
    
    public static void partidoFutbol() {
        for(Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " -> ");
            equipo.partidoFutbol();
        }           
    }
    
    public static void planificarEntrenamiento() {
        System.out.print(entrenador.getNombre() + " " + entrenador.getApellido() + " -> ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }
    
    public static void darEntrevista() {
        System.out.print(futbolista1.getNombre() + " " + futbolista1.getApellido() + " -> ");
        ((Futbolista)futbolista1).entrevista();
        System.out.print(futbolista2.getNombre() + " " + futbolista2.getApellido() + " -> ");
        ((Futbolista)futbolista2).entrevista();
    }
    
    public static void curarLesion() {
        System.out.print(medico.getNombre() + " " + medico.getApellido() + " -> ");
        ((Medico)medico).curarLesion();
    }
}
