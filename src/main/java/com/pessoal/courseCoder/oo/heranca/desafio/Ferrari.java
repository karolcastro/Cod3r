package com.pessoal.courseCoder.oo.heranca.desafio;

public class Ferrari extends Carro {

    public Ferrari() {
        this(315);
    }
    public Ferrari(int velocidade_maxima) {
        super(velocidade_maxima);
        delta = 350;
    }

}
