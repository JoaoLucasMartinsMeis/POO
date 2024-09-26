package Heranca.Veiculo;
//para fazer herança, se usa a palavra extends

public class Carro extends Veiculo {

    @Override
    public void ligar() {
        System.out.println("Ligando o carro");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
    }
}
