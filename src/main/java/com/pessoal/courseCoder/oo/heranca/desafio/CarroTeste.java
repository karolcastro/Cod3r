package com.pessoal.courseCoder.oo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1 = new Fusca();

        carro1.acelerar();
        carro1.acelerar();

        System.out.println(carro1);

        Carro carro2 = new Ferrari();

        carro2.acelerar();
        carro2.acelerar();
        carro2.frear();

        System.out.println(carro2);
    }
}
