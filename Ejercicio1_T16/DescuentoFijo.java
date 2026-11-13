package Ejercicio1_T16;

public class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        double precioFinal = precioOriginal - montoFijo;
        return precioFinal < 0 ? 0 : precioFinal;
    }
    
}
