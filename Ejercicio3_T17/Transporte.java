package Ejercicio3_T17;

public abstract class Transporte {
    protected String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    public abstract void desplazarse();
}
