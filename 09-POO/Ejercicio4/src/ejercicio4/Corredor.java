package ejercicio4;

public class Corredor {
    private int id;
    private String nombre;    
    private int tiempoCarrera;
    
    public Corredor(int id, String nombre, int tiempoCarrera) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }        
    
}
