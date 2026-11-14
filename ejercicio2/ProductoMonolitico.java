package ejercicio2;

public class ProductoMonolitico {
    private String nombre;
    private double precioBase;

    public ProductoMonolitico(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public double calcularPrecioConIVA(double porcentajeIVA) {
        return precioBase + (precioBase * porcentajeIVA);
    }

    public void generarEtiqueta() {
        System.out.println("Etiqueta: " + nombre + " - $" + precioBase);
    }
}

