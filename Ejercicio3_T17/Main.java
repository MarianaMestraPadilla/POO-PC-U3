package Ejercicio3_T17;

public class Main {
    public static void iniciarViaje(Transporte vehiculo) {
        vehiculo.desplazarse();
    }

    public static void main(String[] args) {
        Transporte miBici = new Bicicleta("Trek Marlin");
        Transporte miCoche = new Coche("Mazda 3");

        iniciarViaje(miBici);
        iniciarViaje(miCoche);
    }
}
