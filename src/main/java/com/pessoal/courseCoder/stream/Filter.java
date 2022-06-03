package com.pessoal.courseCoder.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.8);
        Aluno aluno2 = new Aluno("Bia", 6.8);
        Aluno aluno3 = new Aluno("Gui", 9.8);
        Aluno aluno4 = new Aluno("Pedro", 8.8);
        Aluno aluno5 = new Aluno("Lara", 5.8);
        Aluno aluno6 = new Aluno("Lucas", 4.8);

        List<Aluno> aluno = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);
        Consumer<String> print = System.out::println;

        Predicate<Aluno> aprovado = a -> a.nota >=7;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabéns! " + a.nome + ", você foi aprovado! ";

        //filtrar somente os alunos que foram aprovados com nota acima de 7 com mensagem Parabens!

        aluno.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(print);
    }
}
