package com.pessoal.courseCoder.arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.0;
        notasAlunoA[1] = 8.2;
        notasAlunoA[2] = 3.5;


        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i =0; i < notasAlunoA.length; i++) {
            total+= notasAlunoA[i];
        }
        System.out.println(total/notasAlunoA.length);

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        for (int i =0; i < notasAlunoB.length; i++) {
            total+= notasAlunoB[i];
        }

        System.out.println(Arrays.toString(notasAlunoB));
        System.out.println(total/notasAlunoB.length);
        System.out.println(notasAlunoB[0]);

    }
}