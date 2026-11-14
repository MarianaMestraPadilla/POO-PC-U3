package ejercicio4_taller14;

public class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está desplazando.");
    }
}

class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche avanza por la autopista usando su motor.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta avanza por la ciclovía al pedalear.");
    }
}

class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v1 = new Coche();
        Vehiculo v2 = new Bicicleta();

        v1.mover();
        v2.mover();
    }
}

