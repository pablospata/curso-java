package ejercicio7;

public class Cuenta {
    private int nroCuenta;
    private float saldo;

    public Cuenta(int nroCuenta, float saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void ingresarDinero(float cantidad) {
        saldo += cantidad;
    }
    
    public void retirarDinero(float cantidad) {
        saldo -= cantidad;
    }
}
