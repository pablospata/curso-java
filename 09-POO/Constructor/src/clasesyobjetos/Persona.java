package clasesyobjetos;

public class Persona {

    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Metodos
    
    //METODO CONSTRUCTOR
    public Persona(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad; 
        
        /*
        Otra forma de hacer esto es con this, si los parametros tiene el mismo
        nombre que los atributos
        
        this.nombre = nombre;
        this.edad = edad;         
        */    
    }

    public Persona(String dni) {
        this.dni = dni;
    }        
        
    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);    
    }        
}
