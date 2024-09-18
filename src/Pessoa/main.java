package Pessoa;

public class main {
    public static void main(String[] args) {

        idadePessoa i1 = new idadePessoa();

        i1.setIdade(19);
        System.out.println("\nIdade = " + i1.getIdade());
        i1.setNome("Gabriel Dos Exemplos");
        System.out.println("Nome = " + i1.getNome());
        i1.verificarIdade();
    }
}
