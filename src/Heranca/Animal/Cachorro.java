package Heranca.Animal;

public class Cachorro extends Animal{

    @Override
    public void nome(String nome){
        System.out.println("O cachorro se chama: " + nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au! au! au!");
    }

    public void buscarBrinquedo(){
        System.out.println("Ele corre e volta com o brinquedo");
    }
}
