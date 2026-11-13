package ejercicio2;

public class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}
 class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante y estoy aprendiendo Java.");
    }
}
 class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor y enseño programación.");
    }
}

 class PruebaPresentarse {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}

