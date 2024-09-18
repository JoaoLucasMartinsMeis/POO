package Conta;

public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta();

        c1.setSaldo(300);
        c1.sacar(200);
        System.out.println("\nSaldo = " + c1.getSaldo());


    }
}
