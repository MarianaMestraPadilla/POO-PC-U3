package Ejercicio2_T17;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso: $" + monto + " | Nuevo saldo: $" + saldo);
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso: $" + monto + " | Nuevo saldo: $" + saldo);
            return true;
        }
        System.out.println("Fondos insuficientes o monto inválido.");
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
