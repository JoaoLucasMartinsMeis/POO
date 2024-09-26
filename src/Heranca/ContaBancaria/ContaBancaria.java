package Heranca.ContaBancaria;

public abstract class ContaBancaria {

    public abstract void depositar(double deposito);
    public abstract void sacar(double saque);
    public abstract String consultarSaldo();
}
