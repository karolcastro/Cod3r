package com.pessoal.courseCoder.oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    private int delta = 5;

    public Carro(int VELOCIDADE_MAXIMA, int velocidadeAtual, int delta) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
        this.velocidadeAtual = velocidadeAtual;
        this.delta = delta;
    }

    protected Carro(int velocidade_maxima) {

        VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    public void acelerar() {
        if( velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta() ;
        }
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "Km/h. ";
    }
}
