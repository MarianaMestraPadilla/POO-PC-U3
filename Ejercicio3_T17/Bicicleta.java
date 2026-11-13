package Ejercicio3_T17;

public class Bicicleta extends Transporte {
    public Bicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void desplazarse() {
        System.out.println("La bicicleta (" + nombre + ") avanza pedaleando por la ciclovía.");
    }
}
