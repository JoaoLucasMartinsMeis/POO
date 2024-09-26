package Heranca.Animal;

public class Gato extends Animal{

    @Override
    public void nome(String nome){
        System.out.println("O gato se chama: " + nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau! Miau!");
    }

    public void brincarComArranhador(){
        System.out.println("Ele arranha e escala");
    }
}
