package Conta;

public class Conta {

    public double saldo;

    public void sacar(double valor){
       if(saldo >= valor) {
           saldo =- valor;
       }else{
           System.out.println("Não foi possível realizar o saque");
       }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }
}
