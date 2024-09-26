package Pratica03.Exerc14;

import java.util.Scanner;

public class Aluno {

    String aluno;
    double notas;
    double notas1;
    double notas2;
    double notas3;
    double mediaNotas;

    public String getAluno() {
        return "\n" + aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setNotas(double n1, double n2, double n3) {
        this.notas1 = n1;
        this.notas2 = n2;
        this.notas3 = n3;
        notas = n1 + n2 + n3;
    }

    public void notasG() {
        System.out.println("\nNota 1 = " + notas1);
        System.out.println("Nota 2 = " + notas2);
        System.out.println("Nota 3 = " + notas3);
    }

    public void media(){
        mediaNotas = notas / 3;
        System.out.println("\nMédia das notas: " + mediaNotas);
    }
}
