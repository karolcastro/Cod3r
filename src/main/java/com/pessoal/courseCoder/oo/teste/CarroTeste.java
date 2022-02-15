package com.pessoal.courseCoder.oo.teste;

import com.pessoal.courseCoder.oo.heranca.desafio.Carro;
import com.pessoal.courseCoder.oo.heranca.desafio.Ferrari;
import com.pessoal.courseCoder.oo.heranca.desafio.Fusca;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1 = new Fusca(10);

        carro1.acelerar();
        System.out.println(carro1);

        carro1.acelerar();
        System.out.println(carro1);

        Carro carro2 = new Ferrari(400);

        carro2.acelerar();
        System.out.println();
        System.out.println(carro2);

        carro2.acelerar();
        System.out.println(carro2);

        carro2.frear();
        System.out.println(carro2);


    }
}
