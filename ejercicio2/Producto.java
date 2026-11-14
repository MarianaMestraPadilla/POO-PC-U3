package ejercicio2;

public class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
}

class CalculadoraPrecioService {
    public double calcularPrecioFinal(Producto producto, double porcentajeIVA) {
        return producto.getPrecioBase() * (1 + porcentajeIVA);
    }
}

class EtiquetaService {
    public void imprimirEtiqueta(Producto producto, double precioFinal) {
        System.out.println("ETIQUETA: [" + producto.getNombre() + " | Precio Final: $" + precioFinal + "]");
    }
}
