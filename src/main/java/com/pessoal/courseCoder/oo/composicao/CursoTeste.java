package com.pessoal.courseCoder.oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Caio");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Java1");
        Curso curso3 = new Curso("Java2");

        curso1.addAluno(aluno1);
        curso2.addAluno(aluno2);

        aluno1.addCurso(curso1);
        aluno2.addCurso(curso3);

        for (Aluno aluno : curso3.alunos) {
            System.out.println("Estou matriculado no curso 1...");
            System.out.println("... e meu nome é " + aluno.nome);
            System.out.println();
        }
    }
}
