package Heranca.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    double saldo;

    @Override
    public void depositar(double deposito) {
        System.out.println("\nQunatidade depositada: R$" + deposito);
        saldo += deposito;
    }

    @Override
    public void sacar(double saque) {
        System.out.println("Quantidade sacada: R$" + saque);
        saldo -= saque;
    }

    public void cobrarTarifa() {
        saldo -= (double) 2/100 * saldo;
    }

    @Override
    public String consultarSaldo() {
        return "Saldo atual: R$" + saldo;
    }
}

