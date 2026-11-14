package Ejercicio1_T17;

public class Main {
    public static void imprimirArea(Figura figura) {
        System.out.println("El área de la figura es: " + String.format("%.2f", figura.calcularArea()));
    }

    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        imprimirArea(circulo);
        imprimirArea(rectangulo);
    }
}
