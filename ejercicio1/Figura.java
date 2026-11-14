package ejercicio1;

public class Figura {
    public void calcularArea() {
        System.out.println("Calculando el área de una figura.");
    }
}
 class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}
 class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }
}
 class PruebaFiguras {
    public static void main(String[] args) {
        Figura figura1 = new Figura();
        Figura figura2 = new Circulo(2);
        Figura figura3 = new Rectangulo(4, 5);

        figura1.calcularArea();
        figura2.calcularArea();
        figura3.calcularArea();
    }
}
