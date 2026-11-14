package Ejercicio2_T17;

public class Main {
    public static void procesarOperaciones(CuentaBancaria cuenta) {
        cuenta.depositar(200.0);
        cuenta.retirar(100.0);
    }

    public static void main(String[] args) {
        CuentaBancaria cuentaNormal = new CuentaBancaria(500.0);
        CuentaBancaria cuentaAhorros = new CuentaAhorros(500.0, 0.05);

        System.out.println("--- Cuenta Bancaria Base ---");
        procesarOperaciones(cuentaNormal);

        System.out.println("\n--- Cuenta de Ahorros ---");
        procesarOperaciones(cuentaAhorros);
    }
}
