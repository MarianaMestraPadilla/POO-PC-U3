package Ejercicio1_T16;

public class CalculadoraDescuento {
    public double calcular(Descuento tipoDescuento, double precio) {
        return tipoDescuento.aplicarDescuento(precio);
    }
}
