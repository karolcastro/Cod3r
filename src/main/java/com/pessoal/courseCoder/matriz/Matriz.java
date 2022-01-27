package com.pessoal.courseCoder.matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos você deseja informar ? ");
        int qtdAlunos = sc.nextInt();

        System.out.print("Quantas notas por aluno ? ");
        int qtdNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++){

                System.out.printf("Informe a nota %d do aluno %d :", j +1, i+1);
                notasDaTurma[i][j] = sc.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total/ (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é: " + media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        sc.close();
    }
}