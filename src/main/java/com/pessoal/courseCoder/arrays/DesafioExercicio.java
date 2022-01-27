package com.pessoal.courseCoder.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioExercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas você deseja informar: ? ");
        int qtdNotas = sc.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.print("Informe a nota: " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(notas));

        double total = 0.0;

        for (double nota: notas){
            total += nota;

        }

        double media = total/notas.length;
        System.out.println("A média é: " + media + "!");
        sc.close();
    }
}