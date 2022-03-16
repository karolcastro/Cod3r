package com.pessoal.courseCoder.lambdas.calculos;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> calculos = (x, y) -> { return x + y; };
        System.out.println(calculos.apply(2.0, 3.0));

        calculos = (x, y) ->  x + y;
        System.out.println(calculos.apply(2.0, 3.0));

    }
}
