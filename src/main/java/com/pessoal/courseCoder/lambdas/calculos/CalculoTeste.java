package com.pessoal.courseCoder.lambdas.calculos;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo calculos =  new Somar();
        System.out.println(calculos.executar(2,3));

        calculos = new Multiplicar();
        System.out.println(calculos.executar(2,3));


    }
}
