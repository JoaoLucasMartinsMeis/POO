package Pratica03.Exerc14;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.setAluno("Dinho");
        System.out.println(a1.getAluno());
        a1.setNotas(8.0, 9.5, 5.0);
        a1.notasG();
        a1.media();

    }
}
