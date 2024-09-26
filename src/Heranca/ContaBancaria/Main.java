package Heranca.ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();

        c1.depositar(4000.00);
        c1.sacar(300.00);
        c1.cobrarTarifa();
        System.out.println(c1.consultarSaldo());
    }
}
