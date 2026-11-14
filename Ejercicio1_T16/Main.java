package Ejercicio1_T16;

public class Main {
    public static void main(String[] args) {
        CalculadoraDescuento calculadora = new CalculadoraDescuento();
        double precioProducto = 100.0;

        Descuento descPorcentaje = new DescuentoPorcentaje(15); // 15%
        Descuento descFijo = new DescuentoFijo(20); // $20 menos

        System.out.println("Precio original: $" + precioProducto);
        System.out.println("Con descuento del 15%: $" + calculadora.calcular(descPorcentaje, precioProducto));
        System.out.println("Con descuento fijo de $20: $" + calculadora.calcular(descFijo, precioProducto));
    }
}
