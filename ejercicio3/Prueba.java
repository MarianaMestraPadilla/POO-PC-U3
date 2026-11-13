package ejercicio3;

class Animal {
    public void comer() {
        System.out.println("El animal está comiendo.");
    }
}

class Ave extends Animal {
    public void volar() {
        System.out.println("El ave está volando.");
    }
}

public class Prueba {
    public static void main(String[] args) {
        Animal miAnimal = new Ave();
        miAnimal.comer();
        // miAnimal.volar(); //[cite: 32]
    }
}


class Dispositivo {
    public void encender() {
        System.out.println("Dispositivo encendido.");
    }
}
class Celular extends Dispositivo {
    @Override
    public void encender() {
        super.encender();
    }
}