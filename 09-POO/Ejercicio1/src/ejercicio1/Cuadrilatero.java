package ejercicio1;

public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro() {
        return lado1 * 2 + lado2 * 2;
    }
    
    public float getArea() {
        return lado1 * lado2;
    }    
}
