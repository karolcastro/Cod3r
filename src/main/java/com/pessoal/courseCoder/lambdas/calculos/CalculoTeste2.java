package com.pessoal.courseCoder.lambdas.calculos;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo calculos = (x, y) -> { return x + y; };

        System.out.println(calculos.executar(2, 3));
    }
}
