package Heranca.Veiculo;

public abstract class Veiculo {

    public abstract void ligar();
    public abstract void desligar();

    public void mover(){
        System.out.println("O veículo está se movendo");
    }
}
