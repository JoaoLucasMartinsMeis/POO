package Produto;
import java.util.Scanner;

public class Produto {

    Scanner ler = new Scanner(System.in);

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int desconto){

        while(desconto > 100){
            System.out.println("Digite quanto será o desconto (Máx. 99%");
            desconto = ler.nextInt();
            if(desconto > 100){
                System.out.println("O desconto é inválido, digite novamnete");
            }
        }
        preco =- (desconto / 100) * preco;
    }
}
