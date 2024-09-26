package Heranca.Veiculo;

public class Onibus extends Veiculo {

    @Override
    public void ligar() {
        System.out.println("Ligando ônibus");
    }

    @Override
    public void desligar() {
        System.out.println("Ônibus desligado");
    }
}
