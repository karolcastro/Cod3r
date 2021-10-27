package com.pessoal.courseCoder.desafioModuloClasse;

import lombok.Getter;

@Getter
public class Pessoa {

    String nome;
    Double peso;

    public Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {

        if (comida != null) {
            this.peso += comida.peso;
        }
    }
}
