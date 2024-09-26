package Heranca.Veiculo;

public class Moto extends Veiculo{

    @Override
    public void ligar() {
        System.out.println("Ligando moto");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada");
    }
}
