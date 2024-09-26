package Pratica03.Exerc15;

public class Livro {

    String livro;
    String autor;



    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getLivro() {
        return livro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void informacoes(){
        System.out.println("Título do livro: " + livro);
        System.out.println("Autor do livro: " + autor);
    }
}
