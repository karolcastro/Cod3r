package com.pessoal.courseCoder.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezeaDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int result = maisDois
                .andThen(vezeaDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(result);


        int result2 = aoQuadrado
                .compose(vezeaDois)
                .compose(maisDois)
                .apply(0);

        System.out.println(result2);

    }
}
