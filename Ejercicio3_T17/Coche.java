package Ejercicio3_T17;

public class Coche extends Transporte {
    public Coche(String nombre) {
        super(nombre);
    }

    @Override
    public void desplazarse() {
        System.out.println("El coche (" + nombre + ") avanza por la carretera usando su motor.");
    }
}
