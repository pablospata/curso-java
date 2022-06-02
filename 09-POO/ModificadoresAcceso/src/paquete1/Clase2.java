package paquete1;


public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();
        
        objeto1.atributo1 = 15;
        //objeto1.atributo2 = 30;
        
        objeto1.setAtributo2(30);
        
        System.out.println("La edad es: " + objeto1.getAtributo2());
        
        
        Persona persona1 = new Persona("Pablo", 22);
        
        persona1.mostrarDatos();
        
    }    
}
