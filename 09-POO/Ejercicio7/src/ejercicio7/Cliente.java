package ejercicio7;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    
    Cuenta[] cuentas;

    public Cliente(String nombre, String apellido, int dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }
    
    public float consultarSaldo(int n) {
        return cuentas[n].getSaldo();
    }
    
    public void ingresarDinero(int n, float cantidad) {
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public void retirarDinero(int n, float cantidad) {
        cuentas[n].retirarDinero(cantidad);
    }
}
