package Pratica03.Exerc12;

public class idadePessoa {

    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade(){
        if(idade >= 18){
            System.out.println(nome + " é maior de idade");
        }else{
            System.out.println(nome + " não é maior de idade");
        }
    }
}
