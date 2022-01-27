package com.pessoal.courseCoder.oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void addCurso(Curso cursos) {
        this.cursos.add(cursos);
        cursos.alunos.add(this);
    }
}
