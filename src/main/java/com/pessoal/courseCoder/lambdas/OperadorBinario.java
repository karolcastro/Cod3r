package com.pessoal.courseCoder.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) ->(n1 + n2) / 2;
        System.out.println(media.apply(9.8 , 5.7));

        BiFunction<Double, Double, String> result = (n1, n2) -> ((n1 + n2) / 2) >= 7 ?"Aprovadp" : "Reprovado";

        //modelo 2
        BiFunction<Double, Double, String> result2 = (n1, n2) -> {
           double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ?"Aprovado" : "Reprovado";
        };

        System.out.println(result2.apply(9.7, 5.1));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        //composicao de funcao
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
}
